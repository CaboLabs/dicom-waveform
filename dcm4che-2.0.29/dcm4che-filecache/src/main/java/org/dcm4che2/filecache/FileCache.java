/* ***** BEGIN LICENSE BLOCK *****
 * Version: MPL 1.1/GPL 2.0/LGPL 2.1
 *
 * The contents of this file are subject to the Mozilla Public License Version
 * 1.1 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * http://www.mozilla.org/MPL/
 *
 * Software distributed under the License is distributed on an "AS IS" basis,
 * WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
 * for the specific language governing rights and limitations under the
 * License.
 *
 * The Original Code is part of dcm4che, an implementation of DICOM(TM) in
 * Java(TM), available at http://sourceforge.net/projects/dcm4che.
 *
 * The Initial Developer of the Original Code is
 * Agfa HealthCare.
 * Portions created by the Initial Developer are Copyright (C) 2006-2008
 * the Initial Developer. All Rights Reserved.
 *
 * Contributor(s):
 * See listed authors below.
 *
 * Alternatively, the contents of this file may be used under the terms of
 * either the GNU General Public License Version 2 or later (the "GPL"), or
 * the GNU Lesser General Public License Version 2.1 or later (the "LGPL"),
 * in which case the provisions of the GPL or the LGPL are applicable instead
 * of those above. If you wish to allow use of your version of this file only
 * under the terms of either the GPL or the LGPL, and not to allow others to
 * use your version of this file under the terms of the MPL, indicate your
 * decision by deleting the provisions above and replace them with the notice
 * and other provisions required by the GPL or the LGPL. If you do not delete
 * the provisions above, a recipient may use your version of this file under
 * the terms of any one of the MPL, the GPL or the LGPL.
 *
 * ***** END LICENSE BLOCK ***** */
package org.dcm4che2.filecache;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Gunter Zeilinger <gunterze@gmail.com>
 * @version $Revision$ $Date$
 * @since Mar 4, 2009
 */
public class FileCache {

    private static final String ZZZFREE_IS_RUNNING = "ZZZFreeIsRunning";
    private static final String DEFAULT_JOURNAL_FILE_PATH_PATTERN =
            "yyyy/MM/dd/HH";
    private static final String MINUTE_PATTERN = "mm";
    private static final Logger log = 
            LoggerFactory.getLogger(FileCache.class);

    private File journalRootDir;
    private File cacheRootDir;
    private File freeZZZFile;
    // journalFileName should differ for multiple FileCache instances
    // inside one and across multiple JVMs
    private String journalFileName = (hashCode() & 0xFFFFFFFFL) + "-"
            + ManagementFactory.getRuntimeMXBean().getName();

    private SimpleDateFormat journalFilePathFormat =
            new SimpleDateFormat(DEFAULT_JOURNAL_FILE_PATH_PATTERN);
    
    private int minutesPerJournal = 0;
    
    private boolean freeIsRunning = false;
    private long maximumFreeTime = 3600000; // 1 hour
    // 0 means don't check how many files are in the cache root, which means that too many should not be created.
    private int maxFilesInCacheRoot = 0;

    public File getJournalRootDir() {
        return journalRootDir;
    }

    /** Sets the journal directory to store information about newly created files.
     * @param journalRootDir
     */
    public void setJournalRootDir(File journalRootDir) {
        if (journalRootDir != null) {
            assertWritableDiretory(journalRootDir);
        }
        this.journalRootDir = journalRootDir;

    }


    public String getJournalFileName() {
        return journalFileName;
    }

    public void setJournalFileName(String journalFileName) {
        this.journalFileName = journalFileName;
    }

    public File getCacheRootDir() {
        return cacheRootDir;
    }

    public void setCacheRootDir(File cacheRootDir) {
        if (cacheRootDir != null) {
            assertWritableDiretory(cacheRootDir);
        }
        this.cacheRootDir = cacheRootDir;
    }

    private static void assertWritableDiretory(File dir) {
        mkdirs(dir);
        if (!dir.isDirectory() || !dir.canWrite()) {
            throw new IllegalArgumentException(
                    "Not a writable directory:" + dir);
        }
    }

    public String getJournalFilePathFormat() {
        return journalFilePathFormat.toPattern();
    }

    public void setJournalFilePathFormat(String format) {
        if (minutesPerJournal > 0 && !format.endsWith(MINUTE_PATTERN)) {
            format += MINUTE_PATTERN;
        }
        this.journalFilePathFormat = new SimpleDateFormat(format);
    }

    public int getMinutesPerJournal() {
        return minutesPerJournal;
    }

    public void setMinutesPerJournal(int minutesPerJournal) {
        this.minutesPerJournal = minutesPerJournal > 59 ? 0 : minutesPerJournal;
        if (this.minutesPerJournal > 0 && !journalFilePathFormat.toPattern().endsWith(MINUTE_PATTERN) ) {
            journalFilePathFormat = new SimpleDateFormat(journalFilePathFormat.toPattern()+MINUTE_PATTERN);
        }
    }

