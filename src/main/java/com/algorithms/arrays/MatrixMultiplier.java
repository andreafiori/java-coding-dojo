package com.algorithms.arrays;

/**
 * Calculate product of Two matrices
 * In order to multiply two matrices, column of first matrix 
 * must be equal to rows of the second matrix.
 * 
 */
public class MatrixMultiplier {
    /**
     * Calculate multiplication or product of two matrices.
     * 
     * @param matrix1
     * @param matrix2
     * @return product of two matrix
     */
    public static int[][] product(int[][] matrix1, int[][] matrix2) {
        int columnsOfFirstMatrix = matrix1[0].length;
        int rowsOfSecondMatrix = matrix2.length;

        if (columnsOfFirstMatrix != rowsOfSecondMatrix) {
            throw new IllegalArgumentException(String.format(
                    "Can't multiply matrices, columns of first matrix" + 
                    " %d is not equal to rows of second matrix %d",
                    columnsOfFirstMatrix, rowsOfSecondMatrix)
            );
        }

        int rowsOfFirstMatrix = matrix1.length;
        int columnsofSecondMatrix = matrix2[0].length;
        int[][] product = new int[rowsOfFirstMatrix][columnsofSecondMatrix];

        for (int i = 0; i < rowsOfFirstMatrix; i++) {
            for (int j = 0; j < columnsofSecondMatrix; j++) {
                int sum = 0;
                for (int k = 0; k < rowsOfSecondMatrix; k++) {
                    sum = sum + matrix1[i][k] * matrix2[k][j];
                }
                product[i][j] = sum;
            }
        }

        return product;
    }

}
