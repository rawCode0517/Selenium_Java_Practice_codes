package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class amazonAjaxPractice{

	public static void main(String[] args) throws InterruptedException {
	
		
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.amazon.com");

		driver.manage().window().maximize();

		WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		
		
		Actions actions = new Actions(driver);
		
		//used moveToElement and also used keyDown(Keys.SHIFT).sendKeys("xyz") function
	
		actions.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys("fuaark lower").build().perform();
		
		// now lets to a context click or right click in mouse using selenium
		actions.moveToElement(search).contextClick().build().perform();
		
		

		
		
		
	}
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

}
