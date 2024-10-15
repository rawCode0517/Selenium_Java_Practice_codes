package baseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class browserLaunch
{
	public WebDriver driver;
	
	@BeforeClass
	public void browserlaunch()
	{
		driver= new ChromeDriver();
		driver.get("https://www.americanairlines.in");
	}
}