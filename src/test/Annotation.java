package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation {

	@BeforeSuite
	public void beforeSuiteStart(){
		System.out.println ("BEFORE SUITE -- Connect db");
		// GET CURRENT TIME - 11:05
	}
	@BeforeTest
	public void beforeTestsStart(){
		System.out.println ("Before all the test start");
		// OPEN CRHOME
		// GO TO AMAZON
	}
	@AfterTest
	public void afterTestsDone(){
		System.out.println ("After all the test END");
		// CLOSE BROWSER
	}
	@AfterSuite
	public void afterSuiteEnd(){
		System.out.println ("AFTER SUITE -- Disconnect from db");
		// GET CURRENT TIME 12PM
		// JAVA CODE 
	}

	@BeforeMethod
	public void beforeEachMethod(){
		System.out.println (" before method test -- should happen before every single test");
	}

	@AfterMethod
	public void afterEachMethod(){
		System.out.println (" after method test -- should happen after every single test");
	}

	@Test
	public void test2(){ // method or function
		System.out.println ("test2");
	}

	@Test
	public void test4(){
		System.out.println ("test4");
		// selenium script
	}

	@Test
	public void test3(){
		System.out.println ("test3");
		// selenium script
	}

}
