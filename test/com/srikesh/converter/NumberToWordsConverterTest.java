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
	
	@Test
	public void FourDigitRangeTest() {
		assertEquals("1000 = one thousand", new NumberToWordsConverter().convertToWords(1000));
		assertEquals("1450 = one thousand four hundred and fifty", new NumberToWordsConverter().convertToWords(1450));
		assertEquals("2101 = two thousand one hundred and one", new NumberToWordsConverter().convertToWords(2101));
		assertEquals("9999 = nine thousand nine hundred and ninety nine", new NumberToWordsConverter().convertToWords(9999));
	}
	@Test
	public void outOfRangeTest() {
		assertEquals("10000 = unable to convert 10000 to words", new NumberToWordsConverter().convertToWords(10000));
	}
}
