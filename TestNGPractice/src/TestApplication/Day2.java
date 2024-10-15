package TestApplication;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {
	@Test(groups ={"Smoke"})
	public void personalLoan() {
		System.out.println("go home");
	}
	
	
	@BeforeTest
	public void prerequisite() {
		System.out.println("This function will execute first");
	}
}
