package base;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utils.SWDFunctions;


public class Config extends SWDFunctions {

	@BeforeMethod
	public void beforeEachMethod(){
		System.out.println("Before each method");
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/drivers/geckodriver");
		driver = new FirefoxDriver();
		driver.get("https://www.amazon.com/");
	}

	@AfterMethod
	public void afterEachMethod(){
		System.out.println("After each method");
		System.out.println (" ============  ");
		driver.quit();

	}
}
