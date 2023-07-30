package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest {
	public static void main(String[] args) throws InterruptedException {
		
		  WebDriverManager.chromedriver().setup(); 
		  WebDriver driver = new ChromeDriver();
		 
		/*
		 * WebDriverManager.firefoxdriver().setup(); 
		 * WebDriver driver = new FirefoxDriver();
		 */
		 driver.get("https://www.google.com/");
		/*
		 * driver.findElement(By.id("APjFqb")).sendKeys("hello world java");
		 * driver.findElement(By.name("btnK")).click();
		 */
		 driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("hello world java");
		 List<WebElement> webEleList = driver.findElements(By.xpath("//input"));
		 System.out.println("count of webelements : "+webEleList.size());
		 Thread.sleep(5000);
		 driver.close();
		 driver.quit();
	}
}
