package test;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class PriorityAndSkipTest {

	@Test (priority = 2)
	public void test4(){
		System.out.println ("Logout");
		// selenium script
	}

	@Test (priority = 1)
	public void test3(){
		System.out.println ("change my profile pic");
		// selenium script
	}
	@Test (priority = 3)
	public void newFeature(){
		System.out.println ("working on new test cases");
		// selenium script
		throw new SkipException ("Skipping because i am still working on this automaiton test: JIRA-343");

	}

	@Test (enabled = false)
	public void dontRun(){
		System.out.println ("I don't want to run this test");
		// selenium script

	}

	@Test (priority = 0)
	public void test2(){ // method or function
		System.out.println ("Login");
	}

}
