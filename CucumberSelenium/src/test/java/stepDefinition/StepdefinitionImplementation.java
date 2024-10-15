package stepDefinition;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import BaseTest.baseTest;
import BaseTest.TestComponents.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import shoppingCartE2E.pageobjects.CartPage;
import shoppingCartE2E.pageobjects.CheckoutPage;
import shoppingCartE2E.pageobjects.ConfirmationPage;
import shoppingCartE2E.pageobjects.LandingPage;
import shoppingCartE2E.pageobjects.ProductCatalogue;

public class StepdefinitionImplementation extends BaseTest{

	public LandingPage landingPage;
	public ProductCatalogue prodCat;
	public ConfirmationPage confirmationPage;
	public CartPage cartPage;
	@Given("I landed on Ecommerce Page")
	public void I_landed_on_Ecommerce_Page() throws IOException {
		landingPage =launchApplication();
	}
	
	@Given ("^Logged in with username (.+) and password (.+)$")
	public void logged_in_username_and_password(String userName, String password) {
	prodCat= landingPage.loginApplication(userName, password);
		
	}
	@When("^I add the product (.+) to the cart$")
	public void I_add_product_to_cart(String productName) {
		List <WebElement>products =prodCat.getProductList();		
		prodCat.addProductToCart(productName);
	}
	
	@When("^Checkout (.+) and submit the order$")
	public void checkout_submit_order(String productName) {
		 cartPage = prodCat.goToCartPage();	
		Boolean match =cartPage.VerifyProductDisplay(productName);
		Assert.assertTrue(match);
		cartPage.goToCheckout();
		CheckoutPage checkoutPage =new CheckoutPage(driver);
		checkoutPage.selectCountry("India");
		checkoutPage.submitOrder();
		 confirmationPage = checkoutPage.submitOrder();
	}
	
	
	@Then("{string} message is displayed on ConfirmationPage")
	public void messageDisplayedComfirmationPage(String string) {
	
		String confirmMsg = confirmationPage.getConfirmationMessage();
		Assert.assertTrue(confirmMsg.equalsIgnoreCase(string));
		driver.close();
	
	}
		
	@Then("{string} message is displayed")
	public void ErrorMessageDisplayedLogin(String string) {
		
		Assert.assertEquals(string, landingPage.getErrorMessage());
		driver.close();
	}
	

}
