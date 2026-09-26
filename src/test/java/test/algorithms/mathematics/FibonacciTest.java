package test.algorithms.mathematics;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.algorithms.mathematics.Fibonacci;

public class FibonacciTest {

	@Test
	public void testFibonacciNumberAsOne() {
		assertEquals(Fibonacci.fibonacciNumber(1), 1);
	}
	
	@Test
	public void testFibonacciNumberAsNull() {
		assertEquals(Fibonacci.fibonacciNumber(0), 0);
	}
	
	@Test
	public void testFibonacciNumberTwo() {
		assertEquals(Fibonacci.fibonacciNumber(2), 1);
	}
	
	@Test
	public void testFibonacciNumberN() {
		assertEquals(Fibonacci.fibonacciNumber(5), 5);
	}
	
	@Test
	public void testIsOnFibonacciSequenceAsFalse() {
		assertFalse( Fibonacci.isOnFibonacciSequence(4) );
	}
	
	@Test
	public void testIsOnFibonacciSequenceAsTrue() {
		assertTrue( Fibonacci.isOnFibonacciSequence(5) );
	}
}
