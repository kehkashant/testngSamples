package testScripts;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.apache.commons.collections.map.HashedMap;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v100.network.Network;
import org.testng.annotations.Test;

public class BasicAuthTest {
	
	ChromeDriver driver;
	DevTools devTools;
	//private static final String USERNAME = "admin";
	//private static final String PASSWORD = "admin";
	
	
  @Test
  public void basicAuth() {
	  
	  
	 /* devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
	  driver.get("https://the-internet.herokuapp.com/login");
	  Map<String, Object> headers = new HashMap<>();
	  String strUser = "admin";
	  String strPwd = "admin";
	  */
	  
  }
}
