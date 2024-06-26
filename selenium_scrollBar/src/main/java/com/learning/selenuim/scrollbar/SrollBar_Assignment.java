package com.learning.selenuim.scrollbar;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SrollBar_Assignment {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,500)");
		
		Thread.sleep(3000);
		

		int numberOfRows = driver.findElements(By.cssSelector(".table-display tr")).size(); 
		
		System.out.println("Number of rows in web table =" + numberOfRows);
		
		int numberOfcolumns = driver.findElements(By.cssSelector(".table-display th")).size(); 
		
		System.out.println("Number of columns in web table =" + numberOfcolumns);
		
		List<WebElement> secondRow = driver.findElements(By.cssSelector(".table-display tr:nth-child(3) td"));
		
		//Rahul Shetty Learn SQL in Practical + Database Testing from Scratch 25
		
		System.out.println(secondRow.get(0).getText());
		System.out.println(secondRow.get(1).getText());
		System.out.println(secondRow.get(2).getText()); 
	
		/*
		WebElement table=driver.findElement(By.id("product"));


		System.out.println(table.findElements(By.tagName("tr")).size());


		System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());


		List<WebElement> secondrow=table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));


		System.out.println(secondrow.get(0).getText());


		System.out.println(secondrow.get(1).getText());


		System.out.println(secondrow.get(2).getText()); 	*/

	}

}
