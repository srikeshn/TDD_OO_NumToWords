package com.srikesh.converter;

import java.util.Scanner;

import com.srikesh.converter.utils.StringUtils;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number between [0 - 999999999] to convert into words");
       try {
		Integer numberToBeConverted = StringUtils.sanitize(input.nextLine());
       System.out.println(new NumberToWordsConverter().convertToWords(numberToBeConverted));
       }
       catch (Exception e) {
    	   System.out.println(e.getMessage());
       }
       finally {
		input.close();
	}
	}

}
