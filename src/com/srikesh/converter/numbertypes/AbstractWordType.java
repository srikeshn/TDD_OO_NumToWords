package com.srikesh.converter.numbertypes;

public abstract class AbstractWordType implements BaseWordType{

 private final NumberRange range;
 protected final Integer divisor;
 
 public AbstractWordType(NumberRange numRange, Integer divisor) {
	 this.range = numRange;
	 this.divisor = divisor;
 }
 @Override
 public boolean isValidRange(Integer number) {
	 return range.inRange(number);
 }
 
 @Override
 public String convertToWords(Integer number) {
	 range.checkNumberExceedMax(number);
	 int remainder = number % divisor;
	 int mainNumber = number - remainder;
	 String mainNumberInWords = getMainNumberInWords(mainNumber);
	 String remainderInWords = getRemainderInWords(remainder);
	 StringBuilder convertedWord = new StringBuilder();
	 if(mainNumber > 0) {
		 convertedWord.append(mainNumberInWords);
	 }
	 if(remainder > 0) {
		 convertedWord.append(remainderInWords);
	 }
	 return convertedWord.toString().trim();
	 
 }
 
 abstract protected String getMainNumberInWords(Integer mainNumber);

 abstract protected String getRemainderInWords(Integer remainder); 
}
