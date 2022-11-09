package parallelScripts;

import org.testng.annotations.Test;

public class MethodinvocationTest {

	
	@Test(invocationCount = 10 ,threadPoolSize = 4, timeOut = 2000)
	public void SampleTest() {
		long id = Thread.currentThread().getId();
		System.out.println("Customer Registration.... " +id);
	}
	

	
	
}
