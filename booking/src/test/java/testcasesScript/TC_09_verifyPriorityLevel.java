package testcasesScript;

import java.io.IOException;

import org.testng.annotations.Test;

import com.booking.ExcelLibrary;
import com.booking.TestBase;

import pages.Homepage;
import pages.LoginPage;
import pages.Settings;

public class TC_09_verifyPriorityLevel extends TestBase{
	@Test
	public void checkPriorityLevel() throws IOException {
		LoginPage logP = new LoginPage(driver);
		logP.login(ExcelLibrary.gatCellValue("Sheet1", 0, 0), ExcelLibrary.gatCellValue("Sheet1", 0, 1));
		Homepage hop = new Homepage(driver);
		hop.settingsClick();
		Settings set = new Settings(driver);
		set.clickpriorityTab();
		
		
		
	}
	
	
	
}
