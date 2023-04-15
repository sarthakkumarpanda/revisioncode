package testng_revision_7th_Apr_2023;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions_in_TestNG {
	// Assert
	// SoftAssert - you have to create the Object of SoftAssert class
	SoftAssert softassert = new SoftAssert();

	@Test
	public void tc1() {
		int i = 1;
		int j = 2;

		if (i > j) {
			System.out.println("Print the value of i :" + i);
		} else {
			System.out.println("Print the value of j : " + j);
		}
		
		Assert.assertTrue(true == false);        //this condition is actually false
		
		Assert.assertEquals(false, false);       //this condition is true
		
		System.out.println("Print this subtraction:" + (20-10));
		
	}

	@Test
	public void tc2() {
		int i = 1;
		int j = 2;

		if (i > j) {
			System.out.println("Print the value of i :" + i);
		} else {
			System.out.println("Print the value of j : " + j);
		}
		
		
		softassert.assertEquals(true, false);   //this is a false statement
		
		System.out.println("Adding two numbers : " + (1+2));
		
		softassert.assertAll();
	}

}
