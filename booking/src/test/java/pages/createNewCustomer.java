package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.booking.TestBase;

import Sync.waitProp;

public class createNewCustomer<WebElements> {
	WebDriver driver;
	waitProp wp = new waitProp();
	public void createNewCustomer(WebDriver driver) {
	PageFactory.initElements(driver, this);
	this.driver = driver;
	
	
	}
	
	@FindBy(xpath = "//div[@class='customerNameDiv']//input[@placeholder='Enter Customer Name']")
	private WebElement custName;
	@FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']")
	private WebElement custDesc;
	@FindBy(xpath = "(//div[@class='dropdownButton'])[15]")
	private WebElement clickOnDrpDwn;
	@FindBy(xpath = "//div[@class='itemRow cpItemRow ']")
	private List<WebElement> selectOptions;
	@FindBy(xpath = "//div[contains(text(),'Create Customer')]")
	private WebElement createCustomerBtn;
	@FindBy(xpath ="//div[contains(text(),'Customer name cannot be empty')]")
	private WebElement errMsgBlankCustName;
	@FindBy(xpath ="//div[@class='greyButton cancelBtn']")
	private WebElement cancelBtnClick;
	
	public void enterCustName(String Customername) {
		custName.sendKeys(Customername);
		System.out.println("Customer name is entered as "+Customername+" successfully");
	}
	
	public void customerDesc(String custDescription) {
		
		custDesc.sendKeys(custDescription);
		System.out.println("Description entered as "+ custDescription);
	}
	
	public void clickDrpDwn() {
		clickOnDrpDwn.click();
		
	}
	public void selectProject(String expProj) {
		
		System.out.println("entered into project");
//		wp.fulentWait(driver, (WebElement) selectOptions, 10, 2);
		List<WebElement> al = (List<WebElement>) selectOptions ;

		for(int i =0; i<al.size();i++) {
			String projVal = ((WebElement) al.get(i)).getText();
			
			System.out.println(projVal);
			if(projVal.equals(expProj)) {
				((WebElement) al.get(i)).click();
				System.out.println("Project name is clicked as "+projVal);
			}
		}
	}
	
	public void createCustomerClick() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		wp.fulentWait(driver, createCustomerBtn, 20, 2);
		js.executeScript("arguments[0].click()", createCustomerBtn);
//		createCustomerBtn.click();
		System.out.println("Clicked on the create customer button");
	}
	
	public void errMsgBlankCustName(String errMsg) {
		wp.fulentWait(driver, errMsgBlankCustName, 20, 2);
		if(errMsgBlankCustName.isDisplayed()) {
			System.out.println("Error msg "+errMsgBlankCustName.getText()+" is displayed");
		}else{
			System.out.println("Error msg is not displayed");
		}
		if(errMsgBlankCustName.getText().equalsIgnoreCase(errMsg)) {
			System.out.println("Error msg is successfully validated");
		}else {
			System.out.println("Error message not validated");
		}
	}
	public void cancelBtnClick() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		wp.fulentWait(driver, cancelBtnClick, 20, 2);
		js.executeScript("arguments[0].click()", cancelBtnClick);
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		cancelBtnClick.click();
		System.out.println("Clicked on the cancel button");
	}
	public void allertMsgAccept(WebDriver driver) {
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String alertMsg = driver.switchTo().alert().getText();
		if(alertMsg.equalsIgnoreCase("Do you want to cancel the process of adding new customer and discard already entered data?")) {
			System.out.println("Alert message matched and validated successfully");
			driver.switchTo().alert().accept();
			System.out.println("Clicked Ok on Alert popup");
		}else {
			System.out.println("Invalid alert message");
		}
		
	}
	
	
	
}
