package com.srikesh.converter.numbertypes;

public class EightDigitsType extends AbstractWordType{

	public EightDigitsType() {
		super(new NumberRange(10000000, 99999999), 1000000);
	}

	@Override
	protected String getMainNumberInWords(Integer mainNumber) {
		return new TwoDigitsType().convertToWords(mainNumber/divisor) + " million ";
	}

	@Override
	protected String getRemainderInWords(Integer remainder) {
		return new SixDigitsType().convertToWords(remainder);
	}

}
