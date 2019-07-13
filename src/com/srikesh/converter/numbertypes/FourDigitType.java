package com.srikesh.converter.numbertypes;

public class FourDigitType extends AbstractWordType{
	private final FixedNumbers fixednumbers = new FixedNumbers();

	public FourDigitType() {
		super(new NumberRange(1000, 9999), 1000);
	}

	public String convertToWords(Integer number) {
		return super.convertToWords(number);
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
