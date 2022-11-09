package parallelScripts;

import org.testng.annotations.Test;

public class SampleOneTest {

	
	@Test
	public void testOne() {
		long id = Thread.currentThread().getId();
		System.out.println("testOne in SampleOneTest.... " +id);
	}
	
	
	@Test
	public void testTwo() {
		long id = Thread.currentThread().getId();
		System.out.println("testTwo in SampleOneTest.... " +id);
	}
	
	
	@Test
	public void testThree() {
		long id = Thread.currentThread().getId();
		System.out.println("testThree in SampleOneTest.... " +id);
	}
	
	@Test
	public void testFour() {
		long id = Thread.currentThread().getId();
		System.out.println("testFour in SampleOneTest.... " +id);
	}
	
}
