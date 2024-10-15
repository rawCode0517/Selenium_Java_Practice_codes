package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrm {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	WebElement eleLinkTxt = driver.findElement(By.tagName("p"));
	System.out.println(eleLinkTxt);

	}
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	
}
}