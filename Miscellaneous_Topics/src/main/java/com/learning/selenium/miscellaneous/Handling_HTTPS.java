package com.learning.selenium.miscellaneous;

import java.time.Duration;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Handling_HTTPS {

	public static void main(String[] args) {
		
		//104 Chapter
		
		  ChromeOptions options = new ChromeOptions();
		  
		  options.setAcceptInsecureCerts(true);
		  
		  //Need to add file path
		 // options.addExtensions("path");
		  
		  //105 chapter
		  
		  //https://chromedriver.chromium.org/capabilities
		  
		  Proxy proxy = new Proxy();
		  
		  proxy.setHttpProxy("ipadress: 4444");
		  
		  options.setCapability("proxy", proxy);
		  
		  WebDriver driver = new ChromeDriver(options);
		 
		
		
		  FirefoxOptions options1 = new FirefoxOptions();
		  options1.setAcceptInsecureCerts(true);
		  
		  WebDriver driver1 = new FirefoxDriver(options1);
		 
		
		EdgeOptions options2 = new EdgeOptions();
		options2.setAcceptInsecureCerts(true);
		
		WebDriver driver2 = new EdgeDriver(options2);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		driver.get("https://expired.badssl.com/");
		
		System.out.println(driver.getTitle());
		
		//Block pop-up windows

		options.setExperimentalOption("excludeSwitches",

		Arrays.asList("disable-popup-blocking"));
		
		
		// Set download directory

		Map<String, Object> prefs = new HashMap<String, Object>();

		prefs.put("download.default_directory", "/directory/path");

		options.setExperimentalOption("prefs", prefs);
	}

}
