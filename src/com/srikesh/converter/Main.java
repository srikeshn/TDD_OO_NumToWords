package com.srikesh.converter;

import java.util.Scanner;

import com.srikesh.converter.utils.StringUtils;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter the number between [0 - 999999999] to convert into words");
       Integer numberToBeConverted = StringUtils.sanitize(input.nextLine());
       input.close();
       System.out.println(new NumberToWordsConverter().convertToWords(numberToBeConverted));
	}

}
