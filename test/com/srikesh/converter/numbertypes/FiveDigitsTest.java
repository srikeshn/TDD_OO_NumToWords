package com.srikesh.converter.numbertypes;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class FiveDigitsTest {
	private final FiveDigitType resource = new FiveDigitType();
	
	@Test
	public void testShouldMatchNumbersInRange() throws Exception {
		assertFalse(resource.isValidRange(9));
		assertFalse(resource.isValidRange(10));
		assertFalse(resource.isValidRange(999));
		assertFalse(resource.isValidRange(1000));
		assertTrue(resource.isValidRange(10000));
		assertFalse(resource.isValidRange(100000));
	}
	
	@Test
	public void convertFiveDigitNumberTest() {
		assertEquals("fifty one thousand", resource.convertToWords(51000));
	}

}
