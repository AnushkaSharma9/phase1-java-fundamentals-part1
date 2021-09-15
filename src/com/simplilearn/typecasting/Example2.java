package com.simplilearn.typecasting;

public class Example2 {

	public static void main(String[] args) {
		// WAP to converting long, float , integer => byte , short, double
				
			      long longCount = 12200878;
			      float floatCount = 100;
			      int intCount = 17509;
			      
			      System.out.println("Long :"+longCount);
			      System.out.println("Float :"+floatCount);
			      System.out.println("Int :"+intCount);
			      
			      
			      // int -> float, double, long
			      
			      byte byteLongCount = (byte) longCount; 
			      short shortLongCount = (short) longCount;
			      double doubleLongCount = longCount;
			      
			      System.out.println("Long to byte Count :"+byteLongCount);
			      System.out.println("Long to short Count :"+shortLongCount);
			      System.out.println("Long to double Count :"+doubleLongCount);
			      
			      // byte -> float, double, long
			      
			      byte byteFloatCount = (byte) floatCount; 
			      short shortFloatCount = (short) floatCount;
			      double doubleFloatCount = floatCount;
			      
			      System.out.println("Float to byte Count :"+byteFloatCount);
			      System.out.println("Float to short Count :"+shortFloatCount);
			      System.out.println("Float to double Count :"+doubleFloatCount);
			      
			      // short -> float, double, long
			      byte byteIntCount = (byte) intCount; 
			      short shortIntCount = (short) intCount;
			      double doubleIntCount = intCount;
			      
			      System.out.println("Integer to Byte Count :"+byteIntCount);
			      System.out.println("Integer to Short Count :"+shortIntCount);
			      System.out.println("Integer to Double Count :"+doubleIntCount);
	}

}
