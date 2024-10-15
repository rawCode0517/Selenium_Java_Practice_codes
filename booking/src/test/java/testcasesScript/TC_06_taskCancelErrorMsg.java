package testcasesScript;

import java.io.IOException;

import org.testng.annotations.Test;

import com.booking.ExcelLibrary;
import com.booking.TestBase;

import pages.Homepage;
import pages.LoginPage;
import pages.createNewCustomer;
import pages.customersProject;

public class TC_06_taskCancelErrorMsg extends TestBase{

	@Test
	
	public void taskCancelErrorMsgValidation() throws InterruptedException, IOException{
		
		LoginPage lg = new LoginPage(driver);
		lg.login(ExcelLibrary.gatCellValue("Sheet1", 0, 0), ExcelLibrary.gatCellValue("Sheet1", 0, 1));
		Homepage hp = new Homepage(driver);
		hp.clickTask();
		customersProject cp = new customersProject(driver);
		cp.clickAddNewBtn();
		cp.clickAddNewCust();
		createNewCustomer newCust = new createNewCustomer();
		newCust.createNewCustomer(driver);
		newCust.enterCustName("Rahul Singh");
		newCust.customerDesc("AXY2 ltd");
		newCust.cancelBtnClick();
		newCust.allertMsgAccept(driver);
		
		
		
		
		
	}
	
	
	
	
	
}
