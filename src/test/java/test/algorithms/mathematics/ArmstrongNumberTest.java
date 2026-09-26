package test.algorithms.mathematics;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import com.algorithms.mathematics.ArmstrongNumber;

public class ArmstrongNumberTest {

	@Test
	public void testIsArmstrongNumberWithOneDigit() {
		assertFalse( ArmstrongNumber.isArmstrongNumber(1) );
	}

	@Test
	public void testIsArmstrongNumberWithTwoDigits() {
		assertFalse( ArmstrongNumber.isArmstrongNumber(11) );
	}
	
	@Test
	public void testIsArmstrongNumberAsTrue() {
		assertTrue( ArmstrongNumber.isArmstrongNumber(153) );
	}
	
	@Test
	public void testIsArmstrongNumberAsTrue2() {
		assertTrue( ArmstrongNumber.isArmstrongNumber(371) );
	}
	
	@Test
	public void testIsArmstrongNumberAsFalse() {
		assertFalse( ArmstrongNumber.isArmstrongNumber(154) );
	}

}
