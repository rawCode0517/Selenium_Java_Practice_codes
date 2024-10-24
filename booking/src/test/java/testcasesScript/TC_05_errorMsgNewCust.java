package testcasesScript;

import java.io.IOException;

import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

import com.booking.ExcelLibrary;
import com.booking.TestBase;

import Sync.waitProp;
import pages.Homepage;
import pages.LoginPage;
import pages.createNewCustomer;
import pages.customersProject;

public class TC_05_errorMsgNewCust extends TestBase{
@Test																																																																																																																																																					
	
	public void errorMsgNewCustTaskPage() throws IOException, InterruptedException {
		
		LoginPage lg = new LoginPage(driver);
		lg.login(ExcelLibrary.gatCellValue("Sheet1", 0, 0), ExcelLibrary.gatCellValue("Sheet1", 0, 1));
		Homepage hp = new Homepage(driver);
		hp.clickTask();
		customersProject cp = new customersProject(driver);
		cp.clickAddNewBtn();
		cp.clickAddNewCust();
		createNewCustomer newCust = new createNewCustomer();
		newCust.createNewCustomer(driver);
		newCust.createCustomerClick();
		newCust.errMsgBlankCustName("Customer name cannot be empty");
		newCust.enterCustName("Rahul Singh");
		newCust.customerDesc("AXY2 ltd");
		//newCust.errMsgBlankCustName("Customer name cannot be empty");
		newCust.createCustomerClick();
	
}
	
	
	
}
