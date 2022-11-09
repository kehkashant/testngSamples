package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.ViewName;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleExtentTest {
	WebDriver driver;
    ExtentReports extentreport;
    ExtentSparkReporter sparkReport;
    ExtentTest extentTest;
    
	
	
	@BeforeMethod
	public void setupExtentReport() {
		
		extentreport = new ExtentReports(); 	
		
		//sparkReport = new ExtentSparkReporter("target/SparkReport.html").viewConfigurer().viewOrder().as(new ViewName[] {)
				//ViewName.
		//}
		
		WebDriverManager.chromedriver().setup();
		   driver = new ChromeDriver();
		  driver.manage().window().maximize();
	}
	
  @Test
  public void searchJavaTest() {
	  
	  driver.get("https://www.google.com/");
	  WebElement searchBox = driver.findElement(By.name("q"));
	  searchBox.sendKeys("Java Tutorial");
	  searchBox.submit();
	  
  }
  
  @Test
  public void seleniumTest() {
	  driver.get("https://www.google.com/");
	 // Assert.assertEquals(driver.getTitle(), "Google");
	  WebElement searchBox = driver.findElement(By.name("q"));
	  searchBox.sendKeys("Selenium Tutorial");
	  searchBox.submit(); 
  }  
 
  @AfterMethod
  public void tearDown() {
	//driver.close();  
 }
  
}
