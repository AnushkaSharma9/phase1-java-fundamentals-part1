package com.simplilearn.typecasting;

public class ImplicitTypeCastDemo {

	public static void main(String[] args) {
		// Implicit Type Cast : Automatically type casted
		/**
		 * Widening type cast
		 * converts from lower to higher
		 */
      byte smallCount = 100; //-128 to 127 --> 1byte = 8 bits
      int intCount = smallCount; // type casting byte --> int
      long bigCount = intCount ;// widening type casting
      float floatCount = intCount;// widening type casting
      double decimalCount= bigCount;// long -> double
      System.out.println("Byte Count :"+smallCount);
      System.out.println("Int Count :"+intCount);
      System.out.println("Long Count :"+bigCount);
      System.out.println("Float Count :"+floatCount);
      System.out.println("Double Count :"+decimalCount);
      
	}

}
