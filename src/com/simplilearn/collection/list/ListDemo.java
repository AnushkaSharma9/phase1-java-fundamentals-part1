package com.simplilearn.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ListDemo {

	public static void main(String[] args) {
		
		// List -> Order collection of data with duplicates elements.
		// List (interface) -> imp classes -> ArrayList, LinkedList , Vector , Stack
				
		//declaration
		List<String> list1 = new ArrayList<String>();// backed by dynamic array, not thread, read operations, indexing preserved
		List<String> list2 = new LinkedList<String>();//backed by doubly linked list, not thread, insert, update, delete, insertion is preserved
		List<String> list3 = new Vector<String>();// old legacy collection , thread safe
		List<String> list4 = new Stack<String>();//old legacy collection , thread safe
		
		//List<String>users = new ArrayList<String>();
		//ArrayList<String>users = new ArrayList<String>();
		List<String>users = new LinkedList<String>();
		//List<String>users = new Vector<String>();
		//List<String>users = new Stack<String>();
		//List users = new LinkedList();// we can add any datatype but once we add type safety only that datatype can be added
		
		//add data in array list
		users.add("John");
		users.add("Bob");
		users.add("David");
		users.add("Marry");
		users.add("Ava");
		users.add("John");
		//users.add(8989);
		
		System.out.println(users);//all print
		System.out.println("The element at index 5 : "+users.get(5));
	    
		//add data at specific index
		//user.add(index,element);
		users.add(2,"Anushka");
		System.out.println(users);
		
		//iterate users collections 
		for(int index = 0; index<users.size(); index++ ) {
			System.out.println("The index "+index +" user is "+users.get(index));
		}
		
		System.out.println("-----------------------------");
		//enhance for loop 
		for(String user : users) {
			System.out.println(user);
		}

		System.out.println(":>>-----------------------------");
		Iterator<String> itr = users.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
