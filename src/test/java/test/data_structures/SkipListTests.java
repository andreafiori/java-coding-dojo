package test.data_structures;

import static org.junit.Assert.assertTrue;

import java.util.Collection;

import org.junit.Test;

import  com.data_structures.SkipList;
import  test.data_structures.common.JavaCollectionTest;
import  test.data_structures.common.SetTest;
import  test.data_structures.common.Utils;
import  test.data_structures.common.Utils.TestData;

public class SkipListTests {

    @Test
    public void testSkipList() {
        TestData data = Utils.generateTestData(1000);

        String sName = "SkipList";
        SkipList<Integer> sList = new SkipList<Integer>();
        Collection<Integer> lCollection = sList.toCollection();

        assertTrue(SetTest.testSet(sList, sName,
                                   data.unsorted, data.invalid));
        assertTrue(JavaCollectionTest.testCollection(lCollection, Integer.class, sName,
                                                     data.unsorted, data.sorted, data.invalid));
    }
}
