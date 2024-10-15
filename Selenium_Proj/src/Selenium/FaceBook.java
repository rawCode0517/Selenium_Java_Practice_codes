package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FaceBook {

	public static void main(String[] args) throws InterruptedException {
	
		
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.facebook.com");

		driver.manage().window().maximize();
		WebElement createNewAcc = driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
		createNewAcc.click();
		Thread.sleep(2000);
	WebElement fn =	driver.findElement(By.cssSelector("input[aria-label='First name']"));
	WebElement ln =	driver.findElement(By.cssSelector("input[name='lastname']"));
		ln.sendKeys("jenamani");
		
		driver.findElement(By.cssSelector("input[name='reg_email__']")).sendKeys("9778085771");
		
		driver.findElement(By.cssSelector("input[autocomplete='new-password']")).sendKeys("ghfjy676576");

		WebElement signUpBtn= driver.findElement(By.xpath("//button[contains(@name,'websubmit')]"));
		
		Actions actions = new Actions(driver);
		
//		actions.moveToElement(ln).click().keyDown(Keys.SHIFT).sendKeys("JENAMANI").build().perform();
	
		actions.moveToElement(fn).click().keyDown(Keys.SHIFT).sendKeys("ansuman").build().perform();
		
	
		
		actions.moveToElement(signUpBtn).click().build().perform();
		
		
		
		
	}
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

}
