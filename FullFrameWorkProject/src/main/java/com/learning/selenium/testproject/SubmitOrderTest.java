package com.learning.selenium.testproject;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.learning.pageObjects.CartPage;
import com.learning.pageObjects.CheckOutPage;
import com.learning.pageObjects.ConfirmationPage;
import com.learning.pageObjects.OrderPage;
import com.learning.pageObjects.ProductCatalog;
import com.learning.selenium.testcomponents.BaseTest;

public class SubmitOrderTest extends BaseTest{

	String productName="ZARA COAT 3";
	
	@Test(dataProvider="getData", groups= {"Purchase"})
	public void submitOrder(HashMap<String, String> input) throws IOException, InterruptedException {
		
		String country = "india";
				
		ProductCatalog productCatalog = landingPage.loginApplication(input.get("email"), input.get("password"));

		List<WebElement> products = productCatalog.getProductList();
		
		productCatalog.addProductToCart(input.get("productName"));
		CartPage cartPage = productCatalog.goToCartPage();
						
		Boolean match = cartPage.VerifyProductDisplay(input.get("productName"));
		Assert.assertTrue(match);
		CheckOutPage checkOutPage = cartPage.goToCheckOut();
		
		checkOutPage.selectCountry(country);
		ConfirmationPage confirmationPage = checkOutPage.submitOrder();
		String confirmMessageText = confirmationPage.getConfirmationMessage();
		
		Assert.assertTrue(confirmMessageText.equalsIgnoreCase("THANKYOU FOR THE ORDER."));	
		
	}

	//to verify Zara cote 3 is displayed in order
	@Test(dependsOnMethods= {"submitOrder"})
	public void OderHistoryTest()
	{
		//Zara Cote 3
		ProductCatalog productCatalog = landingPage.loginApplication("anupamakj@gmail.com", "Anupama@1214");
		OrderPage orderPage = productCatalog.goToOrdersPage();
		Assert.assertTrue(orderPage.VerifyOrderDisplay(productName));
	}

	
	@DataProvider
	public Object[][] getData() throws IOException
	{
		List<HashMap<String, String>> data =  getJsonDataToMap(System.getProperty("user.dir")+"\\data\\PurchaseOrder.jason");
		return new Object[][] { {data.get(0)}, {data.get(1)}};
	}
	
	/*
	@DataProvider
	public Object[][] getData1()
	{
		return new Object[][] {{"anupamakj@gmail.com", "Anupama@1214","ZARA COAT 3"}, {"anupama@gmail.com", "Anupama@1214","ADIDAS ORIGINAL"}};
	}
	*/
	
	/*
	HashMap<String, String> map = new HashMap<String, String>();
	map.put("email","anupamakj@gmail.com");
	map.put("password", "Anupama@1214");
	map.put("productName", "ZARA COAT 3");
	
	HashMap<String, String> map1 = new HashMap<String, String>();
	map1.put("email","anupama@gmail.com");
	map1.put("password", "Anupama@1214");
	map1.put("productName", "ADIDAS ORIGINAL");
	
	return new Object[][] { {map}, {map1}}; */
}
