package test.data_structures;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.data_structures.TreeMap;
import test.data_structures.common.JavaMapTest;
import test.data_structures.common.MapTest;
import test.data_structures.common.Utils;
import test.data_structures.common.Utils.TestData;

public class TreeMapTests {

    @Test
    public void testTreeMap() {
        TestData data = Utils.generateTestData(1000);

        String mapName = "TreeMap";
        TreeMap<String,Integer> map = new TreeMap<String,Integer>();
        java.util.Map<String,Integer> jMap = map.toMap();

        assertTrue(MapTest.testMap(map, String.class, mapName,
                                   data.unsorted, data.invalid));
        assertTrue(JavaMapTest.testJavaMap(jMap, Integer.class, mapName,
                                           data.unsorted, data.sorted, data.invalid));
    }
}
