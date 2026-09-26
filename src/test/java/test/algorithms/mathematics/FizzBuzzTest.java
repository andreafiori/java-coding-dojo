package test.algorithms.mathematics;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.algorithms.mathematics.FizzBuzz;

public class FizzBuzzTest {

	@Test
	public void testToReturnFizzBuzz() {
		assertEquals(FizzBuzz.getSequence(15), "FizzBuzz");
	}
	
	@Test
	public void testToReturnFizz() {
		assertEquals(FizzBuzz.getSequence(3), "Fizz");
	}
	
	@Test
	public void testToReturnBuzz() {
		assertEquals(FizzBuzz.getSequence(5), "Buzz");
	}
	
	@Test
	public void testToReturnDefaultValue() {
		assertEquals(FizzBuzz.getSequence(11), "11");
	}

}
