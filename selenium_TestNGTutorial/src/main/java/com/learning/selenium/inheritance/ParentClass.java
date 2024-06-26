package com.learning.selenium.inheritance;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ParentClass {

	//methods , variables
		@BeforeMethod
		public void beforerun()
		{
			System.out.println("Run me first");
		}
		

		public void doThis()
		{
			System.out.println("I am here");
		}
		
		@AfterMethod
		public void afterRun()
		{
			System.out.println("Run me last");
		}
		
		
	}

