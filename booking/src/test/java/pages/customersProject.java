package pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Sync.waitProp;
  
public class customersProject {
	WebDriver driver;
	 
	waitProp wp = new waitProp();

	public customersProject(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
		this.driver = driver;
	}

	@FindBy(xpath = "(//div[contains(text(),'Customers & Projects')])[1]")
	private WebElement customerProj;
	@FindBy(xpath = "//div[@class='addNewButton']")
	private WebElement clickAdd;
	@FindBy(xpath = "//div[@class='item createNewCustomer']")
	private WebElement newCustomer;
	@FindBy(xpath = "//div[@class='addNewButton']")
	private WebElement addNewTask;
	@FindBy(xpath = "//div[@class='item createNewCustomer']")

	private WebElement addNewCustomer;
	@FindBy(xpath = "//div[contains(@class,'customerNode ')]/div[@class='collapseButton']/following-sibling::div[@class='title']/div[@class='text']")
	private List<WebElement> customerCheck;
	@FindBy(xpath = "//*[starts-with(@class,'node customerNode') or starts-with(@class,'node projectNode')]//div[4][@class='editButton']")
	private List<WebElement> clickCustSettingsBtn;
	@FindBy(xpath = "(//div[@class='action'])[1]")
	private WebElement clickActionBtn;
	@FindBy(xpath="(//div[@class='buttonsWrapper']/div[3]/div[contains(text(),'Delete')])[1]")
	private WebElement delButton;
	@FindBy(xpath="(//div[@class ='buttonIcon']//span[@class='submitTitle buttonTitle'])[1]")
	private WebElement delPermanentBtn;

	// String CustomerExpTextval;
	// Customer Projects text validation function
	public void validateCustomerProjects(String CustomerExpTextval) {
		String strActVal = customerProj.getText();
		if (strActVal.equalsIgnoreCase(CustomerExpTextval)) {
			System.out.println(strActVal + " Text got matched " + CustomerExpTextval);
		}
	}

	public void clickAddNewCustomer() throws InterruptedException {
		Thread.sleep(2000);
		clickAdd.click();
		newCustomer.click();
		System.out.println("Clicked on Add New Customer tab");
	}

	public void clickAddNewBtn() throws InterruptedException {
		Thread.sleep(2000);
		addNewTask.click();
		System.out.println("Clicked on Add New tab");
	}

	public void clickAddNewCust() throws InterruptedException {
		Thread.sleep(2000);
		addNewCustomer.click();
		System.out.println("Clicked on Add New Customer tab");
	}

	public void custNameAddedValidate(String custName) throws InterruptedException {

			Thread.sleep(3000);
			System.out.println("Entered into the code pintu chintu");
			List<WebElement> al = (List<WebElement>) customerCheck;
			for (int i = 0; i < al.size(); i++) {
				String strCustVal = al.get(i).getText();
				System.out.println(strCustVal);

				if (strCustVal.equals(custName)) {
					al.get(i).click();
					System.out.println("Customer name " + strCustVal + " is displayed successfully");

				}
				break;

		}
	}

	public void clickCustSettingsBtn(String custName) throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("Trying to click settings button inside customer");
		List<WebElement> al = (List<WebElement>) customerCheck;
		for (int i = 0; i < al.size(); i++) {
			Actions actPerform = new Actions(driver);
			actPerform.scrollToElement(al.get(i)).build().perform();
			String strCustVal = al.get(i).getText();
			System.out.println(strCustVal);

			if (strCustVal.equalsIgnoreCase(custName)) {
				actPerform.moveToElement(al.get(i)).build().perform();
				clickCustSettingsBtn.get(i).click();
				System.out.println("Clicked on settings button successfully");
			} else {
				System.out.println("Unable to click on settings");
			}
			break;
		}
	}

	public void clickOnActionBtn() throws InterruptedException {
	Thread.sleep(2000);
	clickActionBtn.click();
	}

	public void clickOnDeleteBtn() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(3000);
		System.out.println("entered script to delete");
		js.executeScript("arguments[0].click();",delButton);
		js.executeScript("arguments[0].click();", delPermanentBtn);
	}
}