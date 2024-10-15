package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class keyboard_operations {

	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver = new ChromeDriver();
	driver.get("https://facebook.com");
	driver.manage().window().maximize();
	
	WebElement nameStr = driver.findElement(By.name("email"));
	nameStr.sendKeys("qspiders");
	
	for(int i=0;i<=1;i++) {
		Thread.sleep(4000);
		nameStr.sendKeys(Keys.ARROW_LEFT);
		}
		nameStr.sendKeys(Keys.BACK_SPACE);
	for(int i=0;i<=1;i++) {
		nameStr.sendKeys(Keys.ARROW_LEFT);
		}
		nameStr.sendKeys(Keys.BACK_SPACE);
	for(int i=0;i<=0;i++) {
		Thread.sleep(4000);
		nameStr.sendKeys("p");
		}
	for(int i =0;i<=1;i++) {
		Thread.sleep(4000);
		nameStr.sendKeys(Keys.ARROW_RIGHT);
		}
		nameStr.sendKeys("e");
	
		//WAS to remove the text present inside webelement without using clear method
	
	}

}
