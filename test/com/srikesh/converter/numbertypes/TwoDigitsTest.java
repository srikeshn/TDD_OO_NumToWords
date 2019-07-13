package com.srikesh.converter.numbertypes;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;


public class TwoDigitsTest {
	private final TwoDigitsType resource = new TwoDigitsType();
	@Test
	public void testShouldMatchNumbersInRange() throws Exception {
		assertFalse(resource.isValidRange(9));
		assertTrue(resource.isValidRange(10));
		assertTrue(resource.isValidRange(99));
		assertFalse(resource.isValidRange(100));
	}

	@Test
	public void DoubleDigitTest() {
		assertEquals("twelve", resource.convertToWords(12));
		assertEquals("twenty seven", resource.convertToWords(27));
		assertEquals("thirty", resource.convertToWords(30));
		assertEquals("fourty four", resource.convertToWords(44));
		assertEquals("ninety nine", resource.convertToWords(99));
	}
}
