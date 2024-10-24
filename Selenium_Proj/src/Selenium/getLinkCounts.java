package Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class getLinkCounts {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		int links = driver.findElements(By.tagName("a")).size();
		System.out.println(links);

		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));// limiting webdriver scope
		System.out.println(footerDriver.findElements(By.tagName("a")).size());

		// 1.count of links of the first column only
		// 2.Limiting WebElement
		WebElement firstColumn = driver.findElement(By.xpath("(//div[@id='gf-BIG']//table//tbody/tr/td)[1]"));

		firstColumn.findElements(By.tagName("a")).size();

		// Now I want to open all the links one by one
		// I will use keyDown method from actions class to perform the actions. I will
		// press control key + Enter key using key down
		// and then I will run a loop for those four link and then it will click each
		// link

		// click on each link in the column and check if pages are opening
		for (int i = 0; i < firstColumn.findElements(By.tagName("a")).size(); i++) {
			// We directly used Keys class where chord() method was used which uses string
			String clickOnKeys = Keys.chord(Keys.CONTROL, Keys.ENTER);

			firstColumn.findElements(By.tagName("a")).get(i).sendKeys(clickOnKeys);

		}
		// lets get the names by switching to windows

		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}

	}
}
