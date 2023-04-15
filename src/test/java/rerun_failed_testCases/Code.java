package rerun_failed_testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Code {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void rediffLoginTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		
	}
	
	@Test(priority = 1)
	public void clickOnSigninLink() {
		driver.findElement(By.linkText("Sign in")).click();
	}
	
	@Test(priority = 2, retryAnalyzer = MyRetry.class)
	public void enterValidCredentials() {
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
		driver.findElement(By.className("signinbtn")).click();
		Assert.fail("just failing it");
	}
	

}
