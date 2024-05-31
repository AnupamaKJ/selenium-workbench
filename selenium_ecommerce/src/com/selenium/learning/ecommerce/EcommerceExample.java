package com.selenium.learning.ecommerce;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EcommerceExample {

	public static void main(String[] args) throws InterruptedException {
		
		String[] itemsNeeded = {"Capsicum", "Cucumber", "Brocolli", "Beetroot", "Banana", "Onion"};

		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
		addItems(driver, itemsNeeded);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoCode")));
		driver.findElement(By.cssSelector(".promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector(".promoBtn")).click();
		
	
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoInfo")));
		
		
		System.out.println(driver.findElement(By.cssSelector(".promoInfo")).getText());
	}
	
	public static void addItems(WebDriver driver, String[] itemsNeeded)
	{
		/*	List<WebElement> productsList = driver.findElements(By.xpath("//div[@class='product']"));

		//// div[@class='product'][4]//h4[@class='product-name']

		for (WebElement product : productsList) {

			List itemsNeededList = Arrays.asList(itemsNeeded);

			WebElement productNameElement = product.findElement(By.xpath(".//h4[@class='product-name']"));
			String name = productNameElement.getText().split(" - ")[0];

			if (itemsNeededList.contains(name)) {
			//	j++;
				System.out.println(name);

				product.findElement(By.xpath(".//button[text()='ADD TO CART']")).click();
				if (j == 7) {
					break;
				} 
			}
		} */

			int j = 0;
			
		  List<WebElement> products =
		  driver.findElements(By.cssSelector("h4.product-name"));
		  
		  for (int i=0; i<products.size(); i++) 
		  { //Brocolli - 1 Kg
		  
		  String name = products.get(i).getText().split(" - ")[0]; // format it to get
		  //actual vegetable name
		  
		  //covert array into array list for easy search //check weather name you
		  //extracted is present arrayList or not
		  
		  List itemsNeededList = Arrays.asList(itemsNeeded);
		  
		  if(itemsNeededList.contains(name)) 
		  { 
			  j++;
		      driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click(); 
		      if(j==itemsNeeded.length) 
		      { 
		    	  break; 
		      }
		  }
	}
	}

}
