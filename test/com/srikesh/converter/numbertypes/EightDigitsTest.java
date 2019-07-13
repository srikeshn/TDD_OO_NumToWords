package com.srikesh.converter.numbertypes;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

public class EightDigitsTest {
	private final EightDigitsType resource = new EightDigitsType();
	@Test
	public void testShouldMatchNumbersInRange() throws Exception {
		assertFalse(resource.isValidRange(9));
		assertFalse(resource.isValidRange(10));
		assertFalse(resource.isValidRange(999));
		assertFalse(resource.isValidRange(10000));
		assertFalse(resource.isValidRange(100000));
		assertTrue(resource.isValidRange(99999999));
	}
	
	@Test
	public void convertSixDigitNumberTest() {
		assertEquals("ten million", resource.convertToWords(10000000));
	}

}
