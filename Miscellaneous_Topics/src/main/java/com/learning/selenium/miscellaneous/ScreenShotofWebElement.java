package com.learning.selenium.miscellaneous;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotofWebElement {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");

		driver.switchTo().newWindow(WindowType.WINDOW);

		Set<String> handles = driver.getWindowHandles();
		
		Iterator<String> it = handles.iterator();
		
		String parentWindowID = it.next();
		
		String ChildWindowID = it.next();
		
		driver.switchTo().window(ChildWindowID);
		
		driver.get("https://rahulshettyacademy.com/");
		
		String courseName = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']"))
		.get(1).getText();
		
		driver.switchTo().window(parentWindowID);
		
		WebElement name = driver.findElement(By.cssSelector("[name='name']"));
		
		name.sendKeys(courseName);
		
		// To get screen shot of webelement
		
		File file = name.getScreenshotAs(OutputType.FILE);
		
		//for File Utils, need to import --> Apache Commons IO 
		FileUtils.copyFile(file, new File("logo.png"));
		
		
		// to get hight and width
		System.out.println(name.getRect().getDimension().getHeight());
		
		System.out.println(name.getRect().getDimension().getWidth());
		
		
		

	}

}
