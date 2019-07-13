package com.srikesh.converter.numbertypes;

import static com.srikesh.converter.utils.RangeValidationUtil.invalidRangeCheck;
import static com.srikesh.converter.utils.RangeValidationUtil.validRangeCheck;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class SixDigitsTest {
	private final SixDigitsType resource = new SixDigitsType();

	@Test
	public void testShouldMatchNumbersInRange() throws Exception {
		invalidRangeCheck(resource, 9, 10, 999, 9999, 99999);
		validRangeCheck(resource, 100000, 999999, 234543);
	}

	@Test
	public void convertSixDigitNumberTest() {
		assertEquals("nine hundred and ninety nine thousand nine hundred and ninety nine",
				resource.convertToWords(999999));
	}

}
