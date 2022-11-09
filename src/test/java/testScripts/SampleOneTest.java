package testScripts;

import org.testng.annotations.Test;

public class SampleOneTest {
  @Test(groups="featureOne")
  public void ADOTest() {
	  System.out.println("ADO ");
  }
  
  
  @Test(groups="featureTwo")
  public void ALMTest() {
	  System.out.println("ALM ");
  }
  
}
