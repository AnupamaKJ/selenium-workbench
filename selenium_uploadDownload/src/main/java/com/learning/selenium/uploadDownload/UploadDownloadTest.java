package com.learning.selenium.uploadDownload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class UploadDownloadTest {

    public static void main(String[] args) {

        String fruitName = "Apple";
        WebDriver driver = new ChromeDriver();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
       driver.manage().window().maximize();
       driver.get("https://rahulshettyacademy.com/upload-download-test/index.html");

        driver.findElement(By.cssSelector("#downloadButton")).click();    //download

        //upload
        WebElement upload = driver.findElement(By.cssSelector("input[type='file']"));

        upload.sendKeys( System.getProperty("user.dir")+"\\selenium_uploadDownload\\data\\download.xlsx");   //upload file
        //edit excel

        //upload
        //wait for success message
        By toastLocator = By.cssSelector(".Toastify__toast-body div:nth-child(2)");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(toastLocator));

        String toastText = driver.findElement(toastLocator).getText();
        System.out.println(toastText);
        Assert.assertEquals("Updated Excel Data Successfully.", toastText );
        //wait for disappear
        wait.until(ExpectedConditions.invisibilityOfElementLocated(toastLocator));

        //verify updated excel data showing in the web table
        String priceColumn = driver.findElement(By.xpath("//div[text()='Price']")).getAttribute("data-column-id");
        String actualPrice = driver.findElement(By.xpath("//div[text()='"+fruitName+"']/parent::div/parent::div/div[@id='cell-"+priceColumn+"-undefined']")).getText();
        System.out.println(actualPrice);
        Assert.assertEquals("345", actualPrice);
    }
}