    /** Finds the date of the oldest journal file */
    public Date findOldestJournalDate() throws IOException {
        return findOldestJournalDate(journalRootDir);
    }

    private Date findOldestJournalDate(File dir) {
        String[] fnames = dir.list();
        if (fnames == null || fnames.length == 0) {
            try {
                return getJournalDate(dir);
            } catch (Exception e) {
                return null;
            }
        }

        Arrays.sort(fnames);
        for (String fname : fnames) {
            File subdir = new File(dir, fname);
            Date d = findOldestJournalDate(subdir);
            if( d!=null ) return d;
        }
        return null;
    }

    /** Record a newly created file in the journaling cache, (default instance) */
    public void record(File f) throws IOException {
        record(f, false);
    }

    /** Record a file in the journaling cache, touching it to update the timestamp if update is true. */
    public synchronized void record(File f, boolean update)
            throws IOException {
        String path = f.getAbsolutePath().substring(
                cacheRootDir.getAbsolutePath().length() + 1);
        long time = System.currentTimeMillis();
        File journalDir = getJournalDirectory(time);
        File journalFile = new File(journalDir, journalFileName);
        if (journalFile.exists()) {
            if (update && journalDir.equals(getJournalDirectory(f.lastModified()))) {
                log.debug("{} already contains entry for {}", journalFile, f);
                return;
            }
            log.debug("M-UPDATE {}", journalFile);
        } else {
            mkdirs(journalFile.getParentFile());
            log.debug("M-WRITE {}", journalFile);
        }
        FileWriter journal = new FileWriter(journalFile, true);
        try {
            journal.write(path + '\n');
        } finally {
            journal.close();
        }
        f.setLastModified(time);
        checkMaxFilesInCacheRoot();
    }
    
    public void checkMaxFilesInCacheRoot() {
    	if( maxFilesInCacheRoot<=0 ) return;
        String[] cachedFiles = cacheRootDir.list();
        if ( cachedFiles == null ) {
            log.warn("Cache root dir "+cacheRootDir+" is not readable or contains too many files! Can not free cache! Please correct this issue manually.");
         } else if (cachedFiles.length > maxFilesInCacheRoot) {
             log.info("Maximum number of files ("+maxFilesInCacheRoot+") in cacheRoot ("+cacheRootDir+")reached! Delete old files");
            new Thread(new Runnable() {
                public void run() {
                    try {
                        free(Integer.MAX_VALUE);
                        log.info("Delete finished! Current number of Files in cache root:"+cacheRootDir.list().length);
                    } catch (IOException e) {
                        log.error(e.getMessage(), e);
                    }
                }
            }).start();
         }
    }

    private static void mkdirs(File dir) {
        if (dir.mkdirs()) {
            log.info("M-WRITE {}", dir);
        }
    }

    private synchronized File getJournalDirectory(long time) {
        Calendar cal = Calendar.getInstance();
        cal.setTimeInMillis(time);
        if (minutesPerJournal > 0) {
            cal.set(Calendar.MINUTE, cal.get(Calendar.MINUTE) / minutesPerJournal * minutesPerJournal);
        }
        return new File(journalRootDir, journalFilePathFormat.format(cal.getTime()));
    }

    public synchronized Date getJournalDate(File dir) throws IOException {
        if( dir.isFile() ) dir = dir.getParentFile();
        String sDir = dir.getCanonicalPath();
        String prefix = journalRootDir.getCanonicalPath();
        sDir = sDir.substring(prefix.length()+1);
        sDir = sDir.replace('\\', '/');
        try {
            return journalFilePathFormat.parse(sDir);
        } catch(ParseException e) {
            log.warn("Can't parse {}", dir);
            throw new IllegalArgumentException(e);
        }
    }

    /** Return true if the free is running file was created, or is very old.   Create
     * a free is running file to prevent other instances from freeing at the same time.
     */
    protected boolean multiProcessFreeIsRunningFile() {        
        try {
            File zzzFreeIsRunning = getFreeZZZFile();
            if (zzzFreeIsRunning.createNewFile()) {
                return true;
            }
            log.debug("ZZZFreeIsRunning file already exists! Check if maximumFreeTime is reached.");
            long l = System.currentTimeMillis() - zzzFreeIsRunning.lastModified();
            if (l > maximumFreeTime) {
                if( zzzFreeIsRunning.delete() && zzzFreeIsRunning.createNewFile()) {
                    log.debug("Start new free job after maximumFreeTime is reached!");
                    return true;
                }
            }
            log.debug("Current free job already runs since {} ms! maximumFreeTime={}", l, maximumFreeTime);
        } catch (IOException e) {
            log.warn("Could not create/delete the free is running file ZZZFreeIsRunning",e);
        }
        return false;
    }

