package com.learning.selenium.relativelocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class RelativeLoc {

	public static void main(String[] args) {
		
		//122 Chapter
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		//Above Locator
		
		WebElement nameEditBox = driver.findElement(By.cssSelector("[name='name']"));
		
		System.out.println(driver.findElement(with(By.tagName("label")).above(nameEditBox)).getText());
		
		//123 Chapter
		
		//Below Locator
		
		WebElement DateBox = driver.findElement(By.cssSelector("[for='dateofBirth']"));
		driver.findElement(with(By.tagName("input")).below(DateBox)).click();
		
		//Left of Locator
		
		WebElement checkBox = driver.findElement(By.cssSelector("[for='exampleCheck1']"));
		driver.findElement(with(By.tagName("input")).toLeftOf(checkBox)).click();
		
		//Right of Locator;
		WebElement firstRadioButton = driver.findElement(By.cssSelector("#inlineRadio1"));
		System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(firstRadioButton)).getText());
		
	}

}
