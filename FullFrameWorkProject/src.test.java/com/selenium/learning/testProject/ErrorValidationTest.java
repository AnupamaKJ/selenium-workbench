package com.selenium.learning.testProject;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.selenium.learning.pageObjects.CartPage;
import com.selenium.learning.pageObjects.CheckOutPage;
import com.selenium.learning.pageObjects.ConfirmationPage;
import com.selenium.learning.pageObjects.LandingPage;
import com.selenium.learning.pageObjects.ProductCatalog;
import com.selenium.learning.testComponents.BaseTest;

public class ErrorValidationTest extends BaseTest{

	@Test(groups= {"ErrorHandling"})
	public void LoginErrorValidation() throws IOException, InterruptedException {
				
		landingPage.loginApplication("anupamakj@gmail.com", "Anupama1214");
		Assert.assertEquals("Incorrect email password.", landingPage.getErrorMethod());
		//Incorrect email or password.
	}
	
	@Test
	public void ProductErrorValidation() throws IOException, InterruptedException {
		
		String productName="ZARA COAT 3";
				
		ProductCatalog productCatalog = landingPage.loginApplication("anupama@gmail.com", "Anupama@1214");

		List<WebElement> products = productCatalog.getProductList();
		
		productCatalog.addProductToCart(productName);
		CartPage cartPage = productCatalog.goToCartPage();
						
		Boolean match = cartPage.VerifyProductDisplay("ZARA COAT 33");
		Assert.assertFalse(match);
		
	}

}
