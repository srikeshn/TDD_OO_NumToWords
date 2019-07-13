package com.srikesh.converter.utils;

public class StringUtils {

	public static Integer sanitize(String input) {
		return Integer.parseInt(input.replace(",", ""));
	}
}
