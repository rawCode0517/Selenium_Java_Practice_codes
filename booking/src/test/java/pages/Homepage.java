package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Sync.waitProp;

public class Homepage {
	WebDriver driver;
	JavascriptExecutor js;

	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;

	}

	@FindBy(xpath = "(//a[@id='logoutLink'])[1]")
	private WebElement logoutButton;

	@FindBy(xpath = "(//div[@class='menu_icon'])[2]")
	private WebElement settingsButton;

	@FindBy(xpath = "//div[@id='container_tasks']")
	private WebElement taskBtn;

	@FindBy(xpath = "//div[@class ='components_button expandCPPanelButton']")
	private WebElement clickCustomersAndProject;

	@FindBy(xpath="//div[@class='label' and .='Users']")
	private WebElement usersTab;
	
	public void logout() {

		waitProp wait = new waitProp();
//		wait.explicitWait(logoutButton, driver);
		wait.fulentWait(driver, logoutButton, 30, 2);
	

		logoutButton.click();
	}

	public void settingsClick() {
		settingsButton.click();
	}

	public void clickTask() {
		waitProp wait = new waitProp();
		wait.explicitWait(taskBtn, driver);
		
		taskBtn.click();
	}

	public void clickCustomerProjectBtn() {
		clickCustomersAndProject.click();
	}

	public void clickUserTab() throws InterruptedException {
//		waitProp.fulentWait(driver, usersTab, 10, 2);
		Thread.sleep(2000);
		usersTab.click();
//		js.executeScript("arguments[0].click();", usersTab);
	}

}
