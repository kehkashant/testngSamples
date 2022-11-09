package testScripts;

import java.io.IOException;
//import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RemoteDriverTest {
	
	WebDriver driver;
  @Test
  public void searchSeleniumTest() throws IOException {
	  
	  ChromeOptions options = new ChromeOptions();
	  options.setCapability(CapabilityType.PLATFORM_NAME, Platform.WINDOWS);
	  
	  String strHub =" http://192.168.0.106:4444";
	  driver = new RemoteWebDriver(new URL(strHub),options);
	  driver.manage().window().maximize();
	  
	  driver.get("https://www.google.com/");
	  WebElement searchBox = driver.findElement(By.name("q"));
	  searchBox.sendKeys("Selenium Tutorial");
	  searchBox.submit();
	  System.out.println("Page Title ....."+ driver.getTitle());
	  Assert.assertEquals(driver.getTitle(), "Selenium Tutorial - Google Search");
	  driver.close();
	  //java -jar selenium-server-4.5.3.jar standalone
	  //java -jar selenium-server-4.5.3.jar hub
	  //java -jar selenium-server-4.5.3.jar node
	  //http://192.168.0.106:4444/ui#/sessions

  }
}
