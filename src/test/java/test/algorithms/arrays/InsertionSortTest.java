package test.algorithms.arrays;

import java.util.Arrays;
import static org.junit.Assert.assertEquals;
import com.algorithms.arrays.InsertionSort;
import org.junit.Test;

/**
 * Insertion Sort Test
 */
public class InsertionSortTest {

	int[] unsorted = { 32, 23, 45, 87, 92, 31, 19 };

	@Test
	public void testInsertionSort() {
		InsertionSort.sort(unsorted);

		assertEquals("[19, 23, 31, 32, 45, 87, 92]", Arrays.toString(unsorted));
	}

}
