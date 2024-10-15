package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class myFirstSel {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com");
		WebElement eleiId = driver.findElement(By.name("username"));
		WebElement elePwd = driver.findElement(By.name("pwd"));
		WebElement eleLogin = driver.findElement(By.linkText("Login "));
		eleiId.sendKeys("admin");
		elePwd.sendKeys("manager");
		eleLogin.click();
		
		WebElement eleLinkTxt = driver.findElement(By.linkText("Forgot your password?"));
		System.out.println(eleLinkTxt);
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//driver.close();
		//driver.quit();
	}
	
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe"); 
	}
	
	
}
 