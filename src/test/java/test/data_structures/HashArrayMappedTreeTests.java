package test.data_structures;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.data_structures.HashArrayMappedTrie;
import test.data_structures.common.JavaMapTest;
import test.data_structures.common.MapTest;
import test.data_structures.common.Utils;
import test.data_structures.common.Utils.TestData;

public class HashArrayMappedTreeTests {

    @Test
    public void testHAMT() {
        TestData data = Utils.generateTestData(1000);

        String mapName = "HAMT";
        HashArrayMappedTrie<Integer,String> map = new HashArrayMappedTrie<Integer,String>();
        java.util.Map<Integer,String> jMap = map.toMap();

        assertTrue(MapTest.testMap(map, Integer.class, mapName,
                                   data.unsorted, data.invalid));
        assertTrue(JavaMapTest.testJavaMap(jMap, Integer.class, mapName,
                                           data.unsorted, data.sorted, data.invalid));
    }
}
