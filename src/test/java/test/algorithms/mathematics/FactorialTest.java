package test.algorithms.mathematics;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.algorithms.mathematics.Factorial;

public class FactorialTest {

	@Test
	public void testFactorial() {
		assertEquals(Factorial.factorial(4), 24);
	}
	
	@Test
	public void testFact() {
		assertEquals(Factorial.fact(3), 6);
	}

}
