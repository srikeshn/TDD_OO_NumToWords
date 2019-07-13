package com.srikesh.converter.numbertypes;

public class FourDigitsType extends AbstractWordType{
	private final FixedNumbers fixednumbers = new FixedNumbers();

	public FourDigitsType() {
		super(new NumberRange(1000, 9999), 1000);
	}

	@Override
	protected String getMainNumberInWords(Integer mainNumber) {
		return fixednumbers.convertToWords(mainNumber/divisor) + " thousand ";
	}

	@Override
	protected String getRemainderInWords(Integer remainder) {
		return  new ThreeDigitsType().convertToWords(remainder);
	}

}
