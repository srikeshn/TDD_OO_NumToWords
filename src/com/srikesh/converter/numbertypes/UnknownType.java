package com.srikesh.converter.numbertypes;

public class UnknownType implements BaseWordType{

	@Override
	public boolean isValidRange(Integer number) {
		return false;
	}

	@Override
	public String convertToWords(Integer number) {
		return "unable to convert " + number + " to words";
	}

	
}
