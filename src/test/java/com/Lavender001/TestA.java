package com.Lavender001;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestA {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.animalpak.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement stack = driver.findElement(By.xpath("//*[@id=\"ui-id-3\"]/span"));
		stack.click();
		
		List <WebElement> listStack = driver.findElements(By.xpath("//*[@id=\"maincontent\"]/div[5]/div[1]/div[3]/ol/li"));
		System.out.println(listStack.size());
		for (WebElement myStackList : listStack) {
			System.out.println(myStackList.getText());
		}
		
		Thread.sleep(2000);
//		WebElement packs = driver.findElement(By.xpath("//*[@id=\"ui-id-4\"]/span"));
//		packs.click();
		
		WebElement article = driver.findElement(By.xpath("//*[@id=\"ui-id-9\"]/span"));
		article.click();
		
		String expected = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[1]/h1/span")).getText();
		String actual = "ARTICLES";
		Assert.assertEquals(actual, expected);
		driver.close();

	}

}
