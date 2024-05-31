package com.selenium.learning.dropDowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EndToEndAngularPracticeAssignment {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/angularpractice/");

		driver.findElement(By.name("name")).sendKeys("Anupama");
		driver.findElement(By.name("email")).sendKeys("anupama@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("123456");
		driver.findElement(By.id("exampleCheck1")).click();

		WebElement dropdownEle = driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropdown = new Select(dropdownEle);
		dropdown.selectByVisibleText("Female");
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.cssSelector("input[name='bday']")).sendKeys("19-03-2018");
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		
		System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());
		
	}

}
