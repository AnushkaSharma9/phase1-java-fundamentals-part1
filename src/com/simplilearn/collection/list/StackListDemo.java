package com.simplilearn.collection.list;

import java.util.Stack;

public class StackListDemo {

	public static void main(String[] args) {
		
    Stack<String> listOfFruits = new Stack<String>();
		
		listOfFruits.add("Apple");
		listOfFruits.add("Orange");
		listOfFruits.add("Kiwi");
		listOfFruits.add("Mango");
		listOfFruits.add("Apple");
		listOfFruits.add("Banana");
		
		System.out.println(listOfFruits);

	
	}

}
