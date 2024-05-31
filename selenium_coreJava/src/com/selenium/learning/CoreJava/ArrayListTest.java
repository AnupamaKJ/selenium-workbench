package com.selenium.learning.CoreJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<String> a = new ArrayList<String>();
		//to Access any methods present in a class, you have to create object of the class -  object.class
		a.add("Rahul");
		a.add("Shetty");
		a.add("Academy");
		a.add("Selenium");
		//a.remove(3);
			
		System.out.println(a.get(2));
		
		System.out.println("-----------------------");
		
		for (int i=0; i<a.size(); i++)
		{
			System.out.println(a.get(i));
		}
		
		System.out.println("-----------------------");
		
		for (String s:a)
		{
			System.out.println(s);
		}
		
		System.out.println("-----------------------");
		//items contains in array List
		
		System.out.println(a.contains("Selenium"));
		System.out.println("-----------------------");
		
		String[] names = {"Rahul", "Shetty", "Selenium"};
		
		List<String> NameArrayList = Arrays.asList(names);
		
		System.out.println(NameArrayList.contains("Selenium1"));
		
	}

}
