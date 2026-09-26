package test.data_structures;

import static org.junit.Assert.assertTrue;

import java.util.Collection;

import org.junit.Test;

import com.data_structures.BTree;
import test.data_structures.common.JavaCollectionTest;
import test.data_structures.common.TreeTest;
import test.data_structures.common.Utils;
import test.data_structures.common.Utils.TestData;

public class BTreeTests {

    @Test
    public void testBTree() {
        TestData data = Utils.generateTestData(1000);

        String bstName = "B-Tree";
        BTree<Integer> bst = new BTree<Integer>(2);
        Collection<Integer> bstCollection = bst.toCollection();

        assertTrue(TreeTest.testTree(bst, Integer.class, bstName, data.unsorted, data.invalid));
        assertTrue(JavaCollectionTest.testCollection(bstCollection, Integer.class, bstName,
                                                     data.unsorted, data.sorted, data.invalid));
    }
}
