package com.selenium.learning.TestNGTesting;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Day3 {

	@BeforeClass(alwaysRun=true)
	public void BfClass()
	{
		System.out.println("Before executing any methods in the class");
	}
	
	@AfterClass(alwaysRun=true)
	public void afClass()
	{
		System.out.println("After executing any methods in the class");
	}
	
	@Test
	public void WebLoginCarLoan()
	{
		//selenium
		System.out.println("WebLoginCar");
	}
	
	@Test(groups= {"Smoke"})
	public void MobileLoginCarLoan()
	{
		//appium
		System.out.println("MobileLoginCar");
	}
	@Test (enabled=false)
	public void MobilesigninCarLoan()
	{
		//appium
		System.out.println("MobilesigninCar");
	}
	@Test(timeOut=4000)
	public void MobilesignoutCarLoan()
	{
		//appium
		System.out.println("Mobile Signout Car");
	}
	
	@BeforeMethod(alwaysRun=true)
	public void bfMethod()
	{
		System.out.println("I will execute before every test method in the day3 class");
	}
	
	@AfterMethod(alwaysRun=true)
	public void afMethod()
	{
		System.out.println("I will execute After every test method in the day3 class");
	}

	@BeforeSuite
	public void Bfsuite()
	{
		System.out.println("I am number 1");
	}
	
	@Test(dependsOnMethods= {"WebLoginCarLoan","MobilesignoutCarLoan"})
	public void APICarLoan()
	{
		//Rest API
		System.out.println("APILoginCar");
	}
}
