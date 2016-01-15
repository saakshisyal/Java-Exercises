package com.epam.saakshi.java.exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(
				new InputStreamReader(System.in));

		System.out.println("Enter the operation (+, -, *, /): ");
		char operation = (char) bufferedReader.read();
		System.out.println("Enter first input : ");
		double input1 = Double.parseDouble(bufferedReader.readLine());
		System.out.println("Enter second input : ");
		double input2 = Double.parseDouble(bufferedReader.readLine());

		double output = process(operation, input1, input2);
		System.out.println("Result is: " + output != null ? output
				: "Arithmetic Exception");
	}

	public static double process(char operation, double input1, double input2) {
		switch (operation) {
			case '+': {
				return (input1 + input2);
			}
			case '-': {
				return (input1 - input2);
			}
			case '*': {
				return (input1 * input2);
			}
			case '/': {
				return (input2 == 0) ? null : (input1 / input2);
			}
			default: {
				return 0;
			}
		}
	}
}