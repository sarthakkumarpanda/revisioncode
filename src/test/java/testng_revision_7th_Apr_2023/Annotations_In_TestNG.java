package testng_revision_7th_Apr_2023;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations_In_TestNG {
	
	@BeforeSuite
	public void beforeSuiteAnnotation() {
		System.out.println("This is Before Suite which shall execute first");
	}
	
	@BeforeTest
	public void beforeTestAnnotation() {
		System.out.println("This is Before Test annotation which shall execute after @BeforeSuite");
	}
	
	@BeforeClass
	public void beforeClassAnnotation() {
		System.out.println("This is Before Class annotation which shall execute after @BeforeTest");
	}
	
	@BeforeMethod
	public void beforeMethodAnnotation() {
		System.out.println("This is Before Method annotation which shall execute after @BeforeClass");	
	}
	
	@Test
	public void testCase1() {
		System.out.println("Test Case 1");
	}
	
	@Test
	public void testCase2() {
		System.out.println("Test Case 2");
	}
	
	@AfterMethod
	public void afterMethodAnnotation() {
		System.out.println("After Method annotation");
	}
	
	@AfterClass
	public void afterClassAnnotation() {
		System.out.println("After Class annotation");
	}
	
	@AfterTest
	public void afterTestAnnotation() {
		System.out.println("After Test annotation");
	}
	
	@AfterSuite
	public void afterSuiteAnnotation() {
		System.out.println("After suite annotation");
	}
	

	

}
