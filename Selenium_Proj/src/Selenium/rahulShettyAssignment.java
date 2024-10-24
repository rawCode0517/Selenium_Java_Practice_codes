package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class rahulShettyAssignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		driver.manage().window().maximize();
	WebElement checkBox =	driver.findElement(By.xpath("//input[@id='checkBoxOption3']"));
		checkBox.click();
		System.out.println("check");
		//fetch value as option 3
		String fetchedValue = driver.findElement(By.xpath("//label[@for='honda']")).getText();
		System.out.println(fetchedValue);
		
		WebElement dropdown =driver.findElement(By.id("dropdown-class-example"));
		//Navigate to dropdown list and select the fetched value
		Select select = new Select(dropdown);
		select.selectByIndex(0);
//		select.selectByValue("Option2");
//		select.selectByVisibleText(fetchedValue);
		
		
		//		driver.findElement(By.xpath("//select[@id='dropdown-class-example']/option[contains(text(),'"+fetchedValue+"')]")).click();
//		System.out.println("executed");
		
		WebElement input =driver.findElement(By.xpath("//input[@name='enter-name']"));
		input.sendKeys(fetchedValue);
		driver.findElement(By.id("alertbtn")).click();
		String alertText =driver.switchTo().alert().getText();
		System.out.println(alertText);
		String valueFromAlert =alertText.split(",")[0].split(" ")[1].trim();
		if(valueFromAlert.equalsIgnoreCase(fetchedValue)) {
			driver.switchTo().alert().accept();
			System.out.println("clicked on alert btn as content got matched");
		}	else {
			driver.switchTo().alert().dismiss();
			System.out.println("Alert dismissed as content did not match");
		}

		
		
		
		
		
	}
	
}
