package com.booking;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class TestBase {
	public WebDriver driver;

	@BeforeClass
	public void browserLunch() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://online.actitime.com/hospital");
		 
	}
	
//	@BeforeClass
//	public void edgeBrowserLaunch() {
//		driver = new EdgeDriver();
//		driver.manage().window().maximize();
//	}

	@AfterClass
	public void Quit() {
//		driver.close();
//		driver.quit();
	}

}
        