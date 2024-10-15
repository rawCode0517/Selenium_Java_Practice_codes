package BaseTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BaseTest.TestComponents.BaseTest;
import shoppingCartE2E.pageobjects.CartPage;
import shoppingCartE2E.pageobjects.CheckoutPage;
import shoppingCartE2E.pageobjects.ConfirmationPage;
import shoppingCartE2E.pageobjects.LandingPage;
import shoppingCartE2E.pageobjects.OrderPage;
import shoppingCartE2E.pageobjects.ProductCatalogue;

public class SubmitOrderTest extends BaseTest{

//	String productName ="ZARA COAT 3";	
//	public WebDriver driver;
//	public LandingPage landingPage;
	
//	public WebDriver initializeDriver() {
//		//properties class
//		Properties prop= new Properties(); 
				
//		FileInputStream fis = new FileInputStream(System.getProperty("user.dir"))+"//src/main//java//baseTest");
		
//	}
	@Test(dataProvider ="fetchData",groups= {"Purchase"})
	public void submitOrder(HashMap<String, String> input) throws IOException {
		
//	public static void main(String[]args)  {
		
		
//		LandingPage LandingPage = launchApplication();
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get("https://rahulshettyacademy.com/client");
				 
		
//		driver.findElement(By.id("userEmail")).sendKeys("anshumanjenamani@gmail.com");
//		driver.findElement(By.id("userPassword")).sendKeys("Stopit@2001");
//		driver.findElement(By.id("login")).click();
//		driver.manage().window().maximize();
//		LandingPage landingPage = new LandingPage(driver); 
//		landingPage.goToUrl();
		ProductCatalogue prodCat= landingPage.loginApplication(input.get("email"), input.get("password"));
//		ProductCatalogue prodCat = new ProductCatalogue(driver);
		List <WebElement>products =prodCat.getProductList();		
		prodCat.addProductToCart(input.get("product"));
		CartPage cartPage = prodCat.goToCartPage();	
		Boolean match =cartPage.VerifyProductDisplay(input.get("product"));
		Assert.assertTrue(match);
		cartPage.goToCheckout();
		CheckoutPage checkoutPage =new CheckoutPage(driver);
		checkoutPage.selectCountry("India");
		checkoutPage.submitOrder();
		ConfirmationPage confirmationPage = checkoutPage.submitOrder();
		String confirmMsg = confirmationPage.getConfirmationMessage();
		Assert.assertTrue(confirmMsg.equalsIgnoreCase("THANKYOU FOR THE ORDER."));
		System.out.println("Execution completed successfully");
		
		
//		WebElement prod = products.stream().filter(product->
//		product.findElement(By.cssSelector("b")).getText().equals(productName)).findFirst().orElse(null);
		
//		prod.findElement(By.cssSelector(".card-body button:last-of-type")).click();
	 	 
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(("#toast-container"))));
//		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".ng-animating")));
//		driver.findElement(By.cssSelector("[routerlink*='cart']")).click();
		
		
		//checking the cart items
//		List<WebElement> cartProducts = driver.findElements(By.cssSelector(".cartSection h3"));
//		Thread.sleep(3000);		
//		Boolean match = cartProducts.stream().anyMatch(cartItem-> cartItem.getText().equalsIgnoreCase(productName));

		
		
		//click on checkout button
//		driver.findElement(By.cssSelector(".totalRow button")).click();
		
//		Actions act = new Actions(driver);
//		act.sendKeys(driver.findElement(By.cssSelector("[placeholder='Select Country']")),"india").build().perform();
////		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ta-results")));
//		driver.findElement(By.cssSelector(".ta-item:nth-of-type(2)")).click();
//		driver.findElement(By.cssSelector(".action__submit")).click();
//		String confirmMsg =driver.findElement(By.cssSelector(".hero-primary")).getText();
//		Assert.assertTrue(confirmMsg.equalsIgnoreCase("THANKYOU FOR THE ORDER."));
//		driver.close();
//		System.out.println("Execution completed successfully");	
	} 

	
	//Verify zara coat 3 is displaying in Orders page
	@Test  (dependsOnMethods = {"submitOrder"})
	public void orderHistoryTest() {
		

		ProductCatalogue prodCat= landingPage.loginApplication("anshumanjenamani@gmail.com", "Stopit@2001");
		 OrderPage ordPage =prodCat.goToOrdersPage();
//		 Assert.assertTrue(ordPage.VerifyOrderDisplay(productName));
		
	}
//	C://Users//anshu//OneDrive//Desktop//Automation_Sel//CucumberSelenium//src//test//java//dataPackage//PurchaseOrder.json
	@DataProvider
	public Object[][] fetchData() throws IOException {
		
		List<HashMap<String,String>> data = getjsondataToMap("C://Users//anshu//OneDrive//Desktop//Automation_Sel//CucumberSelenium//src//test//java//dataPackage//PurchaseOrder.json");
//				System.getProperty("user.dir")+"src//test//java//dataPackage//PurchaseOrder.json");
		return new Object [][] {{data.get(0)},{data.get(1)},{data.get(2)}};
	}
//	HashMap map = new HashMap();
//	map.put("email","anshumanjenamani@gmail.com");
//	map.put("password", "Stopit@2001");
//	map.put("product", "ZARA COAT 3");
//	
//	HashMap map1 = new HashMap();
//	map1.put("email","anshumanjenamani@gmail.com");
//	map1.put("password", "Stopit@2001");
//	map1.put("product", "ADIDAS ORIGINAL");
//	
//	HashMap map2 = new HashMap();
//	map2.put("email","anshumanjenamani@gmail.com");
//	map2.put("password", "Stopit@2001");
//	map2.put("product", "IPHONE 13 PRO");
	

	
	
	
}
