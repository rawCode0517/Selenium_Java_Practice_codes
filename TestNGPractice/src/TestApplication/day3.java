package TestApplication;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
	@BeforeClass
	public void beforeClass() {
		System.out.println("before executing any methods in the class");
	}
	@Parameters({"URL"})
	@Test
	public void webloginX(String url) {
		System.out.println("Parametrized method using Test NG to pass parameter");
		System.out.println(url);
	}
	@AfterClass
	public void afterclass() {
		System.out.println("After executing any methods in the class");
	}
	@Test
	public void webLoginCar() {
		System.out.println("weblogin car successful");
	}
	
	@Test(dataProvider="getData")
	public void mobileSignOutCar(String username ,String password) {
		System.out.println("Mobile Signout");
		System.out.println(username);
		System.out.println(password);
	}
	
	
	
	@Test(groups= {"Smoke"})
	public void mobileloginCar() {
		System.out.println("Mobile login car");
	}

	@Test 
	public void loginApiCar() {
		System.out.println("API login car");
	}
	@BeforeSuite
	public void BfSuite() {
		System.out.println("I am no. 1");
	}
	@BeforeMethod
	public void beforeEvery() {
		System.out.println("I will execute before every test method in day 3 class");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("I will execute after every test method");
	}
	
	@DataProvider
	public Object[][] getData() {
		//Login using 3 combinations of user name and password
		Object [][] data = new Object[3][2];
		//1st Set
		data[0][0]="firstUsername";
		data[0][1]="firstPassword";
		//2nd Set
		data[1][0]="secondUsername";
		data[1][1]="secondPassword";
		//3rd Set
		data[2][0]="thirdUsername";
		data[2][1]="thirdpassword";
		
		return data;
	}
}
