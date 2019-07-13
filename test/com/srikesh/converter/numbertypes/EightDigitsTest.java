package com.srikesh.converter.numbertypes;

import static com.srikesh.converter.utils.RangeValidationUtil.invalidRangeCheck;
import static com.srikesh.converter.utils.RangeValidationUtil.validRangeCheck;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class EightDigitsTest {
	private final EightDigitsType resource = new EightDigitsType();

	@Test
	public void testShouldMatchNumbersInRange() throws Exception {
		invalidRangeCheck(resource, 9, 10, 999, 10000, 1000000);
		validRangeCheck(resource, 10000000, 99999999, 75693475);
	}

	@Test
	public void convertSixDigitNumberTest() {
		assertEquals("ten million", resource.convertToWords(10000000));
	}

}
