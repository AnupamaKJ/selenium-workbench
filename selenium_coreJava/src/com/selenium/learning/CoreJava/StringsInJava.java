package com.selenium.learning.CoreJava;

public class StringsInJava {

	public static void main(String[] args) {
		// String is an object, represents the sequence of characters
		
		//String literal
		String s4 = "Rahul Shetty Academy";
		String s1 = "Rahul Shetty Academy";
		
		//String with new key word
		String s2 = new String("Rahul Shetty Academy");
		String s3 = new String("Rahul Shetty Academy");

		String s = "Rahul Shetty Academy";
		String[] splittedString = s.split(" ");
		for(String a:splittedString)
		{
			System.out.println(a);
		}
		
		System.out.println("---------------------------");
		
		String[] splitterString1 = s.split(" Shetty ");
		for(String a:splitterString1)
		{
			System.out.println(a);
		}
		
		System.out.println("---------------------------");
		
		for(int i=0; i<s.length(); i++)
		{
			System.out.println(s.charAt(i));
		}
		
		System.out.println("---------------------------");
		for (int i=s.length()-1; i>=0; i--)
		{
			System.out.println(s.charAt(i));
		}
	}

}
