package test.algorithms.arrays;

import org.junit.Test;
import com.algorithms.arrays.ArrayHelper;

import static org.junit.Assert.assertArrayEquals;

public class ArrayHelperTest
{
    @Test
    public void testPush()
    {
        String[] items = new String[]{"a", "b", "c"};

        items = ArrayHelper.push(items, "d");
        items = ArrayHelper.push(items, "e");
        //

        String[] expected = new String[]{"a", "b", "c", "d", "e"};

        assertArrayEquals(items, expected);
    }

    @Test
    public void testPop()
    {
        String[] items = new String[]{"a", "b", "c"};
        items = ArrayHelper.pop(items);

        String[] expected = new String[]{"a", "b"};

        assertArrayEquals(items, expected);
    }
}
