package com.simplilearn.accessmodifierB;

public class SuperHero {
	
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