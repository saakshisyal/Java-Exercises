package com.epam.saakshi.java.exercises;

import static org.junit.Assert.*;
import org.junit.Test;

public class ArraySortingShould {
	@Test
	public void sortUnsortedArrayOfFiveStrings() {
		assertArrayEquals(
				new String[] { "Syal", "Aman", "Honey", "Chirag", "Saakshi" },
				ArraySorting.sortArrayByLength(new String[] { "Saakshi",
						"Syal", "Honey", "Chirag", "Aman" }));
	}

	@Test
	public void sortUnsortedArrayOfTwoStrings() {
		assertArrayEquals(new String[] { "Syal", "Saakshi" },
				ArraySorting
						.sortArrayByLength(new String[] { "Saakshi", "Syal" }));
	}

	@Test
	public void sortUnsortedArrayOfFourStrings() {
		assertArrayEquals(
				new String[] { "A", "AA", "AAA", "AAAA" },
				ArraySorting.sortArrayByLength(new String[] { "AAAA", "AAA",
						"AA", "A" }));
	}

	@Test
	public void findSecondByLengthString() {
		assertEquals(
				"AA",
				ArraySorting.findSecondByLength(new String[] { "AAAA", "AAA",
						"AA", "A" }));
	}

	@Test
	public void sortUnsortedArrayByVowelsCount() {
		assertArrayEquals(
				new String[] { "BBBBB", "AB", "AAB", "AAAB" },
				ArraySorting.sortArrayByVowelsCount(new String[] { "AAAB",
						"AAB", "AB", "BBBBB" }));
	}

	@Test
	public void sortUnsortedArrayByConsonentsCount() {
		assertArrayEquals(
				new String[] { "AAAAA", "BA", "BBA", "BBBA" },
				ArraySorting.sortArrayByConsonentsCount(new String[] { "BBBA",
						"BBA", "BA", "AAAAA" }));
	}
}