package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTestMozilla {
	public static void main(String[] args) {
		try {
			System.out.println(System.getProperty("user.dir"));
			String path = "\\drivers\\geckodriver.exe";
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + path);
			
			WebDriver driver = new FirefoxDriver();
			
			driver.get("https://www.google.com");
			driver.findElement(By.id("//input[@name'APjFqb']")).sendKeys("hello world java program");
			Thread.sleep(5000);
			driver.close();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
