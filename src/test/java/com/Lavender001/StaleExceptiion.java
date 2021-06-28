package com.Lavender001;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleExceptiion {

	public static void main(String[] args) {
		
		/* 1. Go to Amazon website
		 * 2. Click on Best seller
		 * 3. Navigate back
		 * 4. Click on Best Seller
		 * 
		 * */
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		
		
		
		WebElement bestLink = driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[1]"));
		bestLink.click();
		
		driver.navigate().back();
		
		//StaleException happens here
		//bestLink.click();
		
		try {
			
			bestLink.click();
			
		} catch (StaleElementReferenceException e) {
			bestLink = driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[1]"));
			bestLink.click();
		}

	}

}
