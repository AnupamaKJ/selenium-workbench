package com.learning.selenium.testNgtesting;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {
	
	@Test(groups= {"Smoke"})
	public void ploan()
	{
		System.out.println("Good");
	}
	
	@BeforeTest
	public void preRequiste()
	{
		System.out.println("I will execute first");
	}

}
