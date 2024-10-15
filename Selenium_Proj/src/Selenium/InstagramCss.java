package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramCss {

	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.yahoo.com/account/create?");
		driver.manage().window().maximize();
		//Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[aria-label='Phone number, username, or email']")).sendKeys("ansh@gmail.com");
		
		driver.findElement(By.cssSelector("input[aria-label='Password']")).sendKeys("ghfjy676576");
	//	driver.findElement(By.cssSelector);
	
		
	}
}
