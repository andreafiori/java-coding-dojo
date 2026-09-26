package test.data_structures;

import static org.junit.Assert.assertTrue;

import java.util.Collection;

import org.junit.Test;

import com.data_structures.Trie;
import test.data_structures.common.JavaCollectionTest;
import test.data_structures.common.TreeTest;
import test.data_structures.common.Utils;
import test.data_structures.common.Utils.TestData;

public class TrieTests {

    @Test
    public void testTrie() {
        TestData data = Utils.generateTestData(1000);

        String bstName = "Trie";
        Trie<String> bst = new Trie<String>();
        Collection<String> bstCollection = bst.toCollection();

        assertTrue(TreeTest.testTree(bst, String.class, bstName,
                                     data.unsorted, data.invalid));
        assertTrue(JavaCollectionTest.testCollection(bstCollection, String.class, bstName,
                                                     data.unsorted, data.sorted, data.invalid));
    }
}
