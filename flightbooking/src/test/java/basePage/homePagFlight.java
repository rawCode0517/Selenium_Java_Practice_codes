package basePage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePagFlight
{
	public WebDriver driver;
	
	@FindBy(id="reservationFlightSearchForm.originAirport")
	private WebElement fromCity;
	
	@FindBy(name="destination")
	private WebElement toCity;
	
	@FindBy(id="//a[@class='ui-corner-all']")
	private List<WebElement> citiesNames;

	public homePagFlight(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void enterFromCity(String city) {
		fromCity.sendKeys(city);
		System.out.println("Entered from city" + city);
	}
	public void enterToCity(String city) {
	toCity.sendKeys(city);
	System.out.println("Entered from city" + city);
	}

	public void selectCity(String cityName) throws InterruptedException {
		
		for(int i = 0;i<citiesNames.size();i++) 
		{		
			System.out.println(citiesNames.get(i).getText());
			
			if(citiesNames.get(i).getText().equalsIgnoreCase(cityName)) {
				Thread.sleep(4000);
				citiesNames.get(i).click();	
				
			}
			System.out.println(citiesNames+" is successfully selected");
		}
	}

}