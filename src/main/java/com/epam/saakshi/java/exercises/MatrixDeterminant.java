package com.epam.saakshi.java.exercises;

public class MatrixDeterminant {

	public static int determinantOf(int[][] inputMatrix) {
		if (inputMatrix.length < 2) {
			System.out.println("Matrix should be a square");
			return 0;
		} 
		else
			return ((inputMatrix[0][0] * inputMatrix[1][1]) - (inputMatrix[1][0] * inputMatrix[0][1]));
	}
}
