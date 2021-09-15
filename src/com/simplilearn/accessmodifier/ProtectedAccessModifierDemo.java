package com.simplilearn.accessmodifier;

public class ProtectedAccessModifierDemo {

	public static void main(String[] args) {
		// create instance or object
		Hero hero = new Hero();
		
		// access protected properties
		System.out.println("The Power : "+hero.power);
		System.out.println("The Children Count : "+hero.children);
		
		
		//access protected methods 
		hero.usePower();
		System.out.println("The Children Count : "+hero.countChildren());
		hero.showHero();
	}

}

class Hero{
	
	//protected properties
	protected String power = "Healing Power";
	protected int children = 2;
	
	//protected methods
	protected void usePower() {
		 System.out.println("The best power of all :" +power);
	}
	
	protected int countChildren() {
		return children;
	}
	
	//public methods
	public void showHero() {
		System.out.println("Wolverine");
		
	}
}