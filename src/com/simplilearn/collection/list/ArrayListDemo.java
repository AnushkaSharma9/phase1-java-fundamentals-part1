package com.simplilearn.collection.list;

import java.util.ArrayList;

public class ArrayListDemo {
	
	public static void main(String[] args) {
	
		// create a array list 
		ArrayList<String> listOfCities = new ArrayList<>();
		
		// add data into list
				listOfCities.add("New York");
				listOfCities.add("Texas");
				listOfCities.add("California");
				listOfCities.add("Mumbai");
				listOfCities.add("Pune");
				listOfCities.add("New York");
				listOfCities.add("LA");
				//duplicates can be accessed in list
				
				//access data
				System.out.println("The selected city : " + listOfCities.get(2));
				 System.out.println("--------------------------------");
				findCity(listOfCities,"New York");

	}



private static void findCity(ArrayList<String> listOfCities, String cityName) {
	int match =0;
	// search a city in list 
	for(String city : listOfCities) {
		if(city.equals(cityName)) {
			System.out.println("The city "+cityName+" exist !");
			match ++;
		}
	}
	if(match<=0) {
		System.out.println("Invalid city name "+cityName);
	}
	
}
}