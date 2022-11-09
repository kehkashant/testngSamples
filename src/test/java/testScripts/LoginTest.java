package testScripts;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class LoginTest {
	
	WebDriver driver;
	Properties prop;
	//@Parameters("browser")
	@BeforeMethod
	public void setup(String strBrowser) {
		
		if(strBrowser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			  driver.manage().window().maximize();
			  
		}
		
	}
	
  @Test
  public void validLogin(String strName , String strPassword) {
	  driver.get("https://the-internet.herokuapp.com/login");
	  driver.findElement(By.id("username")).sendKeys(strName);
	  driver.findElement(By.id("")).sendKeys(strPassword);

  }
  
  
  @DataProvider
  public Object[][] getData() {
	  
	  
	  String path = System.getProperty("user.dir") + "//src//test//resources/testData//loginData.csv";
	  
		return null ;	  
			  
			  
  }
}
