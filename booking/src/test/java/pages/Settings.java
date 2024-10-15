package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Settings {
	WebDriver driver;
	
	public Settings(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	@FindBy(xpath = "//div[contains(text(),'Turn Features On / Off')]")
	private WebElement turnFeatureOnOff;
	@FindBy(xpath = "(//div[contains(text(),"
			+ "'General Settings')])[2]")
	private WebElement generalSetting;
	@FindBy(xpath ="//div[contains(text(),'Workflow Settings')]")
	private WebElement workFlowSetting;
	@FindBy(xpath = "//a[contains(text(),'Types of Work')]")
	private WebElement typesOfWork;
	@FindBy(xpath ="//a[contains(text(),'Leave Types')]")
	private WebElement leaveTypes;
	@FindBy(xpath ="//a[contains(text(),'Priority')]")
	private WebElement priority;
	@FindBy(xpath ="//a[contains(text(),'Custom Fields for Tasks')]")
	private WebElement customFields;
	@FindBy(xpath = "//a[contains(text(),'Work Statuses')]")
	private WebElement workStatus;
	@FindBy(xpath ="//a[contains(text(),'Notifications')]")
	private WebElement notificationOption;
	@FindBy(xpath ="//a[contains(text(),'Logo Settings')]")
	private WebElement logoSetting;
	@FindBy(xpath ="//div[contains(text(),'Licenses')]")
	private WebElement licencesOption;
	
	public void clickTypeOfWork() {
		
		typesOfWork.click();
		System.out.println("Clicked type of Work successfully");
	}
	
	public void clickpriorityTab() {
		priority.click();
		System.out.println("Clicked on priority tab successfully");
	}
}
