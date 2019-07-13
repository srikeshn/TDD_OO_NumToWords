package com.srikesh.converter;

import static com.srikesh.converter.utils.WordConstants.ZERO;

import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;

import com.srikesh.converter.numbertypes.AbstractWordType;
import com.srikesh.converter.numbertypes.BaseWordType;
import com.srikesh.converter.numbertypes.EightDigitsType;
import com.srikesh.converter.numbertypes.FiveDigitsType;
import com.srikesh.converter.numbertypes.FourDigitsType;
import com.srikesh.converter.numbertypes.NineDigitsType;
import com.srikesh.converter.numbertypes.SevenDigitsType;
import com.srikesh.converter.numbertypes.SixDigitsType;
import com.srikesh.converter.numbertypes.ThreeDigitsType;
import com.srikesh.converter.numbertypes.TwoDigitsType;
import com.srikesh.converter.numbertypes.UnknownType;

public class NumberToWordsConverter {

	private final Collection<? extends AbstractWordType> numberTypes = Arrays.asList(new TwoDigitsType(),
			new ThreeDigitsType(), new FourDigitsType(), new FiveDigitsType(), new SixDigitsType(), new SevenDigitsType(),
			new EightDigitsType(), new NineDigitsType());

	public String convertToWords(Integer number) {
		if (number == 0)
			return String.format("%d = %s", number, ZERO);
		BaseWordType baseType = getNumberType(number);
		return String.format("%d = %s", number, baseType.convertToWords(number));
	}

	private BaseWordType getNumberType(Integer number) {
		BaseWordType defaultType = new UnknownType();
		Optional<? extends AbstractWordType> matchedType = numberTypes.stream()
				.filter(type -> type.isValidRange(number))
				.findFirst();
		if (matchedType.isPresent())
			return matchedType.get();
		return defaultType;
	}
}
