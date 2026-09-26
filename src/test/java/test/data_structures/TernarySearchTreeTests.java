package test.data_structures;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.Test;

import com.data_structures.TernarySearchTree;
import test.data_structures.common.JavaCollectionTest;
import test.data_structures.common.TreeTest;
import test.data_structures.common.Utils;
import test.data_structures.common.Utils.TestData;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class TernarySearchTreeTests {

    @Test
    public void test1() {
        final List<String> tests = new ArrayList<String>();
        tests.add("BEE");
        tests.add("BEEN");
        tests.add("BEAST");
        tests.add("BELOW");
        tests.add("BEFORE");
        tests.add("BUT");
        tests.add("CAT");
        tests.add("BE");
        tests.add("B");
        tests.add("DAD");
        tests.add("APPLE");

        final TernarySearchTree<String> bst = new TernarySearchTree<String>();

        // Add
        bst.add(null);
        bst.add("");
        for (String s : tests)
            bst.add(s);
        bst.add(null);
        bst.add("");
        assertFalse(bst.add("BE"));

        // contains
        assertFalse(bst.contains(null));
        assertFalse(bst.contains(""));

        for (String s : tests)
            assertTrue(bst.contains(s));

        assertFalse(bst.contains(null));
        assertFalse(bst.contains(""));

        // remove
        assertTrue(bst.remove(null)==null);
        assertTrue(bst.remove("")==null);

        for (String s : tests)
            assertTrue(bst.remove(s)!=null);

        assertTrue(bst.remove(null)==null);
        assertTrue(bst.remove("")==null);
    }

    @Test
    public void testTernary() {
        TestData data = Utils.generateTestData(1000);

        String bstName = "TernarySearchTreeTests";
        TernarySearchTree<String> bst = new TernarySearchTree<String>();
        Collection<String> bstCollection = bst.toCollection();

        assertTrue(TreeTest.testTree(bst, String.class, bstName,
                                     data.unsorted, data.invalid));
        assertTrue(JavaCollectionTest.testCollection(bstCollection, String.class, bstName,
                                                     data.unsorted, data.sorted, data.invalid));
    }
}
