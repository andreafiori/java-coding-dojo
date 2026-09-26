package test.algorithms.strings;

import org.junit.Test;
import java.util.*;
import static org.junit.Assert.assertEquals;
import com.algorithms.strings.LongestStringAfterCharacterDelete;

public class LongestStringAfterCharacterDeleteTest
{
    @Test
    public void testLongestStringAfterCharacterDelete()
    {
        List<String> dict = new ArrayList<String>();
        dict.add("ale");
        dict.add("applee");
        dict.add("monkey");
        dict.add("plea");
        String input = "abpcpleeaDChsssgtrsssmonkey";

        LongestStringAfterCharacterDelete ls = new LongestStringAfterCharacterDelete();

        List<String> dictExpected = new ArrayList<String>();
        dictExpected.add("monkey");
        dictExpected.add("applee");

        assertEquals(ls.findLongestString(dict, input), dictExpected);
    }
}
