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

public class SubmitOrderTest extends BaseTest{

	@Test
	public void submitOrder() throws IOException, InterruptedException {
		
		String productName="ZARA COAT 3";
		String country = "india";
				
		ProductCatalog productCatalog = landingPage.loginApplication("anupamakj@gmail.com", "Anupama@1214");

		List<WebElement> products = productCatalog.getProductList();
		
		productCatalog.addProductToCart(productName);
		CartPage cartPage = productCatalog.goToCartPage();
						
		Boolean match = cartPage.VerifyProductDisplay(productName);
		Assert.assertTrue(match);
		CheckOutPage checkOutPage = cartPage.goToCheckOut();
		
		checkOutPage.selectCountry(country);
		ConfirmationPage confirmationPage = checkOutPage.submitOrder();
		String confirmMessageText = confirmationPage.getConfirmationMessage();
		
		Assert.assertTrue(confirmMessageText.equalsIgnoreCase("THANKYOU FOR THE ORDER."));	
		
	}

}
