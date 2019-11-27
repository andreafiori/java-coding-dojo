package test.problems.math;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.problems.math.MinimumPositiveIntegers;

public class MinimumPairPositiveIntegers {

	@Test
	public void testFindMinimumPositiveIntegers() {
		int input[] = { 11, 8 , 5 , 7 , 5 , 100 };

		assertEquals(MinimumPositiveIntegers.findProductPair(input), 25);
	}

}
