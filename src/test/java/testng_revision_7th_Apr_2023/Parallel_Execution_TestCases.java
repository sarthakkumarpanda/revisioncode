package testng_revision_7th_Apr_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Parallel_Execution_TestCases {
	
	//Parallel execution means - executing test cases parallely not sequentially
	//Parallel execution via Tests
	//Parallel execution via Methods
	//Parallel execution via Classes
	public WebDriver driver;
	public SoftAssert softassert = new SoftAssert();
	
	
	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo");
	}
	
	@Test(priority = 1, dataProvider="TN")
	public void verifyLoginWithValidCredentials(String username, String password) {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(username);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		String actualEditAccInfo = driver.findElement(By.xpath("//a[contains(text(), 'Edit your account information')]")).getText();
		String expectedEditAccInfo = "Edit your account information";
		softassert.assertTrue(actualEditAccInfo.contains(expectedEditAccInfo), "no it does not");
		
		softassert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());
		softassert.assertAll();
	}
	
	@DataProvider(name = "TN", parallel = true)
	public Object[][] getData() {
		Object[][] data = {{"seleniumpanda@gmail.com", "Selenium@123"},
				           {"seleniumpanda1@gmail.com", "Selenium@123"},
				           {"seleniumpanda2@gmail.com", "Selenium@123"}};
		return data;
		}
	
	
	@Test(priority = 2, enabled = false)
	public void verifyRegisteringAccountWithExistingCredentials() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("input-firstname")).sendKeys("Selenium");
		driver.findElement(By.id("input-lastname")).sendKeys("Panda");
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-telephone")).sendKeys("9876543210");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.id("input-confirm")).sendKeys("Selenium@123");
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		String actualWarningMessage = driver.findElement(By.xpath("//div[contains(@class, 'alert-dismissible')]")).getText();
		String expectedWarningMessage = "Warning: E-Mail Address is already registered!";
	    softassert.assertEquals(actualWarningMessage,expectedWarningMessage );
	    
	    //certain logic which works
	    
	    softassert.assertAll();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}


