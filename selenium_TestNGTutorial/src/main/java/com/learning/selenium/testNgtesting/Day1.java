package com.learning.selenium.testNgtesting;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day1 {
	
	//130 Chapter
	
	@AfterTest
	public void lastExecution()
	{
		System.out.println("I will execute last");
	}
	
	@Test
	public void Demo()
	{
		System.out.println("Hello");
		Assert.assertTrue(false);
	}
	
	@AfterSuite
	public void AfSuite()
	{
		System.out.println("I am the no 1 from last");
	}
	
	@BeforeTest
	public void preRequiste()
	{
		System.out.println("I will execute first 123");
	}

	//131 Chapter
	@Test
	public void Demo1()
	{
		System.out.println("Hello World");
	}
	
}
