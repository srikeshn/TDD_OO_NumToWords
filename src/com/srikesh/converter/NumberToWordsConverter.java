package com.srikesh.converter;

import com.srikesh.converter.numbertypes.AbstractWordType;
import com.srikesh.converter.numbertypes.BaseWordType;
import com.srikesh.converter.numbertypes.EightDigitsType;
import com.srikesh.converter.numbertypes.FiveDigitType;
import com.srikesh.converter.numbertypes.FourDigitType;
import com.srikesh.converter.numbertypes.NineDigitsType;
import com.srikesh.converter.numbertypes.SevenDigitsType;
import com.srikesh.converter.numbertypes.SixDigitsType;
import com.srikesh.converter.numbertypes.ThreeDigitsType;
import com.srikesh.converter.numbertypes.TwoDigitsType;
import com.srikesh.converter.numbertypes.UnknownType;
import com.sun.javafx.runtime.async.AsyncOperationListener;

import static com.srikesh.converter.utils.WordConstants.ZERO;

import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;

public class NumberToWordsConverter {
	
	private final Collection<? extends AbstractWordType> numberTypes = Arrays.asList(
			new TwoDigitsType(),
			new ThreeDigitsType(),
			new FourDigitType(),
			new FiveDigitType(),
			new SixDigitsType(),
			new SevenDigitsType(),
			new EightDigitsType(),
			new NineDigitsType());

	public String convertToWords(Integer number) {
		if(number == 0) 
			return String.format("%d = %s", number,ZERO);
		BaseWordType baseType = getNumberType(number);
		return String.format("%d = %s", number,baseType.convertToWords(number));
	}

	private BaseWordType getNumberType(Integer number) {
		BaseWordType defaultType = new UnknownType();
		Optional<? extends AbstractWordType> matchedType = numberTypes.stream().filter(type -> type.isValidRange(number)).findFirst();
		if(matchedType.isPresent())
			return matchedType.get();
		return defaultType;
	}
}
