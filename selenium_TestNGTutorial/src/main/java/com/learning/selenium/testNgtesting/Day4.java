package com.learning.selenium.testNgtesting;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day4 {
	@Parameters({"URL"})
	@Test
	public void WebLoginHomeLoan(String urlname)
	{
		//selenium
		System.out.println("WebLoginHomePersonalLoan");
		System.out.println(urlname);
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
