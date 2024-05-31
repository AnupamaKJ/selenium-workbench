package com.selenium.learnig.scope;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope_windowHandles {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//give me the count of links on the page
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		// count of links in the footer section
		
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
		
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		//footer section first column links
		
		WebElement firstColumn = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		
		System.out.println(firstColumn.findElements(By.tagName("a")).size());
		
		
		//click on each column links in the column and check if the pages are opening 
		
		firstColumn.findElements(By.tagName("a")).size();
		
		//opens all the tabs 
		
		for(int i=1; i<firstColumn.findElements(By.tagName("a")).size(); i++)
		{
			
			String clickonLinkTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			
			firstColumn.findElements(By.tagName("a")).get(i).sendKeys(clickonLinkTab);
			
			Thread.sleep(5000L);
		}
		
		//switches to the all windows and gets the window titles
			
			Set<String> abc = driver.getWindowHandles();
			
			Iterator<String> it =  abc.iterator();
			
			while(it.hasNext())
			{
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
			}
			
		}

}
