package Selenium;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChildWindowHandleExample {
	static WebDriverWait wait;
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com");
//		driver.manage().window().maximize();
		
		  wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		  List<WebElement>listOptions =driver.findElements(By.xpath("//div[contains(@id,'content')]//ul//li//a"));
		  
		  // Boolean match = listOptions.stream().anyMatch(anyMatch-> anyMatch.getText().equalsIgnoreCase("Multiple Windows"));
		  
		  for(int i = 0; i<listOptions.size()-1;i++) {
		  
		  if(listOptions.get(i).getText().trim().equalsIgnoreCase("Multiple Windows")){ 
			  Thread.sleep(2000);
		  listOptions.get(i).click();
		  System.out.println("clicked on multiple windows option"); 
		  }else {
		  System.out.println("Not clicked the option"); } }
		  
		  
		  
		  driver.navigate().refresh();
		 	//code to "click here" to open a new window
//	Thread.sleep(2000);
//		driver.findElement(By.linkText("Multiple Windows")).click();

	System.out.println("got till here");
	WebElement clickNewWin =driver.findElement(By.xpath("//a[text()='Click Here']"));
	////a[text()='Click Here']
	clickNewWin.click();
	System.out.println("able to click");
	
	String childWindowText =driver.findElement(By.xpath("//*/h3")).getText();
	
	//Lets switch to child window
	Set<String> window =driver.getWindowHandles();
	java.util.Iterator<String> it= window.iterator();
	String childWin = it.next();
	String parentWin =it.next();
	driver.switchTo().window(childWin);
	
	//Now get the text from child window
	System.out.println(childWindowText);
	
	
	driver.switchTo().window(parentWin);
	
	 String parentWindText =driver.findElement(By.xpath("//h3")).getText();
	 System.out.println(parentWindText);
	 driver.close();
	 
	
	
	
	
	
	
//	System.out.println(match);
		
		
		
		
		
	}


	
	
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}	

	
	

	
}





