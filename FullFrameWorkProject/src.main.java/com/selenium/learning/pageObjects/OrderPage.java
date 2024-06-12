package com.selenium.learning.pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.selenium.learning.AbstractComponents.AbstractComponent;

public class OrderPage extends AbstractComponent{

	WebDriver driver;
	public OrderPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(css="tr td:nth-child(3)")
	private List<WebElement> productsNames;
	
	public Boolean  VerifyOrderDisplay(String productName)
	{
		Boolean match = productsNames.stream().anyMatch(product->product.getText().equalsIgnoreCase(productName));
		return match;
	}
	
}
