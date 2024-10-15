package testcasesScript;

import java.io.IOException;

import org.testng.annotations.Test;

import com.booking.ExcelLibrary;
import com.booking.TestBase;

import pages.Homepage;
import pages.LoginPage;
import pages.Settings;
import pages.TypeOfWork;

public class TC_08_createTypeOfWork extends TestBase{
	@Test
	public void createTypeOfWorkAndDelete() throws IOException, InterruptedException {
		LoginPage lg = new LoginPage(driver);
		lg.login(ExcelLibrary.gatCellValue("Sheet1", 0, 0), ExcelLibrary.gatCellValue("Sheet1", 0, 1));
		Homepage homePg = new Homepage(driver);
		homePg.settingsClick();
		Settings set = new Settings(driver);
		set.clickTypeOfWork();
		TypeOfWork typWrkObj = new TypeOfWork(driver);
		typWrkObj.clickNewTypeOfWork();
		typWrkObj.enterNameText("Dalai");
		typWrkObj.billableCategoryClick();
		typWrkObj.selectSpecificBillCategory();
		typWrkObj.enterBilAmt("20");
		typWrkObj.saveClick();
		typWrkObj.recordCheckAndSelect("Dalai");
		typWrkObj.deleteItem();	
		
	}
	
	
	
}
