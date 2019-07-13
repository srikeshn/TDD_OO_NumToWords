package com.srikesh.converter.numbertypes;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

public class ThreeDigitsTest {
	private final ThreeDigitsType resource = new ThreeDigitsType();
	
	@Test
	public void ThreeDigitsRangeTest() {
		assertFalse(resource.isValidRange(9));
		assertFalse(resource.isValidRange(20));
		assertTrue(resource.isValidRange(199));
		assertTrue(resource.isValidRange(100));
	}
	
	@Test
	public void ConvertThreeDigitNumbersTest() {
		assertEquals("one hundred and one", resource.convertToWords(101));
	}


}
