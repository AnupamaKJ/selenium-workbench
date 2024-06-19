package com.learning.selenium.corejava;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Invoke browser
		//Chrome -- Chrome driver --> Methods
		//ChromeDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver", "E:\\Softwares\\GeckoDriver\\geckodriver-v0.34.0-win64\\geckodriver.exe");
		WebDriver driver1 = new FirefoxDriver();
		
		System.setProperty("webdriver.edge.driver", "E:\\Softwares\\EdgeDriver\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver2 = new EdgeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		//driver.quit();

		
		
		//FireFox -- Geco Drover --> Methods
		//FirefoxDriver driver1 = new GeckoDriver();
		
		//WebDriver driver2 = new FirefoxDriver();
		//driver2.get("https://www.google.com");
	}

}
