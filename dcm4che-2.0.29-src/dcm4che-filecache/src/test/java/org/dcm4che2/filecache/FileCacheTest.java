package org.dcm4che2.filecache;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.junit.Test;

public class FileCacheTest {

    @SuppressWarnings("deprecation")
    private static final Date DATE = new Date(113,0,5,15,0);
    
    @Test
    public void testJournalDate() throws IOException {
        FileCache fc = new FileCache();
        fc.setCacheRootDir(new File("/tmp/wado2cache"));
        fc.setJournalRootDir(new File("/tmp/wado2cache/Journal"));
        File f1 = new File("/tmp/wado2cache/Journal/2013/01/05/15");
        f1.mkdirs();
        Date d = fc.getJournalDate(f1);
        assertEquals("Dates should be the same", DATE, d);
    }

    @Test
    public void testJournalOldestDate() throws IOException {
        FileCache fc = new FileCache();
        fc.setCacheRootDir(new File("/tmp/wado2cache"));
        fc.setJournalRootDir(new File("/tmp/wado2cache/Journal"));
        File f1 = new File("/tmp/wado2cache/Journal/2013/01/05/15");
        f1.mkdirs();
        Date d = fc.findOldestJournalDate();
        assertTrue("Should find a date no newer than the test directory date of 2013-01-05 15", d.compareTo(DATE)<=0);
    }
}
