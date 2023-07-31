package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageObjects {
	
	WebDriver driver = null;
	
	public GoogleSearchPageObjects(WebDriver driver) {
		this.driver = driver;
	}
	
	By textbox_search = By.id("APjFqb");
	
	By button_search = By.name("btnK");
	
	public void setTextInSearch(String text) {
		driver.findElement(textbox_search).sendKeys(text);
	}
	
	public void clickButtonSearch() {
		driver.findElement(textbox_search).sendKeys(Keys.RETURN);
	}

}
