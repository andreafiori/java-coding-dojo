package test.algorithms.strings;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.algorithms.strings.ReverseString;

public class ReverseStringTest {

	@Test
	public void testReverse() {
		assertEquals(ReverseString.reverse("piano"), "onaip");
	}

	@Test
	public void testInPlaceReverse() {
		assertEquals(ReverseString.inPlaceReverse("1234"), "4321");
	}

}
