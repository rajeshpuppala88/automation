package extentreports;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentreportDemo {
	
	private static WebDriver driver = null;

	public static void main(String[] args) {

		ExtentReports extent = new ExtentReports();
        ExtentSparkReporter spark = new ExtentSparkReporter("extentreport.html");
        extent.attachReporter(spark);
        
        ExtentTest test = extent.createTest("GoogleSearchTest1");
        
        test.log(Status.INFO, "Starting test case");
      
    	System.out.println(System.getProperty("user.dir"));
		String path = "\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + path);
		
        driver = new ChromeDriver();
        
        
        driver.get("https://www.google.com/");
        
        test.pass("navigated to google.com");
        
        driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("hello world java");
        
//        driver.findElement(By.name("q")).sendKeys("Automation");
        
        test.pass("entered text in search box");
        
//        driver.findElement(By.className("gNO89b")).sendKeys(Keys.RETURN);
        driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
        
        test.pass("clicked on keyboard - entry key");
        
        driver.close();
        
        driver.quit();
        
        test.pass("closed browser");
        
        test.pass("test completed");
        
        extent.flush();
	}

}
