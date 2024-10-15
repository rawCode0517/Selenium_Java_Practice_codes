package BaseTest;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import shoppingCartE2E.pageobjects.LandingPage;

public class baseTest {

	public WebDriver driver;
//	public LandingPage landingPage;
	
//	public WebDriver initializeDriver() {
//		//properties class
//		Properties prop= new Properties(); 
				
//		FileInputStream fis = new FileInputStream(System.getProperty("user.dir"))+"//src/main//java//baseTest");
		
//	}
	
	public static void main(String[]args) throws InterruptedException {
		String productName ="ZARA COAT 3";
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		LandingPage landingPage = new LandingPage(driver); 
		
		driver.manage().window().maximize();
		driver.findElement(By.id("userEmail")).sendKeys("anshumanjenamani@gmail.com");
		driver.findElement(By.id("userPassword")).sendKeys("Stopit@2001");
		driver.findElement(By.id("login")).click();
		
		List<WebElement> products = driver.findElements(By.cssSelector(".mb-3"));
		WebElement prod = products.stream().filter(product->
		product.findElement(By.cssSelector("b")).getText().equals(productName)).findFirst().orElse(null);
		
		prod.findElement(By.cssSelector(".card-body button:last-of-type")).click();
	 	
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(("#toast-container"))));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".ng-animating")));
		driver.findElement(By.cssSelector("[routerlink*='cart']")).click();
		
		
		//checking the cart items
		List<WebElement> cartProducts = driver.findElements(By.cssSelector(".cartSection h3"));
		Thread.sleep(3000);		
		Boolean match = cartProducts.stream().anyMatch(cartItem-> cartItem.getText().equalsIgnoreCase(productName));
		Assert.assertTrue(match);
		
		//click on checkout button
		driver.findElement(By.cssSelector(".totalRow button")).click();
		
		Actions act = new Actions(driver);
		act.sendKeys(driver.findElement(By.cssSelector("[placeholder='Select Country']")),"india").build().perform();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ta-results")));
		driver.findElement(By.cssSelector(".ta-item:nth-of-type(2)")).click();
		driver.findElement(By.cssSelector(".action__submit")).click();
		String confirmMsg =driver.findElement(By.cssSelector(".hero-primary")).getText();
		Assert.assertTrue(confirmMsg.equalsIgnoreCase("THANKYOU FOR THE ORDER."));
		driver.close();
		System.out.println("Execution completed successfully");
		
		
		
	} 

	
}
