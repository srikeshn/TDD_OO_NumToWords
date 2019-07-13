package com.srikesh.converter.numbertypes;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

public class SixDigitsTest {
	private final SixDigitsType resource = new SixDigitsType();

	@Test
	public void testShouldMatchNumbersInRange() throws Exception {
		assertFalse(resource.isValidRange(9));
		assertFalse(resource.isValidRange(10));
		assertFalse(resource.isValidRange(999));
		assertFalse(resource.isValidRange(1000));
		assertFalse(resource.isValidRange(10000));
		assertTrue(resource.isValidRange(100000));
	}
	
	@Test
	public void convertSixDigitNumberTest() {
		assertEquals("nine hundred and ninety nine thousand nine hundred and ninety nine", resource.convertToWords(999999));
	}
}
