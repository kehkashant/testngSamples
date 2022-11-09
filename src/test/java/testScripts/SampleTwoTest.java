package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleTwoTest {
  @Test
  public void cypressTest() {
	  //WebDriverManager.chromedriver().setup();
	  //WebDriver driver = new ChromeDriver();
	  //driver.manage().window().maximize();
	  //driver.get("https://www.google.com/");
	  //WebElement searchBox = driver.findElement(By.name("q"));
	  //searchBox.sendKeys("Cypress Tutorial");
	  //searchBox.submit();
	  
	  System.out.println("Cypress");
	  
  }
  
  
  @Test(groups="featureOne")
  public void playWrightTest() {
	  System.out.println("Playwright");
  }

  @Test(groups="featureTwo")
  public void playJenkinsTest() {
	  System.out.println("Jenkins");
  }

  @Test
  public void playJiraTest() {
	  System.out.println("Jira");
  }
  
  
  
}
