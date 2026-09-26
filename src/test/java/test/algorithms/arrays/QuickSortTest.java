package test.algorithms.arrays;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.Arrays;
import com.algorithms.arrays.QuickSort;

public class QuickSortTest {

	int[] unsorted = { 6, 5, 3, 1, 8, 7, 2, 4 };

	@Test
	public void testSortInputToString() {
		assertEquals("[6, 5, 3, 1, 8, 7, 2, 4]", Arrays.toString(unsorted));
	}

	@Test
	public void testSort() {
		QuickSort algorithm = new QuickSort();
		algorithm.sort(unsorted);

		assertEquals("[1, 2, 3, 4, 5, 6, 7, 8]", Arrays.toString(unsorted));
	}

}
