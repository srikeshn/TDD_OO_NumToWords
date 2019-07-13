package com.srikesh.converter.numbertypes;

public class SevenDigitsType extends AbstractWordType{
	private FixedNumbers fixedNumbers = new FixedNumbers();

	public SevenDigitsType() {
		super(new NumberRange(1000000, 9999999), 1000000);//here divisor is 1000000 so that we get the million digit
	}

	@Override
	protected String getMainNumberInWords(Integer mainNumber) {
		return fixedNumbers.convertToWords(mainNumber) + " million ";
	}

	@Override
	protected String getRemainderInWords(Integer remainder) {
		return new SixDigitsType().convertToWords(remainder);
	}
	

}
