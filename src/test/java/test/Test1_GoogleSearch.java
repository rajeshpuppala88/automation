package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1_GoogleSearch {
	public static void main(String[] args) throws InterruptedException {
		googleSearch();

	}
	public static void googleSearch() throws InterruptedException {
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
//			 driver.findElement(By.name("btnK")).click();
			 driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
			 List<WebElement> webEleList = driver.findElements(By.xpath("//input"));
			 System.out.println("count of webelements : "+webEleList.size());
			 Thread.sleep(5000);
			 driver.close();
			 driver.quit();
	}
}
