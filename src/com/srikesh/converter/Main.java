package com.srikesh.converter;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
       Integer numberToBeConverted = input.nextInt();
       input.close();
       System.out.println(new NumberToWordsConverter().convertToWords(numberToBeConverted));
	}

}
