package testcasesScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.booking.ExcelLibrary;
import com.booking.TestBase;

import pages.Homepage;
import pages.LoginPage;
import pages.Users;

public class TC_04_ListOfUsers extends	TestBase{
@Test
	public void addNewUser() throws IOException, InterruptedException {
		LoginPage lg = new LoginPage(driver);
		lg.login(ExcelLibrary.gatCellValue("Sheet1", 0, 0), ExcelLibrary.gatCellValue("Sheet1", 0, 1));
		
		Homepage hp = new Homepage(driver);
		hp.clickUserTab();
		//		Assert.assertEquals(false, true);
		Users userDetail = new Users(driver);
		Thread.sleep(3000);
		userDetail.addUserInput("Add User", "", "Jain", "cv");
		
		
	}
	
}
