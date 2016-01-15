package com.epam.saakshi.java.exercises;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorShould {
	private static final double DELTA = 0.00000000001;

	@Test
	public void addTwoNumbers() {
		assertEquals(3, Calculator.process('+', 1, 2), DELTA);
		assertEquals(67, Calculator.process('+', 23, 44), DELTA);
		assertEquals(6.7, Calculator.process('+', 2.3, 4.4), DELTA);
	}

	@Test
	public void subtractTwoNumbers() {
		assertEquals(-1, Calculator.process('-', 1, 2), DELTA);
		assertEquals(21, Calculator.process('-', 44, 23), DELTA);
		assertEquals(-2.1, Calculator.process('-', 2.3, 4.4), DELTA);
	}

	@Test
	public void multiplyTwoNumbers() {
		assertEquals(6, Calculator.process('*', 3, 2), DELTA);
		assertEquals(-6, Calculator.process('*', -3, 2), DELTA);
		assertEquals(10.12, Calculator.process('*', 2.3, 4.4), DELTA);
	}

	@Test
	public void divideTwoNumbers() {
		assertEquals(0.5, Calculator.process('/', 1, 2), DELTA);
		assertEquals(2, Calculator.process('/', 2, 1), DELTA);
		assertEquals(-2.4, Calculator.process('/', -4.8, 2), DELTA);
	}
}