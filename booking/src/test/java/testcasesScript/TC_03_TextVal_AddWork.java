package testcasesScript;

import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.Test;

import com.booking.ExcelLibrary;
import com.booking.TestBase;

import Sync.waitProp;
import pages.Homepage;
import pages.LoginPage;
import pages.createNewCustomer;
import pages.customersProject;

public class TC_03_TextVal_AddWork extends TestBase {
	@Test
	public void textValidation() throws InterruptedException, IOException {
		LoginPage lg = new LoginPage(driver);
		lg.login(ExcelLibrary.gatCellValue("Sheet1", 0, 0), ExcelLibrary.gatCellValue("Sheet1", 0, 1));
		Homepage hp = new Homepage(driver);
		hp.clickTask();
		Thread.sleep(2000);

		customersProject cp = new customersProject(driver);
		Thread.sleep(2000);
		cp.validateCustomerProjects("Customers & Projects");

		cp.clickAddNewBtn();
																																																																																																																																									cp.clickAddNewCust();

		createNewCustomer newCust = new createNewCustomer();
		newCust.createNewCustomer(driver);
		newCust.enterCustName("Bantu Chintu");

		newCust.customerDesc("First Customer added");

		newCust.clickDrpDwn();

		newCust.selectProject("Galaxy Corporation");
		newCust.createCustomerClick();
		cp.custNameAddedValidate("Bantu Chintu");
		cp.clickCustSettingsBtn("Julia");
		cp.clickOnActionBtn();
		cp.clickOnDeleteBtn();
		

		// hp.logout();
	

	}																																																																																																																																																																						}
