package com.simplilearn.accessmodifierB;

public class Brother {
		
		// default properties 
		double money = 352417.098;
		String shoes = "Nike Shoes";
		
		//default methods
		void showMoney() {
			System.out.println("The brother's money :"+money);
		}
		String displayShoes() {
			return shoes;
		}
		// default constructor
		// if created a constructor then the compiler will take my constructor o/w the default constructor will be created by the compiler
		public Brother(){};
	
}
