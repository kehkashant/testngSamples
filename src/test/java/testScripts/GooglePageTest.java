package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;




public class GooglePageTest {
	WebDriver driver;

	@BeforeMethod
	public void setup() {
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
  
  
  @Test(alwaysRun = true , dependsOnMethods = "searchJavaTest")
  public void seleniumTest() {
	  driver.get("https://www.google.com/");
	 // Assert.assertEquals(driver.getTitle(), "Google");
	  WebElement searchBox = driver.findElement(By.name("q"));
	  searchBox.sendKeys("Selenium Tutorial");
	  searchBox.submit();
	  
	  
  }
  
  @Test
  
  public void appiumTest() {
	  driver.get("https://www.google.com/");
	 // Assert.assertEquals(driver.getTitle(), "Google");
	  WebElement searchBox = driver.findElement(By.name("q"));
	  searchBox.sendKeys("Appium Tutorial");
	  searchBox.submit();
	  
	  
  }
  
  @Test(priority=1)
  public void cucumberTest() {
	  driver.get("https://www.google.com/");
	 // Assert.assertEquals(driver.getTitle(), "Google");
	  WebElement searchBox = driver.findElement(By.name("q"));
	  searchBox.sendKeys("cucumber Tutorial");
	  searchBox.submit();
	  
	  
  }
  
  
  @AfterMethod
   public void tearDown() {
	//driver.close();  
  }
  
}
