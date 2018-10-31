package org.dcm4che2.data;

import java.util.Iterator;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class CombineDicomObjectTest extends TestCase {
	DicomObject ds1 = new BasicDicomObject();
	DicomObject ds2 = new BasicDicomObject();
	CombineDicomObject cdo = new CombineDicomObject(ds1,ds2);
	
    public static void main(java.lang.String[] args) {
        junit.textui.TestRunner.run(suite());
    }

    public CombineDicomObjectTest(String name) {
    	super(name);
    	ds1.putInt(Tag.NumberOfStudyRelatedInstances, null, 1);
    	ds2.putInt(Tag.NumberOfStudyRelatedInstances, null, 2);
    	ds1.putInt(Tag.NumberOfStudyRelatedSeries, null, 1);
    	ds2.putInt(Tag.NumberOfSeriesRelatedInstances, null, 2);
    }
    
    public static Test suite() {
        return new TestSuite(CombineDicomObjectTest.class);
    }

    public void testCombineGet() {
    	assertEquals(1,cdo.getInt(Tag.NumberOfStudyRelatedInstances));
    	assertEquals(1,cdo.getInt(Tag.NumberOfStudyRelatedSeries));
    	assertEquals(2,cdo.getInt(Tag.NumberOfSeriesRelatedInstances));
    }

    public void testIterator() {
    	Iterator<DicomElement> it = cdo.iterator();
    	assertNotNull(it);
    	assertTrue(it.hasNext());
    	DicomElement de = it.next();
    	assertEquals(Tag.NumberOfStudyRelatedSeries, de.tag());
    	assertEquals(1,de.getInt(false));
    	
    	de = it.next();
    	assertEquals(Tag.NumberOfStudyRelatedInstances, de.tag());
    	assertEquals(1,de.getInt(false));
    	
    	de = it.next();
    	assertEquals(Tag.NumberOfSeriesRelatedInstances, de.tag());
    	assertEquals(2,de.getInt(false));
    	
    	assertFalse(it.hasNext());
    }

    public void testCombineContains() {
    	assertTrue(cdo.contains(Tag.NumberOfStudyRelatedInstances));
    	assertTrue(cdo.contains(Tag.NumberOfStudyRelatedSeries));
    	assertTrue(cdo.contains(Tag.NumberOfSeriesRelatedInstances));
    }
    
    
    public void testPrivateTagHandling() {
		String creator1 = "Private Creator 1.0";
		String creator2 = "Other Private Creator";

		int creatorTag = 0x00290010;

		int tag2 = ds2.resolveTag(creatorTag,creator2,true);
		ds2.putString(tag2,VR.LO,"Value2");

		int tag = cdo.resolveTag(creatorTag,creator1, true);

		assertNull("Must not read the value of the other creator",cdo.getString(tag));
		assertFalse("The private creators must be separate",cdo.contains(tag));

    }

}
