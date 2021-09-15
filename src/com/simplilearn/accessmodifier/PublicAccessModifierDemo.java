package com.simplilearn.accessmodifier;

public class PublicAccessModifierDemo {

	public static void main(String[] args) {
		//create father class object
		Father father = new Father();
		System.out.println("The amount is :"+father.amount);
		System.out.println("The Park is :"+father.park);
		System.out.println("--------------------------");
		father.showAmount();
		System.out.println(father.displayPark());
	}
}
	class Father{
		//public variables / properties
		public double amount = 43525.874;
		public String park = "Public Park";// making it private the park variable will not be visible
		
		// public method
		public void showAmount()
		{
			System.out.println("The amount is:"+ amount);
		}
		public String displayPark() {
			return park;
		}
		//public constructor
		public Father() {};
	}

