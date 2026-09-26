package test.algorithms.mathematics;

import static org.junit.Assert.*;
import org.junit.Test;
import com.algorithms.mathematics.CheckOddEven;

public class CheckOddEvenTest {

	@Test
	public void testCheckOddEvenIsTrue() {
		assertTrue( CheckOddEven.check(2) );
	}

	@Test
	public void testCheckOddEvenIsFalse() {
		assertFalse( CheckOddEven.check(3) );
	}

}
