package com.srikesh.converter.numbertypes;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

public class SevenDigitsTest {
	private final SevenDigitsType resource = new SevenDigitsType();
	
	@Test
	public void testShouldMatchNumbersInRange() throws Exception {
		assertFalse(resource.isValidRange(9));
		assertFalse(resource.isValidRange(10));
		assertFalse(resource.isValidRange(999));
		assertFalse(resource.isValidRange(10000));
		assertFalse(resource.isValidRange(100000));
		assertTrue(resource.isValidRange(1000000));
	}
	
	@Test
	public void convertSixDigitNumberTest() {
		assertEquals("nine million nine hundred and ninety nine thousand nine hundred and ninety nine", resource.convertToWords(9999999));
	}
}
