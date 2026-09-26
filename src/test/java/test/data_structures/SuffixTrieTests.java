package test.data_structures;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.data_structures.SuffixTrie;
import test.data_structures.common.SuffixTreeTest;

public class SuffixTrieTests {

    @Test
    public void testSuffixTrie()
    {
        String bookkeeper = "bookkeeper";
        SuffixTrie<String> trie = new SuffixTrie<String>(bookkeeper);

        assertTrue(SuffixTreeTest.suffixTreeTest(trie, bookkeeper));
    }
}
