package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Config {
	WebDriver driver;

	@BeforeMethod
	public void beforeEachMethod(){
		System.out.println("Before each method");
		System.setProperty("webdriver.chrome.driver","‎⁨/Users⁩/Sadek⁩/⁨Documents⁩/GitHub⁩/⁨SeleniumFramework2019/drivers/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
	}

	@AfterMethod
	public void afterEachMethod(){
		System.out.println("After each method");
		System.out.println (" ==========  ");
		driver.quit();

	}
}
