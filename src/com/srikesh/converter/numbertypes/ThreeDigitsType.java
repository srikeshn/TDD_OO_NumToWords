package com.srikesh.converter.numbertypes;

public class ThreeDigitsType extends AbstractWordType{

	private FixedNumbers fixednumber = new FixedNumbers();
	public ThreeDigitsType() {
		super(new NumberRange(100, 999), 100);
	}

	public String convertToWords(Integer number) {
		if(fixednumber.isValidRange(number)) {
			return fixednumber.convertToWords(number);
		}
		else {
			return super.convertToWords(number);
		}
	}
	@Override
	protected String getMainNumberInWords(Integer mainNumber) {
		return fixednumber.convertToWords(mainNumber) + " hundred";
	}

	@Override
	protected String getRemainderInWords(Integer remainder) {
		String words = new TwoDigitsType().convertToWords(remainder);
		StringBuilder result = new StringBuilder();
		if(remainder > 0) {
			result.append(" and ");
		}
		return result.append(words).toString();
	}
	

}
