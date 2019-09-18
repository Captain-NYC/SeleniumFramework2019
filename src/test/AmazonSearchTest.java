package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.Config;

public class AmazonSearchTest extends Config {

	// In this class, we are running each test using @Test - TestNG annotation

	@Test (priority = 1) // This method will execute first because of test priority
	public void amazonSearchForMusic(){
		System.out.println(" this is amazon MUSIC search test ");
		// enter music in edit/search box
		String expected = "music";
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys(expected);
		// click search button
		driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
		// assert if you see "music" in results or not
		WebElement exp = driver.findElement(By.xpath("//*[@id=\"search\"]/span/h1/div/div[1]/div/div/span[3]"));
		String actual = exp.getText();
		String actualValue = actual.replaceAll("\"", "");
		Assert.assertEquals(actualValue, expected);

	}

	@Test (priority = 2) // This method will execute second because of test priority
	public void amazonSearchForMovie(){
		System.out.println(" this is amazon MOVIE search test ");
		// enter "movies" in edit/search box
		String expected = "movies";
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys(expected);
		// click search button
		driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
		// assert if you see "movies" in results or not
		WebElement exp = driver.findElement(By.xpath("//*[@id=\"search\"]/span/h1/div/div[1]/div/div/span[3]"));
		String actual = exp.getText();
		String actualValue = actual.replaceAll("\"", "");
		Assert.assertEquals(actualValue, expected);

	}

	@Test (priority = 3) // This method will execute third because of test priority
	public void amazonSearchForCD(){
		System.out.println(" this is amazon CD search test ");
		// enter "cd" in edit/search box
		String expected = "cd";
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys(expected);
		// click search button
		driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
		// assert if you see "cd" in results or not
		WebElement exp = driver.findElement(By.xpath("//*[@id=\"search\"]/span/h1/div/div[1]/div/div/span[3]"));
		String actual = exp.getText();
		String actualValue = actual.replaceAll("\"", "");
		Assert.assertEquals(actualValue, expected);

	}
}
