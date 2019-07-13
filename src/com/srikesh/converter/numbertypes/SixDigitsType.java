package com.srikesh.converter.numbertypes;

public class SixDigitsType extends AbstractWordType{

	public SixDigitsType() {
		super(new NumberRange(100000, 999999), 1000);
	}

	@Override
	protected String getMainNumberInWords(Integer mainNumber) {
		return new ThreeDigitsType().convertToWords(mainNumber/divisor) + " thousand ";
	}

	@Override
	protected String getRemainderInWords(Integer remainder) {
		return new ThreeDigitsType().convertToWords(remainder);
	}
	

}
