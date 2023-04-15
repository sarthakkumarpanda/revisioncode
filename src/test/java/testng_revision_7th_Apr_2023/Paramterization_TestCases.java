package testng_revision_7th_Apr_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Paramterization_TestCases {

	public WebDriver driver;
	
	@Test
	@Parameters({"Browser", "url", "email", "password"})
	public void tutorialsNinjaLoginTest(String Browser, String url, String email, String password) {
		if(Browser.equals("chrome")) {
		driver = new ChromeDriver();
		} else if(Browser.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(email);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}
}
