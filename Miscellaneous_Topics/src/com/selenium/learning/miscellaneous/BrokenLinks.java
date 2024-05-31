package com.selenium.learning.miscellaneous;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		
		//109 chapter
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		// 200 code is success, >400 is broken
		//1. is to get all URLs tied up to the links using selenium 
		
		//java methods to call URL's and gets the status code 
		
		// if the status code is >400 then that URL is now working --> link which tied to URL is broken 
		
		String url = driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href"); 
		
		//110 Chapter
		
		HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
		conn.setRequestMethod("HEAD");
		conn.connect();
		int responseCode = conn.getResponseCode();
		System.out.println(responseCode);
	}
 
}
