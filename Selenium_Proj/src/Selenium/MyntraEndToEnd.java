package Selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MyntraEndToEnd {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		WebDriver driver = new ChromeDriver(options);
		
		
		driver.get("https://www.myntra.com");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@class]")).sendKeys("Tommy");
		Thread.sleep(3000);
		// select tommy hilfiger wallets
		java.util.List<WebElement> allSuggestion = driver.findElements(By.xpath("//ul[@class='desktop-group']/li"));
		for (int i = 0; i < allSuggestion.size(); i++) {
			if (allSuggestion.get(i).getText().equals("Tommy Hilfiger Wallets")) {

				allSuggestion.get(i).click();
				break;
			}
		}
		Thread.sleep(3000);
		// click on men radio button
		WebElement menRadioBtn = driver.findElement(By.xpath("//input[@type = 'radio'][@value='men,men women']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", menRadioBtn);
		Thread.sleep(3000);
		System.out.println("Men Radio button clicked");

		// click on maximum price webelement

		WebElement maxPriceCheck = driver.findElement(By.xpath("(//input[@type='checkbox'][@class='price-input'])[4]"));
		js.executeScript("arguments[0].click()", maxPriceCheck);

		System.out.println("Max price clicked");

		Thread.sleep(3000);

//		Alert alertPop = driver.switchTo().alert();// switch to alert
//		String alertPopMsg = driver.switchTo().alert().getText();// get the alert pop up messsage
//		System.out.println(alertPopMsg);
//		
//		alertPop.accept();

		// select color

		java.util.List<WebElement> colorOptions = driver
				.findElements(By.xpath("//span[text() ='Color']/..//span[contains(@class,'colour-label')]"));
		Thread.sleep(3000);
		for (int j = 0; j < colorOptions.size(); j++) {
			String color = colorOptions.get(j).getAttribute("data-colorhex");

			if (color.equals("brown")) {
				colorOptions.get(j).click();
				System.out.println(" The color " + color);
				break;
			}
			Thread.sleep(2000);
			System.out.println(" The color " + color);
		}
		System.out.println("Clicked on the desired color");

		// Click on the product
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='product-productMetaInfo'])[2]")).click();
		System.out.println("clicked on the product");

		// Switch to new window -

		Set<String> allWindows = driver.getWindowHandles();// why this line of code was written?
		List<String> al = new ArrayList<>(allWindows);

		for (int i = 0; i < al.size(); i++) {

			driver.switchTo().window(al.get(i));
			String title = driver.getTitle();
			if (title.contains("Two Fold Wallet")) {

				// print price of the product

				WebElement priceVal = driver.findElement(By.xpath("//span[@class='pdp-price']/strong"));
				System.out.println("Price of the product is : " + priceVal.getText());

				// print seller of the product
				WebElement sellerInfo = driver
						.findElement(By.xpath("//span[@class='SelectedSizeSellerInfo-sellerButton']"));
				System.out.println("Seller name is " + sellerInfo.getText());

				Thread.sleep(2000);
				// print product name
				WebElement prodName = driver.findElement(By.xpath("//h1[@class='pdp-name']"));
				System.out.println("The name of the product is " + prodName.getText());

				WebElement prodTitle = driver.findElement(By.xpath("//h1[@class='pdp-title']"));
				System.out.println("The title of the product is " + prodTitle.getText());

				// enter pincode
				Thread.sleep(3000);
				WebElement pinCode = driver.findElement(By.xpath("//input[@class='pincode-code']"));
				pinCode.sendKeys("753009");

				driver.findElement(By.xpath("//input[@value='Check']")).click();
				System.out.println("Clicked on the pincode check button");

				// validate pincode
				Thread.sleep(2000);
				WebElement pinCodeCheck = driver.findElement(By.xpath("//div[@class='pincode-tickcontainer']"));
				if (pinCodeCheck.isDisplayed()) {
					System.out.println("Product is available at the entered pincode");
				} else {
					System.out.println("Product is not available at the entered pincode");
				}
				// get the delivery date
				WebElement deliveryDate = driver
						.findElement(By.xpath("(//h4[@class='pincode-serviceabilityTitle'])[1]"));
				System.out.println("Delivery date is " + deliveryDate.getText());

				// click on add to bag
				WebElement addToBag = driver.findElement(By.xpath("//div[contains(@class,'add-to-bag')]"));// ----xpath
																											// writing
																											// is unique
				js.executeScript("arguments[0].click", "addToBag");
				System.out.println("Clicked on add to bag");

				// Validate add to bag
				Thread.sleep(2000);
				WebElement addedToBag = driver.findElement(By.xpath("//span[contains(@class,'desktop-iconBag')]"));
				js.executeScript("arguments[0].click", addedToBag);

				Thread.sleep(2000);
				WebElement productAdded = driver
						.findElement(By.xpath("//div[contains(@class,'itemContainer-base-brand')]"));
				if (productAdded.getText().contains("Tommy")) {
					System.out.println("The product is added to bag successfully ");
				}

			}

		}

	}

}
 