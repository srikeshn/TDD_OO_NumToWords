package com.srikesh.converter;

import com.srikesh.converter.numbertypes.BaseWordType;
import com.srikesh.converter.numbertypes.TwoDigitsType;
import static com.srikesh.converter.utils.WordConstants.ZERO;

public class NumberToWordsConverter {

	public String convertToWords(Integer number) {
		if(number == 0) 
			return String.format("%d = %s", number,ZERO);
		BaseWordType type = new TwoDigitsType();
		return String.format("%d = %s", number,type.convertToWords(number));
	}
}
