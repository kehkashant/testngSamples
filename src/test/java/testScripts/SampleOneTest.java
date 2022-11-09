package testScripts;

import org.testng.annotations.Test;

public class SampleOneTest {
  @Test(groups="featureOne")
  public void ADOTest() {
	  System.out.println("ADO ");
	  System.out.println("Modified for Github Integration...");
	  System.out.println("Modified by Tester2 ...");
  }
  
  
  @Test(groups="featureTwo")
  public void ALMTest() {
	  System.out.println("ALM ");
  }
  
}
