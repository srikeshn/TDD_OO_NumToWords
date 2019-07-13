package com.srikesh.converter.numbertypes;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class FourDigitsTest {
	private final FourDigitType resource = new FourDigitType();
	
	@Test
	public void testShouldMatchNumbersInRange() throws Exception {
		assertFalse(resource.isValidRange(9));
		assertFalse(resource.isValidRange(10));
		assertFalse(resource.isValidRange(999));
		assertTrue(resource.isValidRange(1000));
		assertFalse(resource.isValidRange(10000));
	}
	
	@Test
	public void convertFourDigitNumberTest() {
		assertEquals("four thousand five hundred and sixty five", resource.convertToWords(4565));
	}
}
