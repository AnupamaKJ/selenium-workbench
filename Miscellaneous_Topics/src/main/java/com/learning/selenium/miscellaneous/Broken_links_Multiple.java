package com.learning.selenium.miscellaneous;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;


public class Broken_links_Multiple {

	public static void main(String[] args) throws MalformedURLException, IOException {
		
		//111 chapter
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		
		SoftAssert a = new SoftAssert();
		
		for(WebElement link : links)
		{
			String url = link.getAttribute("href"); 
			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			int requestCode = conn.getResponseCode();
			System.out.println(requestCode);
			
			a.assertTrue(requestCode<400, "The link with Text "+link.getText() + " is broken with code " +requestCode);
		}
		a.assertAll();
	}
}
