package com.learning.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.learning.AbstractComponents.AbstractComponent;

public class LandingPage extends AbstractComponent{
	
	WebDriver driver;
	
	public LandingPage(WebDriver driver) 
	{
		//Initialization
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//	WebElement userEmail =  driver.findElement(By.id("userEmail"));
	//	WebElement userPassword	driver.findElement(By.id("userPassword")).sendKeys("Anupama@1214");
		
		//PageFactory
		
		@FindBy(id="userEmail")
		WebElement userEmail;
		
		@FindBy(id="userPassword")
		WebElement userPassword;
		
		@FindBy(id="login")
		WebElement submitButton;
		
		@FindBy(css="[class*='flyInOut']")
		WebElement errorMessage;
						
		public ProductCatalog loginApplication(String email, String password)
		{
			userEmail.sendKeys(email);
			userPassword.sendKeys(password);
			submitButton.click();
			ProductCatalog productCatalog = new ProductCatalog(driver); 
			return productCatalog;
		}
		
		public String getErrorMethod()
		{
			waitForTheWebElementToAppear(errorMessage);
			return errorMessage.getText(); 
		}

		public void goTo()
		{
			driver.get("https://rahulshettyacademy.com/client");
		}
}
