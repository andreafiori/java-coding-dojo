package test.algorithms.mathematics;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.algorithms.mathematics.CheckSumFiveNumbers;

import java.util.Arrays;

public class CheckSumFiveNumbersTest {

	@Test
	public void testBruteForceWithNull() {
		int[] expected = { -2, -1, 0, 1, 2 };
		
		assertEquals(
			Arrays.toString(CheckSumFiveNumbers.bruteForce(0)),
			Arrays.toString(expected)
		);
	}

	@Test
	public void testBruteForce() {
		int[] expected = { 1, 2, 3, 4, 5};
		
		assertEquals(
			Arrays.toString(CheckSumFiveNumbers.bruteForce(15)),
			Arrays.toString(expected)
		);
	}

	@Test
	public void testBruteForceToReturnLessOnes() {
		int[] expected = { -1 };

		assertEquals(
			Arrays.toString(CheckSumFiveNumbers.bruteForce(18)),
			Arrays.toString(expected)
		);
	}
	
	@Test
	public void testEfficientApproachWithNull() {
		int[] expected = { -2, -1, 0, 1, 2 };
		
		assertEquals(
			Arrays.toString(CheckSumFiveNumbers.efficientApproach(0)),
			Arrays.toString(expected)
		);
	}

	@Test
	public void testEfficientApproach() {
		int[] expected = { 1, 2, 3, 4, 5};
		
		assertEquals(
			Arrays.toString(CheckSumFiveNumbers.efficientApproach(15)),
			Arrays.toString(expected)
		);
	}
	
	@Test
	public void testEfficientApproachLessOnes() {
		int[] expected = { -1 };

		assertEquals(
			Arrays.toString(CheckSumFiveNumbers.efficientApproach(18)),
			Arrays.toString(expected)
		);
	}

}
