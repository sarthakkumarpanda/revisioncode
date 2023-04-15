package testng_revision_7th_Apr_2023;

import org.testng.annotations.Test;

//What are Groups
//How to create Groups
//How to execute Groups
//What are MetaGroups
//Use Regular Expressions
//Groups at a Class Level

//Night time - certain test cases only late night


@Test(groups = "CompleteClassLevelTests")
public class Groups_InTestNG {
	
	@Test(groups = {"windows.smoke"})
	public void tc1() {
		System.out.println("This is test case1");
	}
	
	@Test(groups = {"smoke", "sanity"})
	public void tc2() {
		System.out.println("This is test case2");
	}
	
	@Test(groups = {"smoke", "sanity", "regression"})
	public void tc3() {
		System.out.println("This is test case3");
	}
	
	@Test(groups = {"windows.sanity"})
	public void tc4() {
		System.out.println("This is test case4");
	}
	
	@Test(groups = {"macOS.regression"})
	public void tc5() {
		System.out.println("This is test case5");
	}


}
