package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageobjects.GoogleSearchPageObjects;

public class GoogleSearchPageTest {
	
	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		googleSearchText();
	}
	
	public static void googleSearchText() {
		
		driver = new ChromeDriver();
		GoogleSearchPageObjects obj = new GoogleSearchPageObjects(driver);
		
		driver.get("https://www.google.com");
		
		obj.setTextInSearch("A B C D");
		obj.clickButtonSearch();
		
		driver.close();
	}
}
