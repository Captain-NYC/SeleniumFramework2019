package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.Config;

public class AmazonSearchTest extends Config {

	// In this class, we are running each test using @Test - TestNG annotation

	@Test
	public void amazonSearchForMusic(){
		System.out.println(" this is amazon MUSIC search test ");
		// enter "music" in edit/search box
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("music");

		// click search button
		driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();

		// assert if you see "music" in results or not
		WebElement exp = driver.findElement(By.xpath("//*[@id=\"search\"]/span/h1/div/div[1]/div/div/span[3]"));
		System.out.println(exp.getText());

		if(exp.getText().equalsIgnoreCase("\"music\""))
		{
			System.out.println("Yes I can see \"music\" in the search results");
		}
		else
		{
			System.out.println("\"music\" text is not found");
		}

		String expected = "\"music\"";
		String actual = exp.getText();
		System.out.println(actual); //this will print out the actual result

		// assertion - verify
		if(expected.equalsIgnoreCase(actual))
		{
			System.out.println("This music search test passed");
		}
		else
		{
			System.out.println("There is a bug report immediately ");
		}
	}
	@Test
	public void amazonSearchForMovie(){
		System.out.println(" this is amazon MOVIE search test ");
		// enter "movies" in edit/search box
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("movies");

		// click search button
		driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();

		// assert if you see "movies" in results or not
		WebElement exp = driver.findElement(By.xpath("//*[@id=\"search\"]/span/h1/div/div[1]/div/div/span[3]"));
		System.out.println(exp.getText());

		if(exp.getText().equalsIgnoreCase("\"movies\""))
		{
			System.out.println("Yes I can see \"movies\" in the search results");
		}
		else
		{
			System.out.println("\"movies\" text is not found");
		}

		String expected = "\"movies\"";
		String actual = exp.getText();
		System.out.println(actual); //this will print out the actual result

		// assertion - verify
		if(expected.equalsIgnoreCase(actual))
		{
			System.out.println("This movie search test passed");
		}
		else
		{
			System.out.println("There is a bug report immediately ");
		}

	}
	@Test
	public void amazonSearchForCD(){
		System.out.println(" this is amazon CD search test ");
		// enter "cd" in edit/search box
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("cd");

		// click search button
		driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();

		// assert if you see music in results or not
		WebElement exp = driver.findElement(By.xpath("//*[@id=\"search\"]/span/h1/div/div[1]/div/div/span[3]"));
		System.out.println(exp.getText());

		if(exp.getText().equalsIgnoreCase("\"cd\""))
		{
			System.out.println("Yes I can see \"cd\" in the search results");
		}
		else
		{
			System.out.println("\"cd\" text is not found");
		}

		String expected = "\"cd\"";
		String actual = exp.getText();
		System.out.println(actual); //this will print out the actual result

		// assertion - verify
		if(expected.equalsIgnoreCase(actual))
		{
			System.out.println("This cd search test passed");
		}
		else
		{
			System.out.println("There is a bug report immediately ");
		}

	}
}
