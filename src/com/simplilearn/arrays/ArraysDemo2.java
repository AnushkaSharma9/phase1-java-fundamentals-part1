package com.simplilearn.arrays;

import java.util.Arrays;

public class ArraysDemo2 {

	public static void main(String[] args) {
		
		//arrays is an ordered collection of similar type of data elements
		int[] numbers = {10,20,30,40,50,60};
		System.out.println(Arrays.toString(numbers));
		System.out.println(numbers.length);
		
		//access data by index
		System.out.println("The element at index 2 is : "+numbers[2]);
		System.out.println("The element at index 4 is : "+numbers[4]);
		
		// access element via iteration 
		// loop : for, while, do while 
		//for(int index =0; index>numbers.length; index++) // it will not work
		//for(int index =0; true; index++) //exception after 6th element
		for(int index =0; true ; index++) {
			System.out.println("The element at index "+index +" is : "+numbers[index]);
		}
	}

}
