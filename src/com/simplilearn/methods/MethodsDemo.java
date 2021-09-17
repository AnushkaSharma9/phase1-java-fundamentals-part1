package com.simplilearn.methods;

public class MethodsDemo {

	public static void main(String[] args) {
		// method calling for non static methods
		MethodsDemo demo = new MethodsDemo();
		
		//zero argument method call
		demo.showMessage();
		
		// one argument method call
		demo.displayAuthor("Anushka Sharma");
		// value here is called an arguments
		// while declaring a function we pass parameters
		
		demo.ageCalculator(1997);
		//two argument method call
		demo.displayDetails("Will Smith", "He is an Actor");
		demo.displayDetails("Anushka Sharma", "She is a Trainee");
		
		demo.getUserInfo("Mike", 22, false);
	}
//methods types
//1. predefined methods
//2. user defined methods
   //1.non-parameterized method
   //2. parameterized

//method declaration / method definition

//1.non-parameterized method
public void showMessage() {
	System.out.println("Welcome to java");
}

//2. parameterized

public void displayAuthor(String author)
{
	System.out.println("The Author : "+author);
}

public void ageCalculator(int yearOfBirth) {
	int age = 2021 - yearOfBirth;
	System.out.println("The user's age  : "+age);
}

//multi-parameterized method
public static void displayDetails(String username, String description){
	System.out.println("The user, : "+username +" and their description : "+description);
}

public static void getUserInfo(String username, int age , boolean isMarried) {
	System.out.println("The user "+username +" has age "+age +" and he/she is married "+isMarried);
}
}