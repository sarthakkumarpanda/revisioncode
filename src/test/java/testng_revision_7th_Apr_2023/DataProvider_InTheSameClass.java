package testng_revision_7th_Apr_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_InTheSameClass {
	//DataProvider annotation returns a 2-Dimensional Object array and we need to pass the rows and cols
	//You have to pass the dataPovider = name of the method inside the @DataProvider
	//You have to overload the method under the @Test with the parameters
	
	public WebDriver driver;
	
	@Test(dataProvider = "getData", dataProviderClass = DataProviderInSeparateClass.class)
	public void rediffLoginTest(String username, String password) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.id("login1")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.className("signinbtn")).click();
		driver.quit();
		
	}
	
	/*
	 * @DataProvider
	 * 
	 * public Object[][] getData() {
	 * 
	 * Object[][] data = {{"seleniumpanda@rediffmail.com", "Selenium@123"},
	 * {"seleniumpanda1@rediffmail.com", "Donkey@123"},
	 * {"chowdhurygs@rediffmail.com", "Shajlee1@"},
	 * {"Mohamedboudguig@rediffmail.com", "Medbdg0707@"},
	 * {"homa_rahimi@rediffmail.com", "Winter2021?"}};
	 * 
	 * return data; }
	 */
	}


