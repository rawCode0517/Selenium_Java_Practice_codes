package TestApplication;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class BasicsDay1 {

	@AfterTest
	public void lastExecution() {
		System.out.println("This function will execute last");
		
	}
	
	@Test
	public void demo() {
		System.out.println("Hello World");
		Assert.assertTrue(false);
	}
	
	@Test
	public void SecondTest() {
		System.out.println("bye");
	}
	@AfterSuite
	public void AFSuite() {
		System.out.println("I am no. 1 from last");
	}
}
