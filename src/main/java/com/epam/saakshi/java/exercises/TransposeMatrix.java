package com.epam.saakshi.java.exercises;

public class TransposeMatrix {
	
	public static int[][] transpose(int[][] inputMatrix) {
		int[][] outputMatrix = new int[columnsIn(inputMatrix)][rowsIn(inputMatrix)];
		for (int i = 0; i < rowsIn(inputMatrix); i++)
			for (int j = 0; j < columnsIn(inputMatrix); j++)
				outputMatrix[j][i] = inputMatrix[i][j];

		return outputMatrix;
	}

	private static int rowsIn(int[][] inputMatrix) {
		return inputMatrix.length;
	}

	private static int columnsIn(int[][] matrix) {
		return matrix[0].length;
	}
}
