package testng_revision_7th_Apr_2023;

import org.testng.annotations.DataProvider;

public class DataProviderInSeparateClass {
	
@DataProvider
	
	public static Object[][] getData() {
		
		Object[][] data = {{"seleniumpanda@rediffmail.com", "Selenium@123"},
				           {"seleniumpanda1@rediffmail.com", "Donkey@123"},
				           {"chowdhurygs@rediffmail.com", "Shajlee1@"},
				           {"Mohamedboudguig@rediffmail.com", "Medbdg0707@"},
				           {"homa_rahimi@rediffmail.com", "Winter2021?"}};
		
		return data;
		}



}
