package com.simplilearn.typecasting;

public class ExplicitTypeCastDemo {

	public static void main(String[] args) {
		// Explicit Type Casting : does not happen automatically
		/**
		 * Also Known as Narrowing type Casting : Converts data of incompatible type 
		 * Convert from higher to lower 
		 * double -> float -> long -> integer -> short -> byte
		 */
		double price = 1550.77;
		long bigPrice = (long)price; // error : type mismatch if directly written as long bigPrice=price ;
		// narrowing type casting double -> long  
		int intPrice = (int) bigPrice;// long -> integer 
		short shortPrice = (short) intPrice;// integer to short
		byte bytePrice = (byte) price;
		float floatPrice= (float) price;
		
		System.out.println("Double Price :"+ price);
		System.out.println("Long Price :"+ bigPrice);
		System.out.println("Int Price :"+ intPrice);
		System.out.println("Short Price :"+ shortPrice);
		System.out.println("Byte Price :"+ bytePrice);
		System.out.println("Float Price :"+ floatPrice);
		

	}

}
