package com.qsp;

import java.util.ArrayList;
import java.util.List;

public class arraylist {

	public static void main(String[] args) {
		List<String> al = new ArrayList<String>();
		
		//to add data to list
		al.add("a");
		al.add("b");
		al.add("c");
		
		//to get size of list
		
		int count = al.size();
		System.out.println(count);
		
		//to get data from list
		
		for(int i=0; i<count;i++)
		{
			String	s = al.get(i);
			System.out.println(s);
			
		}
		
		

	}

}
