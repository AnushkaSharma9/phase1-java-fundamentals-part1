package com.simplilearn.methods.bank;

public class Account {
	
	public long id;
	public long accNo;
	public double balance;
	public String username;
	public String bankName;
	
	// default constructor
	Account(){};
	//one argument parameterized constructor
	Account(long id){
		this.id = id;
	}
	
	//two parameterized const
	public Account(String username, String bankName) {
			super();
			this.username = username;
			this.bankName = bankName;
		}
	//all parameters const
	public Account(long id, long accNo, double balance, String username, String bankName) {
		super();
		this.id = id;
		this.accNo = accNo;
		this.balance = balance;
		this.username = username;
		this.bankName = bankName;
	}
	
	
}
