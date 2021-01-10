package TestngTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertExampleTest {
	
	@Test(priority=2,description="this is first")
	public void test1() {
		
		
		Assert.assertEquals("hello", "helo","not matched");
		
		System.out.println("done");
		
	}
	
	@Test(priority=1,description="this is second")
	public void test2() {
		System.out.println("donedfgfdgf");
		
		Assert.assertEquals(12, 12,"Dropdown list does not match please check with devs");
		
		System.out.println("donew");
		
	}
	

}
