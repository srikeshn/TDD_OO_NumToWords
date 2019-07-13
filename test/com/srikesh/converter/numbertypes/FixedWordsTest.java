package com.srikesh.converter.numbertypes;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class FixedWordsTest {
	private final FixedNumbers resource = new FixedNumbers();
 
	@Test
	public void numberExistInMapTest() {
		assertTrue(resource.isValidRange(1));
		assertTrue(resource.isValidRange(2));
		assertTrue(resource.isValidRange(3));
		assertTrue(resource.isValidRange(4));
		assertTrue(resource.isValidRange(5));
		assertTrue(resource.isValidRange(6));
		assertTrue(resource.isValidRange(7));
		assertTrue(resource.isValidRange(8));
		assertTrue(resource.isValidRange(9));
		assertTrue(resource.isValidRange(10));
		assertTrue(resource.isValidRange(11));
		assertTrue(resource.isValidRange(12));
		assertTrue(resource.isValidRange(13));
		assertTrue(resource.isValidRange(14));
		assertTrue(resource.isValidRange(15));
		assertTrue(resource.isValidRange(16));
		assertTrue(resource.isValidRange(17));
		assertTrue(resource.isValidRange(18));
		assertTrue(resource.isValidRange(19));
		assertTrue(resource.isValidRange(20));
		assertTrue(resource.isValidRange(30));
		assertTrue(resource.isValidRange(40));
		assertTrue(resource.isValidRange(50));
		assertTrue(resource.isValidRange(60));
		assertTrue(resource.isValidRange(70));
		assertTrue(resource.isValidRange(80));
		assertTrue(resource.isValidRange(90));
	}
	
	@Test
	public void fixedNumberinWordTest() {
		assertEquals("", resource.convertToWords(0));
		assertEquals("ninety", resource.convertToWords(90));
	}
}
