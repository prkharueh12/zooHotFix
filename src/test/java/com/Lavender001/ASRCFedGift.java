package com.Lavender001;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ASRCFedGift {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup(); 
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.usda.gov");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement topic = driver.findElement(By.xpath("//*[@id=\"block-usda-main-menu\"]/ul/li[2]/button/span"));
		
		topic.click();
		
		List <WebElement> topList = driver.findElements(By.xpath("//*[@id=\"side-nav-2\"]/ul/li/a"));
		
		System.out.println(topList.size()); // check how many element in the Topic menu
		
		// Try catch allowed
		
		
		for (WebElement myList : topList) {
			String printThis = "";
		    //*** list all element in the menu
			//System.out.println("These are all element: " + myList.getText());
			
			if (myList.getText().endsWith("s")) {
			
				printThis = "Topic";
			}
			
			if(myList.getText().length()>=10) {
				
				printThis = printThis.concat("Long");
			}

			if (printThis.equals("")) {
				System.out.println(myList.getText());
			}else
				System.out.println(printThis);
		}
		
		driver.close();

	}

}
