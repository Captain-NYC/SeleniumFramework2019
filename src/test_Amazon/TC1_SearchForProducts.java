package test_Amazon;

import org.testng.annotations.Test;

import base.Config;

public class TC1_SearchForProducts extends Config {

	// In this class, we are running each test using @Test - TestNG annotation

	@Test
	public void amazonSearchForMusic(){
		System.out.println(" this is amazon MUSIC search test ");
		// enter "music" in edit/search box
		// click search button
		// assert if you see music in results or not
		//String exp = "music";
		//String act = "//*[@id="search"]/span/h1/div/div[1]/div/div/span[3]";
		// assertion - verify
		//driver.quit();

	}
	@Test
	public void amazonSearchForMovie(){
		System.out.println(" this is amazon MOVIE search test ");
		// enter "movies" in edit/search box
		// click search button
		// assert if you see music in results or not
		//String exp = "music";
		//String act = "//*[@id="search"]/span/h1/div/div[1]/div/div/span[3]";
		// assertion - verify

	}
	@Test
	public void amazonSearchForCD(){
		System.out.println(" this is amazon CD search test ");
		// enter "cd" in edit/search box
		// click search button
		// assert if you see music in results or not
		//String exp = "music";
		//String act = "//*[@id="search"]/span/h1/div/div[1]/div/div/span[3]";
		// assertion - verify



	}


}
