package com.srikesh.converter.numbertypes;

public interface BaseWordType {

	boolean isValidRange(Integer number);

    String convertToWords(Integer number);
}
