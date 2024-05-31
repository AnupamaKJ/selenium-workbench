package com.selenium.learning.Actions;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlesTest {

	public static void main(String[] args) {

		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Multiple Windows")).click();
		
		driver.findElement(By.linkText("Click Here")).click();
		
		Set<String> windows = driver.getWindowHandles();
		
		Iterator<String> it = windows.iterator(); 
		
		String parentID = it.next();
		
		String childID = it.next();
		
		driver.switchTo().window(childID);
		
		System.out.println(driver.findElement(By.tagName("h3")).getText());
		
		driver.switchTo().window(parentID);
		
		System.out.println(driver.findElement(By.tagName("h3")).getText());
		
	}

}
