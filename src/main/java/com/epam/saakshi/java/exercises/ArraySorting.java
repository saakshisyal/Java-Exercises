package com.epam.saakshi.java.exercises;

public class ArraySorting {
	public static String[] sortArrayByLength(String[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i].length() > array[j].length()) {
					String temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}

	public static String findSecondByLength(String[] array) {
		return sortArrayByLength(array)[1];
	}

	public static String[] sortArrayByVowelsCount(String[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (vowelsCount(array[i]) > vowelsCount(array[j])) {
					String temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}

	public static String[] sortArrayByConsonentsCount(String[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (consonentsCount(array[i]) > consonentsCount(array[j])) {
					String temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}

	private static int vowelsCount(String input) {
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.toLowerCase().charAt(i) == 'a'
					|| input.toLowerCase().charAt(i) == 'e'
					|| input.toLowerCase().charAt(i) == 'i'
					|| input.toLowerCase().charAt(i) == 'o'
					|| input.toLowerCase().charAt(i) == 'u')
				count++;
		}
		return count;
	}

	private static int consonentsCount(String input) {
		return (input.length() - vowelsCount(input));
	}
}