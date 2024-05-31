package com.selenium.learning.CoreJava;

public class Arrays1 {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		arr[0]= 1;
		arr[1]= 2;
		arr[2]= 4;
		arr[3]= 5;
		arr[4]= 6;
		
		System.out.println(arr[4]);
		
		int[] arr1 = {7,8,10,11,12};
		System.out.println(arr1[4]);
		
		for(int i=0; i<arr.length; i++ )
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("-----------------------------------------------");
		
		for(int i=0; i<arr1.length; i++ )
		{
			System.out.println(arr1[i]);
		}
		
		System.out.println("-----------------------------------------------");
		
		String[] names = {"Rahul", "Shetty", "Selenium"};
		
		for (int i=0; i<names.length; i++)
		{
			System.out.println(names[i]);
		}
		
		System.out.println("------ Enhanced for loop -------");
		
		for (String name :names)
		{
			System.out.println(name);
		}
		
	}

}
