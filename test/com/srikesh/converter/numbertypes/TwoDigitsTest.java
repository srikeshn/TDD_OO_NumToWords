package com.srikesh.converter.numbertypes;

import static com.srikesh.converter.utils.RangeValidationUtil.invalidRangeCheck;
import static com.srikesh.converter.utils.RangeValidationUtil.validRangeCheck;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class TwoDigitsTest {
	private final TwoDigitsType resource = new TwoDigitsType();

	@Test
	public void testShouldMatchNumbersInRange() throws Exception {
		invalidRangeCheck(resource, 9, 7, 100);
		validRangeCheck(resource, 10, 99);
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
