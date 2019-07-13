package com.srikesh.converter.numbertypes;

import static com.srikesh.converter.utils.RangeValidationUtil.invalidRangeCheck;
import static com.srikesh.converter.utils.RangeValidationUtil.validRangeCheck;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class ThreeDigitsTest {
	private final ThreeDigitsType resource = new ThreeDigitsType();

	@Test
	public void ThreeDigitsRangeTest() {
		invalidRangeCheck(resource, 9, 20, 9999);
		validRangeCheck(resource, 199, 100);
	}

	@Test
	public void ConvertThreeDigitNumbersTest() {
		assertEquals("one hundred and one", resource.convertToWords(101));
	}

}
