package com.srikesh.converter.numbertypes;

public class FiveDigitType extends AbstractWordType{

	public FiveDigitType() {
		super(new NumberRange(10000, 99999), 1000);
	}

	@Override
	protected String getMainNumberInWords(Integer mainNumber) {
		return new TwoDigitsType().convertToWords(mainNumber/divisor) + " thousand ";
	}

	@Override
	protected String getRemainderInWords(Integer remainder) {
		return new ThreeDigitsType().convertToWords(remainder);
	}

}
