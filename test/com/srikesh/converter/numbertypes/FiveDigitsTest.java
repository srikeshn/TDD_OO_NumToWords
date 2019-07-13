package com.srikesh.converter.numbertypes;

import static com.srikesh.converter.utils.RangeValidationUtil.invalidRangeCheck;
import static com.srikesh.converter.utils.RangeValidationUtil.validRangeCheck;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class FiveDigitsTest {
	private final FiveDigitsType resource = new FiveDigitsType();

	@Test
	public void testShouldMatchNumbersInRange() throws Exception {
		invalidRangeCheck(resource, 9, 10, 999, 1000, 9999);
		validRangeCheck(resource, 10000, 99999, 12345);
	}

	@Test
	public void convertFiveDigitNumberTest() {
		assertEquals("fifty one thousand", resource.convertToWords(51000));
	}

}
