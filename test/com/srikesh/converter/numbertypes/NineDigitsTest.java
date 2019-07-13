package com.srikesh.converter.numbertypes;

import static com.srikesh.converter.utils.RangeValidationUtil.invalidRangeCheck;
import static com.srikesh.converter.utils.RangeValidationUtil.validRangeCheck;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class NineDigitsTest {
	private final NineDigitsType resource = new NineDigitsType();

	@Test
	public void testShouldMatchNumbersInRange() throws Exception {
		invalidRangeCheck(resource, 8, 100, 9999, 10000, 1000000);
		validRangeCheck(resource, 100000000, 673642985, 999999999);
	}

	@Test
	public void convertSixDigitNumberTest() {
		assertEquals("one hundred million", resource.convertToWords(100000000));
	}

}
