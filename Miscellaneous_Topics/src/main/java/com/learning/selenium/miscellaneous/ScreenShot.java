package com.learning.selenium.miscellaneous;


import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ScreenShot {

	public static void main(String[] args) throws IOException {
		
		// 108 chapter
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String screenshotBase64 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
		
		//Path to the location to save screenshot 
		//FileUtils.copyFile(src, new File("c:\\screenshot.png"));
		//c:\screenshot.png (Access is denied) --> C driver wont allow user to add or delete files
		
		FileUtils.copyFile(src, new File("G:\\Anupama\\Learning\\Selenium\\selenium-workbench\\seleniumScreenShots\\screenshot.png"));

	}

}
