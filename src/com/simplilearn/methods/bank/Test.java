package com.simplilearn.methods.bank;

public class Test {

	public static void main(String[] args) {
		
		//create a account object
		Account account = new Account(1001,1001,2000.4, "iron man", "iron Bank");
        
		//create a bank operation object
		BankOperation op = new BankOperation();
		
		//call show balance
		double balance = op.showBalance(account);
		
		System.out.println("The user "+ account.username +" account has balance "+balance);
		
		System.out.println("After Withdrawal :: ");
		// call withdraw amount
		double newBalance = op.withdrawAmount(account, 100);
		
		System.out.println("The user "+ account.username +" account has balance "+newBalance);

		System.out.println("After deposit :: ");

		// call deposit amount
        double newBal = op.depositAmount(account, 200);
		
		System.out.println("The user "+ account.username +" account has balance "+newBal);

	}

}
