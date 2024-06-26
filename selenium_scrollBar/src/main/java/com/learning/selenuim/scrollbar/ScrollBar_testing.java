package com.learning.selenuim.scrollbar;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ScrollBar_testing {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//101 chapter
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,500)");
		
		Thread.sleep(3000);
		
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=1000");
		
		//102 Chapter
		
		List<WebElement> values=  driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		
		int sum = 0; 
		
		for ( int i=0; i<values.size(); i++)
		{
			sum = sum + Integer.parseInt(values.get(i).getText());			
		}
		
		System.out.println(sum);
		
		//103 Chapter
		
		int valueOnUI = Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
			
		Assert.assertEquals(sum, valueOnUI);
		
		//Assignment
	}

}
