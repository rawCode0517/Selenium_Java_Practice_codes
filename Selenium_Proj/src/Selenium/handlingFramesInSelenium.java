package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class handlingFramesInSelenium {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		//switching to frame
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		WebElement source =driver.findElement(By.id("draggable"));	
		WebElement target = driver.findElement(By.id("droppable"));
		
		//drag and drop code
		Actions act = new Actions(driver);
		act.dragAndDrop(source, target).build().perform();
		System.out.println("dragged and dropped successfully");
		driver.switchTo().defaultContent();
		System.out.println("successfully switched back to DOM");
		
		
		
		driver.close();
		
		
		
		
		
	}
	
}
