package com.selenium.learning.TestNGTesting;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
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
	
	@Parameters({"URL", "APIkey/userName"})
	@Test
	public void WebLoginCarLoan(String urlname, String key)
	{
		//selenium
		System.out.println("WebLoginCar");
		System.out.println(urlname);
		System.out.println(key);
		
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
	@Test(dataProvider="getData")
	public void MobilesignoutCarLoan(String userName, String password)
	{
		//appium
		System.out.println("Mobile Signout Car");
		System.out.println(userName +" "+ password);
		
	}
	
	@Test(dependsOnMethods= {"WebLoginCarLoan","MobilesignoutCarLoan"})
	public void APICarLoan()
	{
		//Rest API
		System.out.println("APILoginCar");
	}
	
	@DataProvider
	public Object[][] getData()
	{
		//1st combination -username  password -- good credit history
		//2nd combination -username  password -- no credit history
		//3rd combination -username  password -- fraudelent credit history
		
		Object[][] data = new Object[3][2];
		data[0][0]="FirstSetUserName";
		data[0][1]="Firstpassword";
		data[1][0]="SecondSetUserName";
		data[1][1]="secondpassword";
		data[2][0]="thirdSetUserName";
		data[2][1]="thirdpassword";
		return data;
		
				
	}
}
