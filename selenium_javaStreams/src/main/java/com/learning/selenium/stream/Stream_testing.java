package com.learning.selenium.stream;

import java.util.ArrayList;
import java.util.List;

public class Stream_testing {

	public static void main(String[] args) {
	
		//count the number of names starting with alphabet A in list 
		
		List<String> names = new ArrayList<String>();
		names.add("Adam");
		names.add("Ajeeth");
		names.add("dom");
		names.add("Alekhya");
		names.add("Ram");
		
		int i=0;
		for(String name : names )
		{
			if(name.startsWith("A"))
			{
				System.out.println(name);
				i++;	
			}
		}
		
		System.out.println("count idnames starting with alphabet A in list " + i);
	
	/*	int count=0;
		
		for (int i=0; i<names.size(); i++)
		{
			String actual = names.get(i);
			if(actual.startsWith("A"))
			{
				count++;
			}
		}
		
		System.out.println(count);
		
		*/
	}

}
