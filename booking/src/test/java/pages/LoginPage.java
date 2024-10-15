package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;

		
	}
	@FindBy(xpath = "//input[@name='username']")
	private WebElement userName;
	@FindBy(xpath = "//input[@name='pwd']")
	private WebElement UserPwd;
	@FindBy(xpath = "//div[text()='Login ']")
	private WebElement loginButton;

	
	
	public void login(String username, String Password) {
		System.out.println(driver.getTitle());
		userName.sendKeys(username);
		UserPwd.sendKeys(Password);
		
		
		loginButton.click();
	}
}
