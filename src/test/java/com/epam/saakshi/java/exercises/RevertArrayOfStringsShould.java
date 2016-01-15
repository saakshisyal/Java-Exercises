package com.epam.saakshi.java.exercises;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RevertArrayOfStringsShould {

	@Test
	public void reverseArrayOfTwoStrings() {
		assertEquals("layS ihskaaS", RevertArrayOfStrings
				.printReverseArray(RevertArrayOfStrings.reverseArray(new String[] { "Saakshi", "Syal" })));
	}
}