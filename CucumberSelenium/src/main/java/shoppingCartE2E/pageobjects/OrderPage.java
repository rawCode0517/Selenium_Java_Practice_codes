package shoppingCartE2E.pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import shoppingCartE2E.AbstractCompnents.abstractComponent;

public class OrderPage extends abstractComponent{

	WebDriver driver;
	
	@FindBy(css=".totalRow button")
	WebElement checkoutEle;
	
	@FindBy(css="tr td:nth-child(3)")
	private List<WebElement> productNames;
	
	public OrderPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public Boolean VerifyOrderDisplay(String productName) {
		
		Boolean match = productNames.stream().anyMatch(product-> product.getText().equalsIgnoreCase(productName));
		
		return match;
		
	}

	
	
}
