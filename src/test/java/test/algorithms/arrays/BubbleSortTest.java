package test.algorithms.arrays;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

import com.algorithms.arrays.BubbleSort;

public class BubbleSortTest {

	@Test
	public void testFirstSort() {
		int[] sorted = BubbleSort.sort(new int[] { 20, 12, 45, 19, 91, 55 });

		assertEquals("[12, 19, 20, 45, 55, 91]", Arrays.toString(sorted));
	}

	@Test
	public void testSortWithNegativeNumber() {
		int[] sorted = BubbleSort.sort(new int[] { -1, 0, 1 });
		
		assertEquals("[-1, 0, 1]", Arrays.toString(sorted));
	}

	@Test
	public void testSortWith2NegativeNumbers() {
		int[] sorted = BubbleSort.sort(new int[] { -3, -9, -2, -1 });
		
		assertEquals("[-9, -3, -2, -1]", Arrays.toString(sorted));
	}
	
	@Test
	public void testSortImproved() {
		String[] unsorted = {"Ada", "C++", "Lisp", "Java", "Scala"};
		String[] sorted = BubbleSort.sortImproved(unsorted);
		
		assertEquals("[Ada, C++, Java, Lisp, Scala]", Arrays.toString(sorted));
	}
}
