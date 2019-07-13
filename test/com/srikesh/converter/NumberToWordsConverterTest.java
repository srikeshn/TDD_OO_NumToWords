package com.srikesh.converter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class NumberToWordsConverterTest {

	@Test
	public void ZeroToNinetyNineRangeTest() {
		assertEquals("0 = zero", new NumberToWordsConverter().convertToWords(0));
		assertEquals("12 = twelve", new NumberToWordsConverter().convertToWords(12));
		assertEquals("27 = twenty seven", new NumberToWordsConverter().convertToWords(27));
		assertEquals("30 = thirty", new NumberToWordsConverter().convertToWords(30));
		assertEquals("44 = fourty four", new NumberToWordsConverter().convertToWords(44));
		assertEquals("99 = ninety nine", new NumberToWordsConverter().convertToWords(99));
	}
	
	@Test
	public void ThreeDigitRangeTest() {
		assertEquals("101 = one hundred and one", new NumberToWordsConverter().convertToWords(101));
		assertEquals("145 = one hundred and fourty five", new NumberToWordsConverter().convertToWords(145));
		assertEquals("200 = two hundred", new NumberToWordsConverter().convertToWords(200));
		assertEquals("999 = nine hundred and ninety nine", new NumberToWordsConverter().convertToWords(999));
	}
}
