package test.data_structures;

import static org.junit.Assert.assertTrue;

import java.util.Collection;

import org.junit.Test;

import  com.data_structures.PatriciaTrie;
import  test.data_structures.common.JavaCollectionTest;
import  test.data_structures.common.TreeTest;
import  test.data_structures.common.Utils;
import  test.data_structures.common.Utils.TestData;

public class PatriciaTreeTests {

    @Test
    public void testPatriciaTrie() {
        TestData data = Utils.generateTestData(1000);

        String bstName = "PatriciaTrie";
        PatriciaTrie<String> bst = new PatriciaTrie<String>();
        Collection<String> bstCollection = bst.toCollection();

        assertTrue(TreeTest.testTree(bst, String.class, bstName,
                                     data.unsorted, data.invalid));
        assertTrue(JavaCollectionTest.testCollection(bstCollection, String.class, bstName,
                                                     data.unsorted, data.sorted, data.invalid));
    }
}
