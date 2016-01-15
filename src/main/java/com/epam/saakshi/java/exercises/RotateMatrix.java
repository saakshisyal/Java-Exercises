package com.epam.saakshi.java.exercises;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RotateMatrix {
	public static void main(String[] args) throws Exception {

		BufferedReader bufferedReader = new BufferedReader(
				new InputStreamReader(System.in));

		System.out.println("Enter the number of rows: ");
		int rows = Integer.parseInt(bufferedReader.readLine());
		System.out.println("Enter the number of columns: ");
		int columns = Integer.parseInt(bufferedReader.readLine());

		int[][] matrix = new int[rows][columns];

		for (int i = 0; i < rows; i++) {
			System.out.print("Enter elements of row" + (i + 1)
					+ " separated by space:");
			String row = bufferedReader.readLine();
			String[] rowElements = row.split(" ");
			if (rowElements.length != columns)
				throw new Exception(
						"Number of elements entered do not match with columns count!");
			for (int j = 0; j < rowElements.length; j++) {
				matrix[i][j] = Integer.parseInt(rowElements[j]);
			}
		}
		System.out.println("The rotated matrix is:\n");
		printMatrix(rotateBy90Degrees(matrix));
	}

	private static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++)
				System.out.print(matrix[i][j] + " ");
			System.out.println();
		}
	}

	public static int[][] rotateBy90Degrees(int[][] matrix) {
		int rows = matrix.length;
		int columns = matrix[0].length;
		int[][] rotatedMatrix = new int[columns][rows]; // rotated matrix will have number of columns and rows swapped
		for (int i = 0; i < columns; i++) {
			for (int j = 0; j < rows; j++) {
				rotatedMatrix[i][j] = matrix[rows - 1 - j][i];
			}
		}
		return rotatedMatrix;
	}
}