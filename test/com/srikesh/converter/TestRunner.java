package com.srikesh.converter;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import com.srikesh.converter.numbertypes.EightDigitsTest;
import com.srikesh.converter.numbertypes.FiveDigitsTest;
import com.srikesh.converter.numbertypes.FixedWordsTest;
import com.srikesh.converter.numbertypes.FourDigitsTest;
import com.srikesh.converter.numbertypes.NineDigitsTest;
import com.srikesh.converter.numbertypes.SevenDigitsTest;
import com.srikesh.converter.numbertypes.SixDigitsTest;
import com.srikesh.converter.numbertypes.ThreeDigitsTest;
import com.srikesh.converter.numbertypes.TwoDigitsTest;

public class TestRunner {
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(NumberToWordsConverterTest.class, TwoDigitsTest.class,
				ThreeDigitsTest.class, FourDigitsTest.class, FiveDigitsTest.class, SixDigitsTest.class,
				SevenDigitsTest.class, EightDigitsTest.class, NineDigitsTest.class, FixedWordsTest.class);

		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}

		if (result.wasSuccessful()) {
			System.out.println("All Tests Passed");
		}
	}
}