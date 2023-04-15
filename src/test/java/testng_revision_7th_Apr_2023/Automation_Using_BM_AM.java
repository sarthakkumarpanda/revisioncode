package testng_revision_7th_Apr_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Automation_Using_BM_AM {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void setupBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo");
	}
	
	@Test
	public void loginTest() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}
	
	@Test
	public void registerTest() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
