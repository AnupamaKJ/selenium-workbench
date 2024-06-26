package com.learning.selenium.inheritance;

public class ResuableMethods extends MultiplicationMethods {
	
	int a; // Class variable 
	
	//Default Constructor
	public ResuableMethods(int a) // Instance variable
	{
		super(a); // parent class constructor is invoke
		this.a=a;
	}

	public int increment()
	{
		a=a+1;
		return a;
	}
	
	public int decrement()
	{
		a=a-1;
		return a;
	}

}
