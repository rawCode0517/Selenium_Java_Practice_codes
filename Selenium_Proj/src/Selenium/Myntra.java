package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {

	public static void main(String[] args) {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.myntra.com");
			WebElement eleLinkTxt = driver.findElement(By.linkText("Men"));
			eleLinkTxt.click();
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());

			}
			static {
				System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			
		}


	}

