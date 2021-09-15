package com.simplilearn.accessmodifier;

import com.simplilearn.accessmodifierB.Brother;

public class DefaultAccessModifierOutsidePackageDemo {

public static void main(String[] args) {
		Brother brother = new Brother();
		
//		brother.money;
//		brother.shoes;
		//not visible as the default constructor as well as access modifier are not visible outside the package
		
		// brother.showMoney();
		//not accessible as well 
	}

}
