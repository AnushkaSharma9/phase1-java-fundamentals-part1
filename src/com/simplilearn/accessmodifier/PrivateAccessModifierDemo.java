package com.simplilearn.accessmodifier;

public class PrivateAccessModifierDemo {

	public static void main(String[] args) {
		// create Account class object
		Account account = new Account();
		
		// private proverties
//		System.out.println(account.id);
//		System.out.println(account.balance);
//		System.out.println(account.username);
//		System.out.println(account.password);
         // not visible error as they are private
		
		
		// private method
//		account.showBalance();
//		account.showId();
//		account.getUsername();
		// not visible error as they are private
		account.showCred();
		// this is public so visible

	}

}


 class Account {
	 
	 //private data properties
	private long id = 10001;
	private double balance = 522414.98;
	private String username= "mike123";
	private String password = "mikey@123";
	
	// private methods
	private void showBalance() {
		System.out.println("The Balance :" + balance);
	}
	private long showId() {
		return id;
	}
	
	private String getUsername() {
		return username;
	}
	
	public void showCred() {
		System.out.println("The Username :"+ username +"& the password :" +password);
	}
	// private constructor
	//private Account() {};
	// A private Constructor based class can never be instantiated
}
