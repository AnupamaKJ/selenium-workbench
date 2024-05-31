package com.selenium.learning.TestNGTesting;

import org.testng.annotations.Test;

public class Day4 {
	
	@Test
	public void WebLoginHomeLoan()
	{
		//selenium
		System.out.println("WebLoginHome");
	}
	
	@Test(groups= {"Smoke"})
	public void MobileLoginHomeLoan()
	{
		//appium
		System.out.println("MobileLoginHome");
	}

	@Test
	public void LoginAPIHomeLoan()
	{
		//Rest API
		System.out.println("APILoginHome");
	}
}
