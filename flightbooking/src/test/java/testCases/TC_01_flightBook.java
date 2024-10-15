package testCases;


import org.testng.annotations.Test;

import basePage.homePagFlight;
import baseTest.browserLaunch;

public class TC_01_flightBook extends browserLaunch 
{
	@Test
	public void americanAirlines() throws InterruptedException
	{
		homePagFlight hp = new homePagFlight(driver);
		hp.enterFromCity("SAN");
		hp.selectCity("San Sebastian (EAS), Spain");
		hp.enterToCity("BGR");
		System.out.println("run successful");
	}
}