package com.simplilearn.arrays;

import java.util.Scanner;

import com.simplilearn.methods.bank.Account;

public class BankOperations {
	
	static String[] usernames = { "John Smith ", "Mike Smith", "David Miller", "Ava Smith", "Robert Kim"};
	static int[] userIds = {1001,1002,1003,1004,1005};
	static double[] balances = {32323.43 , 1500.0 , 5434.54 , 43434553.43 , 434564.54};

	public static void main(String[] args) {
		
		// step 1. Collect input from user
		Scanner input = new Scanner(System.in);

		System.out.println("--------------------------------------");
		System.out.println(" :: Welcome Iron bank ::");
		System.out.println("--------------------------------------");

		System.out.println(" :: Enter userId ::");

		int userId = input.nextInt();

		findUser(userId);
		
		showBalance(userId);
		
		System.out.println("After Withdrawal :: ");
		// call withdraw amount
		 withdrawAmount(userId, 600);

		System.out.println("After deposit :: ");

		// call deposit amount
        depositAmount(userId, 1200);
				
	}

	//find user
	private static void findUser(int userId) {
		int match=0;//User is not found with user id
		// iterate over all userids
		for (int index = 0;index < userIds.length;index++) {
			//find the userids match
			  if(userIds[index] == userId) {
				  System.out.println("User is found with userId "+userId);
				  System.out.println("User account name "+ usernames[index]);
				  System.out.println("User account balance "+ balances[index]);
				  match++;
				//  System.out.println("match = "+match);
			  }
		}
		if(match==0) {
			System.out.println("User is not found with user id :"+userId);
			//System.out.println("match = "+match);
		}
	}

    	 //show balance
	     
	    private static void showBalance(int userId) {
	    	for (int index = 0;index < userIds.length;index++) {
			//find the userids match
			  if(userIds[index] == userId) {
				 System.out.println("User account balance via show Balance is "+ balances[index]);
			  }
	}
	}

	
		// withdraw amount
		private static void withdrawAmount(int userId, double amount) {
			
			for (int index = 0;index < balances.length;index++) {
				if(userIds[index] == userId) {
					if( amount<balances[index] && amount >0) {			
				double newBalancesWithdraw = balances[index] - amount;
				System.out.println("The user with "+ userIds[index] +" account has balance "+newBalancesWithdraw);
			}
					else 
		    			System.out.println("Invalid withdraw amount");
				}	
				
			}
		}
		
		//deposit amount
       private static void depositAmount(int userId, double amount) {
    	   double dayLimit = 1000;
  
	    for (int index = 0;index < userIds.length;index++) {
	    	if(userIds[index] == userId) {
	    		if (amount< dayLimit && amount >0)  {			
	    	
	    		double newBalancesDeposit = balances[index] + amount;
		        System.out.println("The user with "+ userIds[index] +" account has balance "+newBalancesDeposit);
	    		}
	    		else 
	    			System.out.println("Invalid deposit amount");
			}

			
		}	
}
}
