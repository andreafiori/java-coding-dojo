package test.data_structures;

import static org.junit.Assert.assertTrue;

import java.util.Collection;

import org.junit.Test;

import com.data_structures.BinarySearchTree;
import com.data_structures.Treap;
import test.data_structures.common.JavaCollectionTest;
import test.data_structures.common.TreeTest;
import test.data_structures.common.Utils;
import test.data_structures.common.Utils.TestData;

public class TreapTests {

    @Test
    public void testTreap() {
        TestData data = Utils.generateTestData(1000);

        String bstName = "Treap";
        BinarySearchTree<Integer> bst = new Treap<Integer>();
        Collection<Integer> bstCollection = bst.toCollection();

        assertTrue(TreeTest.testTree(bst, Integer.class, bstName,
                                     data.unsorted, data.invalid));
        assertTrue(JavaCollectionTest.testCollection(bstCollection, Integer.class, bstName,
                                                     data.unsorted, data.sorted, data.invalid));
    }
}
