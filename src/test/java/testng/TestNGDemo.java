package testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo {
	
	WebDriver driver = null;
	
	@BeforeTest
	public void setUpTest() {
		driver = new ChromeDriver();
	}

	@Test
	public void googleSearch(){
	
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
	}
	
	@AfterTest
	public void tearDownTest() {
		 driver.close();
		 driver.quit();
		 System.out.println("Test completed successfully");
	}
}
