package testng_revision_7th_Apr_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Applying_Assertions_AutomationCode {
	
	public WebDriver driver;
	public SoftAssert softassert = new SoftAssert();
	
    @BeforeMethod
    public void setup() {
    	driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("https://rediff.com");
    }
    
    @Test
    public void clickOnSigninLink() {
    	WebElement signinLink = driver.findElement(By.className("signin"));
    	softassert.assertTrue(signinLink.isDisplayed()); //true
    	signinLink.click();
    	
    	softassert.assertAll();
    }
    
    @Test
    public void enterLoginCredentials() {
    	driver.findElement(By.className("signin")).click();
    	WebElement usernameTextbox = driver.findElement(By.id("login1"));
    	WebElement passwordTextbox = driver.findElement(By.id("password"));
    	
    	softassert.assertTrue(usernameTextbox.isEnabled() && passwordTextbox.isEnabled(), "Both textboxes are in disabled state");
    	usernameTextbox.sendKeys("seleniumpanda@rediffmail.com");
    	passwordTextbox.sendKeys("Selenium@123");
    	
    	WebElement signinButton = driver.findElement(By.className("signinbtn"));
    	softassert.assertTrue(signinButton.isEnabled());
    	signinButton.click();
    	
    	softassert.assertAll();
    }
    
    @AfterMethod
    public void tearDown() {
    	driver.quit();
    }

}
