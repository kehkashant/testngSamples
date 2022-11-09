package testScripts;

import org.testng.annotations.Test;

public class SampleOneTest {
  @Test(groups="featureOne")
  public void ADOTest() {
	  System.out.println("ADO ");
	  System.out.println("Modified for Githu\b Integration...");
  }
  
  
  @Test(groups="featureTwo")
  public void ALMTest() {
	  System.out.println("ALM ");
  }
  
}
