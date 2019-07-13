package com.srikesh.converter.numbertypes;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

public class NineDigitsTest {
	private final NineDigitsType resource = new NineDigitsType();
	@Test
	public void testShouldMatchNumbersInRange() throws Exception {
		assertFalse(resource.isValidRange(8));
		assertFalse(resource.isValidRange(100));
		assertFalse(resource.isValidRange(9999));
		assertFalse(resource.isValidRange(10000));
		assertFalse(resource.isValidRange(100000));
		assertTrue(resource.isValidRange(999999999));
	}
	
	@Test
	public void convertSixDigitNumberTest() {
		assertEquals("one hundred million", resource.convertToWords(100000000));
	}

}
