package com.Lavender001;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TestStallExcep {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("Team");
		
		List <WebElement> allList = driver.findElements(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/ul/li[*]/div/div[2]/div[1]/span"));
		

		System.out.println(allList.size());
		boolean status = false;
		
		for (WebElement prtList : allList) {
			System.out.println(prtList.getText());
			if(prtList.getText().contains("stock")) {
				prtList.click();
				status = true;
				break;
			}
		}
		
		if (status == false) {
			System.out.println("Not Found");
		}
		
	}

}
