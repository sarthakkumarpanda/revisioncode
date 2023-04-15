package testng_revision_7th_Apr_2023;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AlwaysRun_True {
	
	@Test(priority = 1)
	public void setUpTest() {
		System.out.println("This is test case1");
		Assert.fail();
	}

	@Test(priority = 2, dependsOnMethods = "setUpTest", alwaysRun = true)
	public void registerTest() {
		System.out.println("This is test case2");
	}

	@Test(priority = 3, dependsOnMethods = {"setUpTest", "registerTest"}, alwaysRun = true)
	public void loginTest() {
		System.out.println("This is test case3");
	}
	
	@Test(enabled = false, priority = 4, dependsOnMethods = {"setUpTest", "registerTest", "loginTest"}, alwaysRun = true)
	public void logoutTest() {
		System.out.println("this is test case4");
	}

}
