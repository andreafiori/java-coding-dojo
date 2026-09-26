package test.algorithms.strings;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.algorithms.strings.Palindrome;

public class PalindromeTest {

	@Test
	public void testNumberIsPalindromeAsTrue() {
		assertTrue(Palindrome.isPalindromeNumber(11));
	}

	@Test
	public void testNumberIsPalindromeAsFalse() {
		assertFalse(Palindrome.isPalindromeNumber(21));
	}

	@Test
	public void testStringIsPalindromeAsTrue() {
		assertTrue(Palindrome.isPalindromeString("deified"));
	}

	@Test
	public void testStringIsPalindromeAsFalse() {
		assertFalse(Palindrome.isPalindromeString("word"));
	}
}
