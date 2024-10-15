package TestApplication;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {
	
	@Parameters({"URL"})
	@Test
	public void webLogin(String strUrl) {
		System.out.println("weblogin home successful");
		System.out.println(strUrl);
	}
	@Test(groups= {"Smoke"})
	public void mobileloginHome() {
		System.out.println("Mobile login home");
	}

	@Test 
	public void loginApi() {
		System.out.println("API login home");
	}
}
