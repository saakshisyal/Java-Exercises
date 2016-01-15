package com.epam.saakshi.java.exercises;

import static org.junit.Assert.*;
import org.junit.Test;

public class TransposeMatrixShould {
	@Test
	public void transposeOneByOneMatrix() {
		assertArrayEquals(new int[][] { { 1 } }, TransposeMatrix.transpose(new int[][] { { 1 } }));
	}

	@Test
	public void transposeOneByTwoMatrix() {
		assertArrayEquals(new int[][] { { 1, 2 } }, TransposeMatrix.transpose(new int[][] { { 1 }, { 2 } }));
	}

	@Test
	public void transposeTwoByOneMatrix() {
		assertArrayEquals(new int[][] { { 1 }, { 2 } }, TransposeMatrix.transpose(new int[][] { { 1, 2 } }));
	}

	@Test
	public void transposeThreeByThreeMatrix() {
		assertArrayEquals(new int[][] { { 1, 4, 7 }, { 2, 5, 8 }, { 3, 6, 9 } },
				TransposeMatrix.transpose(new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }));
	}
}
