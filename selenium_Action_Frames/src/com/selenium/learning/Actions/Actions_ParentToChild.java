package com.selenium.learning.Actions;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actions_ParentToChild {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector(".blinkingText")).click();
		
		Set<String> windows = driver.getWindowHandles(); //[ParentID, childID]
		
		Iterator<String> it = windows.iterator();
		String parentID = it.next();
		String childID =it.next();
		driver.switchTo().window(childID);
		
		
		System.out.println(driver.findElement(By.xpath("//p[@class='im-para red']")).getText());
		//.split("at")[1].split(" with")[0];
		
		String emailID = driver.findElement(By.xpath("//p[@class='im-para red']")).getText().split("at")[1].trim().split(" with")[0];

		
		driver.switchTo().window(parentID);
		driver.findElement(By.id("username")).sendKeys(emailID);
	}

}
