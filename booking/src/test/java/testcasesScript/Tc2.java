package testcasesScript;

import org.testng.annotations.Test;

import com.booking.TestBase;

import pages.Homepage;
import pages.LoginPage;
import pages.Settings;

public class Tc2 extends TestBase {
	
	
	@Test
	public void login() throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		lp.login("anshumanjenamani@gmail.com", "actitime123");
		Thread.sleep(1000);
		Homepage home = new Homepage(driver);
		Thread.sleep(2000);
		home.settingsClick();
		Thread.sleep(2000);
		//home.logout();
		Settings sett = new Settings(driver);
		sett.clickTypeOfWork();
		
		
		
		
	}

}
