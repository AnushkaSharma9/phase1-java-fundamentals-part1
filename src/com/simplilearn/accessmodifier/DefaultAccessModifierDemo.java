package com.simplilearn.accessmodifier;

public class DefaultAccessModifierDemo {

	public static void main(String[] args) {
		// create object
		Brother brother = new Brother();
		
		// access default properties 
		System.out.println("The Money :" +brother.money);
		System.out.println("The Shoes :" +brother.shoes);

		// access methods
		brother.showMoney();
		String shoes = brother.displayShoes();
		System.out.println("The Brother's Shoes :"+ shoes);
	}

}

class Brother {
	
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