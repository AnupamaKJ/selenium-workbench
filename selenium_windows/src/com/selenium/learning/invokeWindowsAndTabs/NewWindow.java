package com.selenium.learning.invokeWindowsAndTabs;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindow {

	public static void main(String[] args) {
		
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
		
		driver.findElement(By.cssSelector("[name='name']")).sendKeys(courseName);
		
	}

}
