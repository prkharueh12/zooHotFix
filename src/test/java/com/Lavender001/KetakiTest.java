package com.Lavender001;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KetakiTest {

	public static void main(String[] args) throws InterruptedException {
		
		// After this he will ask you to explain  each step
		WebDriverManager.chromedriver().setup(); 
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// This line will close the coupon page
//		driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[1]/div/div/i")).click();
//		
//		WebElement second = driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div[2]/a/div/div/div/span[3]"));
//		String secNum = second.getText();
//		System.out.println("The number is: "+ secNum);
		
		
		Select allList = new Select(driver.findElement(By.id("searchDropdownBox")));
		allList.selectByVisibleText("Video Games");
		
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("PS4 ");
		Thread.sleep(1000);
		
		Actions act = new Actions(driver);
		act.sendKeys(Keys.DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		
		List<WebElement> conList = driver.findElements(By.xpath("//*[@id=\"search\"]/div[1]/div/div[1]/div/span[3]/div[2]/div[*]/div/span/div/div/div[2]/div[2]/div/div[1]/h2/a/span"));
		
		for (int i = 0; i < conList.size(); i++) {
			conList.get(0).click();
		
			break;
		}
			
		Thread.sleep(1000);
		driver.close();
		

		
		/*Go to Amazon
		 * 
		 *Change All to Video game
		 *      User Select class and select by index or visible text
		 *Sendkey PS4 to search bar
		 *
		 *Select PS4 controller without typing Controller (Action class)
		 *		Action class and send key arrow down and enter
		 *Select the first choice from the search Not sponsor item. 
		 *		use List <WebElement> findelements
		 *  //*[@id="search"]/div[1]/div/div[1]/div/span[3]/div[2]/div[*]/div/span/div/div/div[2]/div[2]/div/div[1]/h2/a/span
		 *
		 *
		 * */
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