    /** Gets the maximum free time that a free should take, before another process can assume it is failed/gone, in ms 
     * Default: 1 hour.
     */
    public long getMaximumFreeTime() {
        return maximumFreeTime;
    }

    public void setMaximumFreeTime(long maximumFreeTime) {
        if (maximumFreeTime <= 0L) {
            throw new IllegalArgumentException(
                    "maximumFreeTime <= 0 : " + maximumFreeTime);
        }
        this.maximumFreeTime = maximumFreeTime;
    }

    public int getMaxFilesInCacheRoot() {
        return maxFilesInCacheRoot;
    }

    public void setMaxFilesInCacheRoot(int maxFilesInCacheRoot) {
        this.maxFilesInCacheRoot = maxFilesInCacheRoot;
    }

    /** Free at least the indicated number of bytes from the filesystem, using an LRU algorithm */
    public long free(long size) throws IOException {
        synchronized (this) {
            if (freeIsRunning) {
                log.debug("Free is already running on {}!", this.cacheRootDir);
                return -1L;
            }
            freeIsRunning = multiProcessFreeIsRunningFile();
            if( !freeIsRunning ) {
                return -1L;
            }
        }
        try {
            return free(size, journalRootDir,true);
        } finally {
            freeIsRunning = false;
            getFreeZZZFile().delete();
        }
    }

    /** Delete everything in the cache */
    public void clearCache() {
        deleteFilesOrDirectories(journalRootDir.listFiles());
        deleteFilesOrDirectories(cacheRootDir.listFiles());
    }

    public boolean isEmpty() {
        return cacheRootDir.list().length == 0;
    }

    public static void deleteFilesOrDirectories(File[] files) {
        if (files != null) {
            for (File f : files) {
                deleteFileOrDirectory(f);
            }
        }
    }

    public static boolean deleteFileOrDirectory(File f) {
        if (f.isDirectory()) {
            deleteFilesOrDirectories(f.listFiles());
        }
        if (!f.delete()) {
            log.warn("Failed to delete {}", f);
            return false;
        }
        log.info("M-DELETE {}", f);
        return true;
    }

    private long free(long size, File dir, boolean endMost) throws IOException {
        long free = 0L;
        if (dir.isDirectory()) {
            String[] fnames = dir.list();
            if (fnames == null) {
                log.warn("Directory "+dir+" not readable! Skipped.");   
            } else {
                Arrays.sort(fnames); 
                int i=fnames.length;
                for (String fname : fnames) {            	
                    free += free(size - free, new File(dir, fname), endMost && (i--<2));
                    if (free >= size) {
                        break;
                    }
                }
            }
        } else {
            if(endMost) {
                log.warn("Got to the last (current) journal system without being able to clean up enough space, not cleaning current journal to prevent race condition.");
                return 0L;
            }
            BufferedReader journal = new BufferedReader(new FileReader(dir));
            boolean deleteJournalFile = true;
            try {
                String path;
                while ((path = journal.readLine()) != null) {
                    File f = new File(cacheRootDir, path);
                    if (!f.exists()) {
                        log.debug("{} already deleted", f);
                        continue;
                    }
                    if (getJournalDirectory(f.lastModified()).compareTo(dir.getParentFile()) > 0) {
                        log.debug("{} was accessed after record in {}",
                                f, dir);
                        continue;
                    }
                    long flen = sizeOfFileOrDirectory(f);
                    if (deleteFileAndParents(f, cacheRootDir)) {
                        free += flen;
                    } else {
                        deleteJournalFile = false;
                    }
                }
            } finally {
                journal.close();
            }
            if (deleteJournalFile) {
                deleteFileAndParents(dir, journalRootDir);
            } else {
                log.warn("Do not delete journal file {}! Deletion of one ore more referenced files was not successful.", dir );
            }
        }
        return free;
    }

    public static long sizeOfFileOrDirectory(File f) {
        if (f.isFile()) {
            return f.length();
        }
        long size = 0;
        File[] files = f.listFiles();
        if (files != null) {
            for (int i = 0; i < files.length; i++) {
                size += sizeOfFileOrDirectory(files[i]);
            }
        }
        return size;
    }

    public static boolean deleteFileAndParents(File f, File baseDir) {
        if (!deleteFileOrDirectory(f)) {
            return false;
        }
        File dir = f.getParentFile();
        while (!dir.equals(baseDir)) {
            if (!dir.delete()) {
                break;
            }
            log.info("M-DELETE {}", dir);
            dir = dir.getParentFile();
        }
        return true;
    }

    private synchronized File getFreeZZZFile()throws IOException{
        if(freeZZZFile==null){
            freeZZZFile = new File(this.cacheRootDir,ZZZFREE_IS_RUNNING);    		
        }
        return freeZZZFile;
    }
}
