package testng_revision_7th_Apr_2023;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BM_T_AM_TriCombo {

	@BeforeMethod
	public void bm() {
		System.out.println("this is BeforeMethod Annotation");
	}

	@Test(priority = 1)
	public void abcd() {
		System.out.println("This is test case1");
		//Assert.fail();
	}

	@Test(priority = 4)
	public void hello() {
		System.out.println("This is test case2");
	}

	@Test(priority = 3)
	public void aahello() {
		System.out.println("This is test case3");
	}
	
	@Test(priority = 2)
	public void zycsk() {
		System.out.println("this is test case4");
	}

	@AfterMethod
	public void am() {
		System.out.println("This is after method annotation");
	}

}
