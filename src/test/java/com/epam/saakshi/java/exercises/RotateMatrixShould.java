package com.epam.saakshi.java.exercises;

import static org.junit.Assert.*;
import org.junit.Test;

public class RotateMatrixShould {

	@Test
	public void rotateOneByThreeMatrixBy90Degrees() {
		assertArrayEquals(
				new int[][] { { 1 }, { 2 }, { 3 } },
				RotateMatrix.rotateBy90Degrees(new int[][] { { 1, 2, 3 } }));
	}
	
	@Test
	public void rotateThreeByThreeMatrixBy90Degrees() {
		assertArrayEquals(
				new int[][] { { 7, 4, 1 }, { 8, 5, 2 }, { 9, 6, 3 } },
				RotateMatrix.rotateBy90Degrees(new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }));
	}
}