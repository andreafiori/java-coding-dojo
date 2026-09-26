package com.algorithms.arrays;

/**
 * In-place rotate square matrix by 90 degrees
 * Resource https://www.geeksforgeeks.org/inplace-rotate-square-matrix-by-90-degrees/
 */
public class RotateSquareMatrix {
    /**
     * An In-place function to rotate a N x N matrix 
     * by 90 degrees in anti-clockwise direction
     * 
     * TODO: validate matrix input
     * 
     * @param N integer
     * @param mat 2 level matrix of integers
     * @return ordered matrix of integers
     */
    public static int[][] rotate(int N, int[][] mat) {
        _validateMatrix(N, mat);
        
        // Consider all squares one by one
        for (int x = 0; x < N / 2; x++) {

            // Consider elements in group of 4 in current square
            for (int y = x; y < N - x - 1; y++) {
                // store current cell in temp variable
                int temp = mat[x][y];

                // move values from right to top
                mat[x][y] = mat[y][N - 1 - x];

                // move values from bottom to right
                mat[y][N - 1 - x] = mat[N - 1 - x][N - 1 - y];

                // move values from left to bottom
                mat[N - 1 - x][N - 1 - y] = mat[N - 1 - y][x];

                // assign temp to left
                mat[N - 1 - y][x] = temp;
            }
        }

        return mat;
    }
    
    /**
     * Check if every element\s of the matrix has N length
     * 
     * @param N int
     * @param mat 2 levels list
     */
    private static void _validateMatrix(int N, int[][] mat) throws IllegalArgumentException {
        for (int x = 0; x < N; x++) {
            if ( mat[x].length != N ) {
                throw new IllegalArgumentException();
            }
        }
    }
}
