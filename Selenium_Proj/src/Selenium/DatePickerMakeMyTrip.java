package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerMakeMyTrip {

	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
		driver.findElement(By.xpath("//label[@for = 'departure']")).click();
		//Select departure date as 15 feb
		
		WebElement monthYear = driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[1]"));
		System.out.println(monthYear.getText());
	 
		
	//	driver.findElement(By.xpath("(//div[@class='dateInnerCell'])[1]"));
		

	}

}
