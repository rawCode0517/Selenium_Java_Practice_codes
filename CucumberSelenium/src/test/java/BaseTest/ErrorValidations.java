package BaseTest;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseTest.TestComponents.BaseTest;
import shoppingCartE2E.pageobjects.CartPage;
import shoppingCartE2E.pageobjects.ProductCatalogue;

public class ErrorValidations extends BaseTest{


	@Test(groups= {"ErrorHandling"})
	public void submitOrder() throws IOException {
		

		String productName ="ZARA COAT 3";
		landingPage.loginApplication("anshumanjenamani@gmail.com", "Stopit@2002");
		Assert.assertEquals("Incorrect email or passwoord.", landingPage.getErrorMessage());		
	} 

	@Test
	public void productNameErrorValidation() throws IOException {
		

		String productName ="ZARA COAT 3";
		ProductCatalogue prodCat= landingPage.loginApplication("anshumanjenamani@gmail.com", "Stopit@2001");
		List <WebElement>products =prodCat.getProductList();		
		prodCat.addProductToCart(productName);
		CartPage cartPage = prodCat.goToCartPage();	
		Boolean match =cartPage.VerifyProductDisplay("ZARA COAT 33");
		Assert.assertFalse(match);
	}


}
