package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Sync.waitProp;

public class TypeOfWork {
	WebDriver driver;
	
	@FindBy(xpath ="//div[contains(text(),'New Type')]") 
	private WebElement newTypeBtn;
	@FindBy(xpath="//input[@placeholder='Enter name']")
	private WebElement enterNameText;
	@FindBy(xpath ="(//span[contains(text(),'Non-Billable')])[6]")
	private WebElement ctaegorySelect;
	@FindBy(xpath ="//div[@class='ScrollbarsCustom-Content']/button")
	private WebElement selecTBilableOption;
	@FindBy(xpath ="//input[@data-for='item_list_modal_tooltip']")
	private WebElement billAmt;
	@FindBy(xpath ="//button[@type='submit']")private WebElement saveBtn;
	@FindBy(xpath="//span[@class='components-TruncatedText-truncatedText--FRbkYWm6']//span/span[contains(text(),'')]//..//..//..//..//..//..//.//..//div//label//span/*[name()='svg']")
	private List<WebElement> selectRecordCheckBox;
	@FindBy(xpath="//span[@class='components-TruncatedText-truncatedText--FRbkYWm6']//span/span[contains(text(),'')]")
	private List<WebElement> recordCheck;
	@FindBy(xpath ="//div[contains(text(),'Delete')]")
	private WebElement delBtnClick;
	@FindBy(xpath ="//button[contains(text(),'OK, Delete')]")
	private WebElement deleteConfirm;
	
	
	
	waitProp wp = new waitProp();
	public TypeOfWork(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void clickNewTypeOfWork() {
		wp.fulentWait(driver, newTypeBtn, 10, 2);
		newTypeBtn.click();
	}
	
	public void enterNameText(String name) {
		
		enterNameText.sendKeys(name);
		System.out.println("Entered name as "+name);
	}
	
	public void billableCategoryClick() {
		ctaegorySelect.click();
		System.out.println("Clicked on select category");
	}

	public void selectSpecificBillCategory() {
		wp.fulentWait(driver, selecTBilableOption, 10, 2);
	selecTBilableOption.click();
				
	}
	
	public void enterBilAmt(String amt) {
		wp.fulentWait(driver, billAmt, 10, 2);
		billAmt.sendKeys(amt);
		System.out.println("Amt entered as "+amt);
	}
	public void saveClick() {
		wp.explicitWait(saveBtn, driver);
		saveBtn.click();
		System.out.println("Clicked on Save button");
	}
	
	public void recordCheckAndSelect(String recordName) throws InterruptedException {
	Thread.sleep(5000);
		for(int i=0;i<recordCheck.size();i=i+1) {
		String	strRecordVal = recordCheck.get(i).getText();
		System.out.println(strRecordVal);
		
		if(strRecordVal.equalsIgnoreCase(recordName)) {
			System.out.println(strRecordVal+" Record name is present");
			selectRecordCheckBox.get(i).click();
			Actions actn = new Actions(driver);
			actn.moveToElement(selectRecordCheckBox.get(i)).perform();
			Thread.sleep(3000);
			System.out.println("Clicked on checkBox ");
			break;
		}else {
			System.out.println("Record name is not present");
		}		
		}
		
	}

	public void deleteItem() throws InterruptedException {
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", delBtnClick);
		System.out.println("Clicked on delete button");
		js.executeScript("arguments[0].click();", deleteConfirm);
		System.out.println("Customer deleted successfully");
		
	}






}
