package com.learning;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReorterNG {
	
	public static ExtentReports getReportObject()
	{
		String path = System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporters = new ExtentSparkReporter(path);
		reporters.config().setReportName("Web automation results");
		reporters.config().setDocumentTitle("Test results");
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporters); 
		extent.setSystemInfo("Tester", "AnupamaKJ");
		return extent;
	
	}

}
