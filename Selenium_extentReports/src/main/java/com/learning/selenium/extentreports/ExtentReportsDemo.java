package com.learning.selenium.extentreports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsDemo {
	ExtentReports extent;
	
	@BeforeTest
	public void config()
	{
		//ExtentReports, ExtentSparkReporter
		
		String path = System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter = new  ExtentSparkReporter(path);
		reporter.config().setReportName("Web automation results");
		reporter.config().setDocumentTitle("Test results");
		
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "AnupamaKJ");
	}
	
	@Test
	public void initialDemo()
	{
		ExtentTest test =extent.createTest("Initial Demo");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/");
		
		System.out.println(driver.getTitle());
		
		driver.quit();
		
		test.fail("Results do not match");
		
		extent.flush();
		
	}

}
