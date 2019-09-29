package test;

import org.testng.annotations.Test;

import base.Config;
import locators.Amazon_Loc;
import values.AmazonValues;

public class LoginWithValidEmail extends Config {
	
	Amazon_Loc al = new Amazon_Loc();
	AmazonValues av = new AmazonValues();

	@Test
	public void loginWithValidEmail(){
		System.out.println(" Amazon login test");
		//driver.findElement(By.xpath(al.LoginHover)).click();
		clickByXpath(al.LoginHoverOver);
		//driver.findElement(By.xpath(al.loginButton)).click();
		clickByXpath(al.loginButton);
		//driver.findElement(By.xpath(al.email_phoneField)).sendKeys(av.emailVal);
		typeByXpath (al.email_phoneField, av.loginEmail);
	}

}
