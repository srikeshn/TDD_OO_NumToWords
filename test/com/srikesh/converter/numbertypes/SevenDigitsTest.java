package com.srikesh.converter.numbertypes;

import static com.srikesh.converter.utils.RangeValidationUtil.invalidRangeCheck;
import static com.srikesh.converter.utils.RangeValidationUtil.validRangeCheck;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class SevenDigitsTest {
	private final SevenDigitsType resource = new SevenDigitsType();

	@Test
	public void testShouldMatchNumbersInRange() throws Exception {
		invalidRangeCheck(resource, 9, 10, 999, 1000, 10000, 100000, 77777777);
		validRangeCheck(resource, 1000000, 9999999, 7698453);
	}

	@Test
	public void convertSixDigitNumberTest() {
		assertEquals("nine million nine hundred and ninety nine thousand nine hundred and ninety nine",
				resource.convertToWords(9999999));
	}

}
