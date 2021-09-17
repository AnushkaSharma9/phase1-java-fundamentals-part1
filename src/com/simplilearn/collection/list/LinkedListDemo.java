package com.simplilearn.collection.list;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList<String> listOfCompanies= new LinkedList<String>();
		
		listOfCompanies.add("SIMPLILEARN");
		listOfCompanies.add("COMVIVA");
		listOfCompanies.add("DELL");
		listOfCompanies.add("WIPRO");
		listOfCompanies.add("SIMPLILEARN");
		
		
		for(String comp : listOfCompanies) {
			System.out.println(comp);
		}
		
		findCompany(listOfCompanies,"COMVIVA");
	}
	
	// TODO : WAM to find company
	
	private static void findCompany(LinkedList<String> listOfCompanies, String companyName) {
		int match =0;
		// search a city in list 
		for(String company : listOfCompanies) {
			if(company.equals(companyName)) {
				System.out.println("The company "+companyName+" exist !");
				match ++;
			}
		}
		if(match<=0) {
			System.out.println("Invalid company name "+companyName);
		}
		
	}

	}


