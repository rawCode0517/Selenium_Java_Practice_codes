package shoppingCartE2E.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import shoppingCartE2E.AbstractCompnents.abstractComponent;

public class ConfirmationPage extends abstractComponent{
	WebDriver driver;
	public ConfirmationPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


@FindBy(css=".hero-primary")
WebElement confirmationMessage;


public  String getConfirmationMessage() {
	return confirmationMessage.getText();
}


}
