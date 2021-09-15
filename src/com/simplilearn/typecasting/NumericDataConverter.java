package com.simplilearn.typecasting;

import java.util.Scanner;

public class NumericDataConverter {

	public static void main(String[] args) {
		//step 1. collect data from user
		Scanner input = new Scanner(System.in);
		System.out.println("----------------------------------");
		System.out.println("Welcome to numeric convertor :: ");
		System.out.println("Enter an integer value :: ");
		System.out.println("----------------------------------");
		
		int userInput = input.nextInt();
		
		System.out.println("User Input :"+userInput);
		
		//step 2. convert user input into numeric types
		// implicit type conversion 
		long bigValue = userInput;
		float floatValue = userInput;
		double doubleValue = userInput;
		// explicit type conversion 
		byte byteValue = (byte) userInput;
		short shortValue = (short) userInput;
		
		// step 3. print Response 
		System.out.println("-----Implicit & Explicit Converted value-----");
		System.out.println("Byte Value :" +byteValue);
		System.out.println("Short Value :" +shortValue);
		System.out.println("Double Value :" +doubleValue);
		System.out.println("Float Value :" +floatValue);
		System.out.println("Long Value :" +bigValue);
		
		
	}

}
