package com.epam.saakshi.java.exercises;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MatrixDeterminantShould {
	@Test
	public void findDeterminantOfTwoDimensionalArray() {
		assertEquals(14, MatrixDeterminant.determinantOf(new int[][] { { 4, 6 },{ 3, 8 } }));
	}
}
