package com.srikesh.converter.numbertypes;

public class TwoDigitsType extends AbstractWordType{
	private final FixedNumbers fixedNumbers = new FixedNumbers();

	public TwoDigitsType() {
		super(new NumberRange(10, 99), 10);
	}

	@Override
	public String convertToWords(Integer number) {
		// return the word if it is a fixed number word
		if(fixedNumbers.isValidRange(number))
			return fixedNumbers.convertToWords(number);
		else 
			return super.convertToWords(number); 
	}
	@Override
	protected String getMainNumberInWords(Integer mainNumber) {
		return fixedNumbers.convertToWords(mainNumber);
	}

	@Override
	protected String getRemainderInWords(Integer remainder) {
		return " "+ fixedNumbers.convertToWords(remainder);
	}

}
