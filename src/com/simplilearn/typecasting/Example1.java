package com.simplilearn.typecasting;

public class Example1 {

	public static void main(String[] args) {
		// WAP to converting int, byte, short => float, double, long
			// Explicit Type Cast : Does not Automatically type cast
			
	      int intCount = 12200;
	      byte byteCount = 100;
	      short shortCount = 175;
	      
	      System.out.println("Integer :"+intCount);
	      System.out.println("Byte :"+byteCount);
	      System.out.println("Short :"+shortCount);
	      
	      
	      // int -> float, double, long
	      
	      float floatIntCount = intCount; 
	      double doubleIntCount = intCount;
	      long longIntCount = intCount;
	      
	      System.out.println("Integer to Float Count :"+floatIntCount);
	      System.out.println("Integer to Double Count :"+doubleIntCount);
	      System.out.println("Integer to Long Count :"+longIntCount);
	      
	      // byte -> float, double, long
	      
	      float floatByteCount = byteCount; 
	      double doubleByteCount = byteCount;
	      long longByteCount = byteCount;
	      
	      System.out.println("Byte to Float Count :"+floatByteCount);
	      System.out.println("Byte to Double Count :"+doubleByteCount);
	      System.out.println("Byte to Long Count :"+longByteCount);
	      
	      // short -> float, double, long
	      float floatShortCount = shortCount; 
	      double doubleShortCount = shortCount;
	      long longShortCount = shortCount;
	      
	      System.out.println("Short to Float Count :"+floatShortCount);
	      System.out.println("Short to Double Count :"+doubleShortCount);
	      System.out.println("Short to Long Count :"+longShortCount);
	}

}
