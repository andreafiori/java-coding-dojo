package test.algorithms.arrays;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;
import org.junit.Test;
import com.algorithms.arrays.ReverseArrays;

public class ReverseArraysTest {
	
	@Test
	public void testInsertionSort() {
		Integer[] array = {19, 23, 31};
		Integer[] arrayReversed = ReverseArrays.reverseInPlace(array);

		assertEquals("[31, 23, 19]", Arrays.toString(arrayReversed));
	}

	@Test
	public void testReverseArrayList() {
		String[] typesOfInsurance = {"Life", "Car", "Health"};
		String[] reversed = ReverseArrays.reverseArrayList(typesOfInsurance);

		assertEquals("[Health, Car, Life]", Arrays.toString(reversed));
	}
	
	@Test
	public void testReverse() {
		String[] typesOfInsurance = {"Life", "Car", "Health"};
		ArrayUtils.reverse(typesOfInsurance);

		assertEquals("[Health, Car, Life]", Arrays.toString(typesOfInsurance));
	}

}
