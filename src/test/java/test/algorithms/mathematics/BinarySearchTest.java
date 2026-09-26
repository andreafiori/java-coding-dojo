package test.algorithms.mathematics;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import com.algorithms.mathematics.BinarySearch;

public class BinarySearchTest {

	int[] input = { 2, 4, 6, 8, 10, 12, 14, 16 };

	@Test
	public void testBinSearchToBeTrue() {
        assertTrue( BinarySearch.checkElement(input, 2) != -1 );
	}
	
	@Test
	public void testBinSearchToBeFalse() {
        assertFalse( BinarySearch.checkElement(input, 3) != -1 );
	}
}
