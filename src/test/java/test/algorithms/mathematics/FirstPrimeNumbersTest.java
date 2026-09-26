package test.algorithms.mathematics;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import java.util.List;
import java.util.ArrayList;

import org.junit.Test;

import com.algorithms.mathematics.FirstPrimeNumbers;

public class FirstPrimeNumbersTest {

	@Test
	public void testGetFirstPrimeNumbers() {
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(2);
		expected.add(3);
		expected.add(5);

		assertEquals(
			FirstPrimeNumbers.findFirsts(4),
			expected
		);
	}

	@Test
	public void testIsPrimeAsTrue() {
		assertTrue( FirstPrimeNumbers.isPrime(11) );
	}

	@Test
	public void testIsPrimeAsFalse() {
		assertFalse( FirstPrimeNumbers.isPrime(12) );
	}
}
