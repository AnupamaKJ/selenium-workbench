package com.selenium.learning.Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) {
		

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.amazon.com.au/");
		
		Actions a = new Actions(driver);
		
		WebElement move = driver.findElement(By.id("nav-link-accountList"));
		
		WebElement searchbox =driver.findElement(By.id("twotabsearchtextbox"));
		
	//	a.moveToElement(searchbox).click().keyDown(Keys.SHIFT).sendKeys("Hello").build().perform();
		
	//	a.moveToElement(searchbox).click().keyDown(Keys.SHIFT).sendKeys("Hello").doubleClick().build().perform();
		
		// Moves to specific element
	//	a.moveToElement(move).build().perform();
		
		// Right click on the element
		a.moveToElement(move).contextClick().build().perform();
		
		a.moveToElement(searchbox).click().clickAndHold().sendKeys("Hello").doubleClick().build().perform();
		
		
		
	}

}
