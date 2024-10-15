package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooCssSelector {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://login.yahoo.com/account/create?");
		driver.manage().window().maximize();
		//Thread.sleep(2000);
		WebElement createNewAcc = driver.findElement(By.cssSelector("input[name='firstName']"));
		createNewAcc.click();
		
		driver.findElement(By.cssSelector("input[name='firstName']")).sendKeys("Ansuman");
		driver.findElement(By.cssSelector("input[name='lastName']")).sendKeys("Jena");
		
		driver.findElement(By.cssSelector("input[aria-label='Email']")).sendKeys("ansh@gmail.com");
		
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("ghfjy676576");
		driver.findElement(By.cssSelector("input[placeholder='Day']")).sendKeys("08");
		driver.findElement(By.cssSelector("input[placeholder='Year']")).sendKeys("1995");
		

	}
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	}


