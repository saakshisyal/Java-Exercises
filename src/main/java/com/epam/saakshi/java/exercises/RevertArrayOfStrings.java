package com.epam.saakshi.java.exercises;

public class RevertArrayOfStrings {
	
	public static String[] reverseArray(String[] stringArray) {
		int arrayLength = stringArray.length;
		String[] reversedStringArray = new String[arrayLength];

		for (int i = 0; i <= arrayLength - 1; i++) {
			char[] letters = stringArray[i].toCharArray();
			char[] temp = new char[letters.length];

			for (int j = letters.length - 1; j >= 0; j--)
				temp[letters.length - 1 - j] = letters[j];

			reversedStringArray[arrayLength - 1 - i] = new String(temp);
		}
		return reversedStringArray;
	}

	public static String printReverseArray(String[] stringArray) {
		String reversedString = new String();
		for (int j = 0; j <= stringArray.length - 1; j++)
			reversedString += stringArray[j] + " ";
		return reversedString.trim();
	}
}
