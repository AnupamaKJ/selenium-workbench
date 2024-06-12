package com.selenium.learning.testProject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.selenium.learning.pageObjects.CartPage;
import com.selenium.learning.pageObjects.CheckOutPage;
import com.selenium.learning.pageObjects.ConfirmationPage;
import com.selenium.learning.pageObjects.LandingPage;
import com.selenium.learning.pageObjects.ProductCatalog;

public class StandaloneTest {

	public static void main(String[] args) throws InterruptedException {
		
		String productName="ZARA COAT 3";
		String country = "india";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		LandingPage landingPage = new LandingPage(driver);
		landingPage.goTo();
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
