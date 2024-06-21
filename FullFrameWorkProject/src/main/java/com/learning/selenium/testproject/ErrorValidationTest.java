package com.learning.selenium.testproject;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.learning.pageObjects.CartPage;
import com.learning.pageObjects.ProductCatalog;
import com.learning.selenium.testcomponents.BaseTest;
import com.learning.selenium.testcomponents.Retry;

public class ErrorValidationTest extends BaseTest{

	@Test(groups= {"ErrorHandling"}, retryAnalyzer=Retry.class)
	public void LoginErrorValidation() throws IOException, InterruptedException {
				
		landingPage.loginApplication("anupamakj@gmail.com", "Anupama1214");
		Assert.assertEquals("Incorrect email or password.", landingPage.getErrorMethod());
		//Incorrect email or password.
	}
	
	@Test(retryAnalyzer=Retry.class)
	public void ProductErrorValidation() throws IOException, InterruptedException {
		
		String productName="ZARA COAT 3";
				
		ProductCatalog productCatalog = landingPage.loginApplication("anupama@gmail.com", "Anupama@1214");

		List<WebElement> products = productCatalog.getProductList();
		
		productCatalog.addProductToCart(productName);
		CartPage cartPage = productCatalog.goToCartPage();
						
		Boolean match = cartPage.VerifyProductDisplay("ZARA COAT 3");
		Assert.assertTrue(match);
		
	}

}
