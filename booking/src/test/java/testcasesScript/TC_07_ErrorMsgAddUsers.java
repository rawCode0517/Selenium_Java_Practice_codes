package testcasesScript;

import java.io.IOException;

import org.testng.annotations.Test;

import com.booking.ExcelLibrary;
import com.booking.TestBase;

import pages.Homepage;
import pages.LoginPage;
import pages.Users;

public class TC_07_ErrorMsgAddUsers extends TestBase{
@Test
	public void errorMsgAddUserValidation() throws IOException, InterruptedException{
		LoginPage lg = new LoginPage(driver);
		lg.login(ExcelLibrary.gatCellValue("Sheet1", 0, 0), ExcelLibrary.gatCellValue("Sheet1", 0, 1));
		Homepage hp = new Homepage(driver);
		hp.clickUserTab();
		Users user=new Users(driver);
		user.addUserInput("xyzsa", "", "Nina", "ghu");
	 
		
		
	}
	
	
	
	
	
}
