package shoppingCartE2E.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import shoppingCartE2E.AbstractCompnents.abstractComponent;

public class LandingPage extends abstractComponent {
	WebDriver driver;

 
	public LandingPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
//	WebElement userEmail =driver.findElement(By.id("userEmail"));
	//pagefactory
	@FindBy(id="userEmail")
	WebElement userEmail;
	@FindBy(id ="userPassword")
	WebElement elePassword;
	@FindBy(id="login")
	WebElement SubmitBtn;
	
	@FindBy(css="[class*='flyInOut']")
	WebElement errorMessage;
	

	//These functions are called as Action methods, like login, logout etc.
	public ProductCatalogue loginApplication(String email,String password) {
		userEmail.sendKeys(email);
		elePassword.sendKeys(password);
		SubmitBtn.click();
		ProductCatalogue prodCat = new ProductCatalogue(driver);
		return prodCat;
	}
	
	public String getErrorMessage() {
		waitForWebElementToAppear(errorMessage);
		return errorMessage.getText();
		 
	}
	

	public void goToUrl() {

		driver.get("https://rahulshettyacademy.com/client");
	}
	
	
	
	}
