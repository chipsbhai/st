package Pack01;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Prog01 {
	@Test
	public void testCase1() {
		System.out.println("In Test Case 1");
	}
	
	@Test
	public void testCase2() {
		System.out.println("In Test Case 2");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("In Before Method");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("In After Method");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("In Before Test");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("In After Test");
	}
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("In Before Suite");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("In After Suite");
	}
}
