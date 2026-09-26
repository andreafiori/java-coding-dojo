package test.data_structures;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.data_structures.SuffixTree;
import test.data_structures.common.SuffixTreeTest;

public class SuffixTreeTests
{
    @Test
    public void testSuffixTree() {
        String bookkeeper = "bookkeeper";
        SuffixTree<String> tree = new SuffixTree<String>(bookkeeper);

        assertTrue(SuffixTreeTest.suffixTreeTest(tree, bookkeeper));
    }
}
