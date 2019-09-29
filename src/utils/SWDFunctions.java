package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SWDFunctions {
	
	public WebDriver driver;
	
		// click
		public void clickByXpath(String loctor){
			driver.findElement(By.xpath(loctor)).click();
		}
		public void clickByCss(String loctor){
			driver.findElement(By.cssSelector(loctor)).click();
		}
		public void clickById(String loctor){
			driver.findElement(By.id(loctor)).click();
		}
		// type
		public void typeByXpath (String loc, String value){
			driver.findElement(By.xpath(loc)).sendKeys(value);
		}
		
		
		//drop-down
		
		
		// radioButton
		
		
		// clear cookies
		
		
		// max window
		
		
		//  Alert/Pop up window
		
		
		
		// drag n drop
		
	

}
