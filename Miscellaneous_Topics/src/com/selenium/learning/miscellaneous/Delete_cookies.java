package com.selenium.learning.miscellaneous;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Delete_cookies {

	public static void main(String[] args) {
		
		//107 chapter
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		// to maximize the window
		driver.manage().window().maximize();
		
		//to delete the cookies
		
		driver.manage().deleteAllCookies();
		
		//to delete one cookie
		
		driver.manage().deleteCookieNamed("sad");
		
		//to add the cookie
		
	//	driver.manage().addCookie("sad");
		
		//session cookie login should log out
		
		driver.manage().deleteCookieNamed("session key");

	}

}
