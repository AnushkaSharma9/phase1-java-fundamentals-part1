package com.simplilearn.accessmodifier;

import com.simplilearn.accessmodifierB.SuperHero;

public class ProtectedAccessModifierOutsideThePackageDemo extends SuperHero {

	public static void main(String[] args) {
		// create object
    // SuperHero superHero= new SuperHero();
     
     //protected properties are not directly visible outside package 
     // but we can access them using inheritance
   
		
		//create object of  child class 
		ProtectedAccessModifierOutsideThePackageDemo childObj = new ProtectedAccessModifierOutsideThePackageDemo();
		
		//access protected properties 
		System.out.println("The Power : "+childObj.power);
		System.out.println("The Children Count :  "+childObj.children);
		
		//access protected methods
		childObj.usePower();
		
		//access public methods
		childObj.showHero();
		
	}

}
