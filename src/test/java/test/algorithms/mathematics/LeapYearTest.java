package test.algorithms.mathematics;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.algorithms.mathematics.LeapYear;

public class LeapYearTest {

	@Test
	public void testIsNotALeapYear() {
		assertFalse( LeapYear.isLeapYear(2005) );
	}
	
	@Test
	public void testIsLeapYearIsTrueAsMultipleOf4() {
		assertTrue( LeapYear.isLeapYear(1984) );
	}

	@Test
	public void testIsLeapYearIsTrueAsMod100() {
		assertTrue( LeapYear.isLeapYear(2000) );
	}

	@Test
	public void testIsLeapYearIsTrueAsMod4100() {
		assertTrue( LeapYear.isLeapYear(2400) );
	}
}
