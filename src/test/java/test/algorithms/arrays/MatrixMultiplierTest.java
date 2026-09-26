package test.algorithms.arrays;

import static org.junit.Assert.assertTrue;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import java.util.Arrays;
import com.algorithms.arrays.MatrixMultiplier;

/**
 * Exception testing
 * @see <a href="https://github.com/junit-team/junit4/wiki/exception-testing">Exception testing</a>
 */
public class MatrixMultiplierTest {
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Test
	public void testProductThrowsException() throws IllegalArgumentException {
		int[][] aMatrix = {
			{1,2,3},
			{4,5,6}
		};
		
		int [][] bMatrix = {
			{ 7, 8 },
			{ 9, 10 },
			{ 11, 12 },
		};
		
		MatrixMultiplier.product(aMatrix, bMatrix);
	}

	@Test
	public void testProduct() {
		int[][] aMatrix = {
			{ 1, 2 },
			{ 3, 4 }
		};
		
		int [][] bMatrix = {
			{ 5, 6 },
			{ 7, 8 },
		};
		
		int[][] expectedMatrix = {
			{ 19, 22 },
			{ 43, 50 }
		};

		int[][] resultMatrix = MatrixMultiplier.product(aMatrix, bMatrix);

		assertTrue( Arrays.deepEquals(resultMatrix, expectedMatrix) );
	}
	
	@Test
	public void testIllegalArgumentException() throws IllegalArgumentException {
		int[][] aMatrix = {
			{ 1 },
			{ 3, 4 }
		};
		
		int [][] bMatrix = {
			{ 5, 6 },
			{ 7, 8 },
			{ 9, 10 },
		};
		
		thrown.expect( IllegalArgumentException.class );

		MatrixMultiplier.product(aMatrix, bMatrix);
	}

}
