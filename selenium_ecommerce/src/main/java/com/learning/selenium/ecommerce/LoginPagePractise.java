package com.selenium.learning.ecommerce;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPagePractise {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(7));
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.xpath("//input[@value='user']/following-sibling::span")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='okayBtn']")));
		driver.findElement(By.xpath("//button[@id='okayBtn']")).click();
		
		WebElement options = driver.findElement(By.xpath("//select[@class='form-control']"));
		Select dropDown = new Select(options);
		dropDown.selectByVisibleText("Consultant");
		driver.findElement(By.xpath("//input[@id='terms']")).click();
		driver.findElement(By.id("signInBtn")).click();
		

		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(.,'ProtoCommerce Home')]")));
		System.out.println(driver.findElement(By.xpath("//a[contains(.,'ProtoCommerce Home')]")).getText());
		
		  List<WebElement> itemsAvailable = driver.findElements(By.xpath("//app-card[@class='col-lg-3 col-md-6 mb-3']"));
		  
		  for (WebElement eachItem : itemsAvailable)
		  {
			  eachItem.findElement(By.xpath(".//button[@class='btn btn-info']")).click();
		  }
		
		driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary']")).click();
	}

}
