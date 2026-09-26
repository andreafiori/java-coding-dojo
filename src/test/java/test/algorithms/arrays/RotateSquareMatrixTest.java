package test.algorithms.arrays;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.algorithms.arrays.RotateSquareMatrix;

public class RotateSquareMatrixTest {

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Test
	public void testRotate() {
		int N = 4;

        int[][] mat;
        mat = new int[][]{
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        int[][] rotated = RotateSquareMatrix.rotate(N, mat);

        int[][] expected = {
                {4, 8, 12, 16},
                {3, 7, 11, 15},
                {2, 6, 10, 14},
                {1, 5, 9, 13}
        };
        assertTrue( Arrays.deepEquals(rotated, expected) );
	}
	
	@Test
	public void testRotateThrowsIllegalArgumentException() throws IllegalArgumentException {
		int N = 4;

		int[][] mat = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15}
        };

        thrown.expect( IllegalArgumentException.class );

		RotateSquareMatrix.rotate(N, mat);
	}

}
