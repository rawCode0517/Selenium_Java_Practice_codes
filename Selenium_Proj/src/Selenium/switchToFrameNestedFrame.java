package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchToFrameNestedFrame {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com");
		driver.findElement(By.xpath("//li//a[text()='Nested Frames']")).click();
		driver.switchTo().frame(driver.findElement(By.name("frame-top")));
		driver.switchTo().frame(driver.findElement(By.name("frame-middle")));
		System.out.println("successfully switched to middle frmae");
		String text =driver.findElement(By.xpath("//body//div[text()='MIDDLE']")).getText();
		System.out.println(text);
		driver.switchTo().defaultContent();
		
	}
	
	
	
}
