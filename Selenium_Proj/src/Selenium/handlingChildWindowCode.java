package Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class handlingChildWindowCode {
	
	public static void main(String[] args) throws InterruptedException {
	
		
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");

		driver.manage().window().maximize();

		WebElement blinkLink = driver.findElement(By.xpath("//a[contains(@class,'blinkingText')]"));
		blinkLink.click();
		Set <String> xwindowHandle =driver.getWindowHandles();//[parentId to childId]
		Iterator<String> it = xwindowHandle.iterator();
		String parentId = it.next();
		String childId =it.next();		
		driver.switchTo().window(childId);
		String email = driver.findElement(By.xpath("//a[text()='mentor@rahulshettyacademy.com']")).getText();
		System.out.println(email);
		String text = driver.findElement(By.xpath("//p[@class='im-para']/i")).getText();
		System.out.println(text);
		driver.switchTo().window(parentId);
		//input[contains(@name,'username')]
		driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys(email);
	}
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

}


