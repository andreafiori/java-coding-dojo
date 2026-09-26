package test.algorithms.mathematics;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import com.algorithms.mathematics.ReverseNumber;

public class ReverseNumberTest {

	@Test
	public void testReverse() {
		assertEquals(12, ReverseNumber.reverse(21));
	}

	@Test
	public void testReverseWithThreeDigits() {
		assertEquals(421, ReverseNumber.reverse(124));
	}

	@Test
	public void testReverseToFail() {
		assertNotEquals(21, ReverseNumber.reverse(21));
	}

}
