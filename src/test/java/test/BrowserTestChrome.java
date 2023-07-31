package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTestChrome {
	public static void main(String[] args) {
		try {
			
			System.out.println(System.getProperty("user.dir"));
			String path = "\\drivers\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + path);
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.google.com");
			driver.findElement(By.name("q")).sendKeys("hello world java program");
			Thread.sleep(5000);
			driver.close();
			driver.quit();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
