package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TryCatch {
	
	@Test
	public void tryCatchTest(){
		String expVal = "google";
		String actVal = "googl1e";
		
		try {
			Assert.assertEquals(actVal, expVal);
		} catch (Throwable t){
			System.err.print("assertion failed: " + t);
		}
	}

}
