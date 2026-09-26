package test.algorithms.strings;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.algorithms.strings.FirstNonRepeatingChar;

public class FirstNonRepeatingCharTest {

	@Test
	public void testFirstNonRepeatedCharacter() {
		assertEquals('b', FirstNonRepeatingChar.firstNonRepeatedCharacter("abcdefghija"));
		assertEquals('h', FirstNonRepeatingChar.firstNonRepeatedCharacter("hello"));
		assertEquals('J', FirstNonRepeatingChar.firstNonRepeatedCharacter("Java"));
		assertEquals('i', FirstNonRepeatingChar.firstNonRepeatedCharacter("simplest"));
	}

	@Test
	public void testFirstNonRepeatingChar() {
		assertEquals('b', FirstNonRepeatingChar.firstNonRepeatingChar("abcdefghija"));
		assertEquals('h', FirstNonRepeatingChar.firstNonRepeatingChar("hello"));
		assertEquals('J', FirstNonRepeatingChar.firstNonRepeatingChar("Java"));
		assertEquals('i', FirstNonRepeatingChar.firstNonRepeatingChar("simplest"));
	}

	@Test
	public void testGetFirstNonRepeatedChar() {
		assertEquals('b', FirstNonRepeatingChar.getFirstNonRepeatedChar("abcdefghija"));
		assertEquals('h', FirstNonRepeatingChar.getFirstNonRepeatedChar("hello"));
		assertEquals('J', FirstNonRepeatingChar.getFirstNonRepeatedChar("Java"));
		assertEquals('i', FirstNonRepeatingChar.getFirstNonRepeatedChar("simplest"));
	}
}
