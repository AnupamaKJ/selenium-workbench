package com.selenium.learning.Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesAssignment {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.findElement(By.linkText("Nested Frames")).click();
		
		//System.out.println(driver.findElements(By.tagName("frame")).size());
		
	//	driver.switchTo().frame(0); // by index
		
		driver.switchTo().frame("frame-top");
		
		//System.out.println(driver.findElements(By.tagName("frame")).size());
		
		driver.switchTo().frame(1);
		
		driver.switchTo().frame("frame-middle");
		
		System.out.println(driver.findElement(By.id("content")).getText());
		
		

	}

}
