package com.srikesh.converter.numbertypes;

public class NineDigitsType extends AbstractWordType{

	public NineDigitsType() {
		super(new NumberRange(100000000, 999999999), 1000000);
	}

	@Override
	protected String getMainNumberInWords(Integer mainNumber) {
		return new ThreeDigitsType().convertToWords(mainNumber) + " million ";
	}

	@Override
	protected String getRemainderInWords(Integer remainder) {
		return new SixDigitsType().convertToWords(remainder);
	}

}
