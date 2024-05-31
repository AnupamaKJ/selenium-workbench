package com.selenium.learnig.scope;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Scope_assignment {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		// Select any check box 
		// grab the label of the selected check box
		// select an option in the dropdown, here option to select should come from step2
		// enter the step 2 grab label text in edit box 
		// click alert and then verify, if text grabbed from step 2 is present in the pop up message
		
		WebElement selectedCheckBox = driver.findElement(By.id("checkBoxOption2")); 
		selectedCheckBox.click();
		String selectedValue = selectedCheckBox.getAttribute("value");
		
		WebElement selectDropdown = driver.findElement(By.id("dropdown-class-example"));
		Select dropdown = new  Select(selectDropdown);
		dropdown.selectByValue(selectedValue);
		
		driver.findElement(By.id("name")).sendKeys(selectedValue);
		driver.findElement(By.id("alertbtn")).click();
		
		String alertmsg =driver.switchTo().alert().getText();
		
		//Hello option2, share this practice page and share your knowledge
		
		String optionName = alertmsg.split(",")[0].split(" ")[1];
		
		Assert.assertEquals(selectedValue, optionName);
		
		if(alertmsg.contains(selectedValue))
		{
			System.out.println("Alert message success");
		}
		else
		{
		 System.out.println("Something wrong with execution");
		}
	}
}
