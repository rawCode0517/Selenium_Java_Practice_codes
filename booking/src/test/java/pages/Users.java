package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Sync.waitProp;

public class Users {

	WebDriver driver;
	WebDriver driver2;
	WebDriverWait wait;
	
	
public Users(WebDriver driver2) {
	PageFactory.initElements(driver2, this);
	this.driver=driver2;	
	 wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	}

public void userList(WebDriver driver) {
	PageFactory.initElements(driver, this);
	this.driver=driver;

}


@FindBy(xpath="//div[@class='components_button_label'][contains(text(),'New User')]")
private WebElement newUserBtn;
@FindBy(xpath="//div[@class='userName nameInfo ellipsis'][contains(text(),'Add User')]")
private WebElement addUserTextValidation;
@FindBy(xpath="//input[@id='createUserPanel_firstNameField']")
private WebElement fristName;
@FindBy(xpath="//input[@id='createUserPanel_lastNameField']")
private WebElement lastName;
@FindBy(xpath="//input[@id='createUserPanel_emailField']")
private WebElement email;
@FindBy(xpath="//div[contains(text(),'Save & Send Invitation')]")
private WebElement saveSendInvBtn;
@FindBy(xpath ="//*[@id='createUserPanel_firstNameEmptyError']")
private WebElement errorMsgFN;
@FindBy(xpath ="//*[@id='createUserPanel_emailInvalidError']")
private WebElement errMsgEmail;
@FindBy(xpath ="(//div[@class='closeLink']/span[contains(text(),'Close')])[1]")
private WebElement closeBtn;
@FindBy(xpath="//span[@class='userNameSpan']")
private List <WebElement> selectDesiredName;


public void inputFnLnEmail(String FN,String LN,String Email) {
	fristName.sendKeys(FN);
	lastName.sendKeys(LN);
	email.sendKeys(Email);
}

public void addUserInput(String text,String firstName,String lastNam,String emails) throws InterruptedException {
	
	waitProp.fulentWait(driver, newUserBtn, 10, 2);
	newUserBtn.isDisplayed();
	System.out.println("New User button displayed");
	newUserBtn.click();
	System.out.println("clicked on new user button");
	String strTextVal =addUserTextValidation.getText();
	if(strTextVal.equalsIgnoreCase(text) ) {
		System.out.println(strTextVal+" String text is validated");
	}
//	waitProp.fulentWait(driver, fristName, 20, 2);
	Thread.sleep(2000);
//	fristName.sendKeys(firstName);
	lastName.sendKeys(lastNam);
	email.sendKeys(emails);
	saveSendInvBtn.click();
	
	//Validating Error messages for first NM and email address
	wait.until(ExpectedConditions.visibilityOf(errorMsgFN));

	if(errorMsgFN.isDisplayed()&& errorMsgFN.getText().equalsIgnoreCase("cannot be empty")) {
		System.out.println("Error message is displayed for Fist Name when kept empty");
	}else {
		System.out.println("No error message displayed");
	}
	wait.until(ExpectedConditions.visibilityOf(errMsgEmail));
	
	Assert.assertEquals(errMsgEmail.getText(), "invalid email address");
	email.clear();
	wait.until(ExpectedConditions.visibilityOf(fristName));
	fristName.click();
	wait.wait(3000);
	fristName.sendKeys(firstName);
	email.sendKeys("fiona@gmail.com");
	email.sendKeys(Keys.TAB);
	if(errMsgEmail.isDisplayed()) {
		System.out.println("Error msg is displayed");
	}else {
		System.out.println("Error msg is not displayed");
	}
	
	saveSendInvBtn.click();
	
	waitProp.fulentWait(driver, closeBtn, 10, 2);
	closeBtn.click();
	//name validation
	for(int i=0;i<selectDesiredName.size();i++) {
		String userName = selectDesiredName.get(i).getText();
		System.out.println(userName);
		if(userName.equalsIgnoreCase(lastNam+", "+firstName)) {
			Thread.sleep(3000);
			selectDesiredName.get(i).click();
			break;
		}
		else {
			System.out.println("User was not seleted or clicked");
		}
//		System.out.println(userName);
	}
	

}
	
	
	
	
	
	
	
	
	
	
}
