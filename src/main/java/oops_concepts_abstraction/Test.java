package oops_concepts_abstraction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test implements Knowledge{

	public static void main(String[] args) {
		//Can I create the Object of interface
		//Absolutely NO
		
		Test test = new Test();
		test.display();
		test.displayDemo();
		
		Knowledge knowref = new Test();
		knowref.display();
		knowref.displayDemo();
		
		
		
		WebDriver driver = new ChromeDriver();
		//WebDriver is the interface
		//ChromeDriver is the implementing Class
		driver.manage().window().maximize();

	}

	@Override
	public void display() {
		
		
	}

	@Override
	public void displayDemo() {
		
		
	}

}
