package testcasesScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.booking.TestBase;

public class TC_01  {
	@Test
	public void m1() {
		System.out.println("browser lunched");
		WebDriver driver = new ChromeDriver();
		driver.get("https://online.actitime.com/xyz6/login.do");//
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("anshumanjenamani@gmail.com");
		
		WebElement pwd = driver.findElement(By.xpath("//input[@name='pwd']"));
		pwd.sendKeys("actitime123");
		WebElement loginButton=driver.findElement(By.xpath("//div[text()='Login ']"));
		loginButton.click();
		
		
	}
	

}
