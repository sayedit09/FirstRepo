package TestngTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertExample2Test {
	
	@Test(priority=2,description="this is test3")
	public void test3() {
		String str="sayed";
		Assert.assertTrue(str.contains("sayedr"),"Names are not matched");
		
	}
	
	@Test(priority=1,description="this is second")
	public void test2() {
		System.out.println("donedfgfdgf");
		
		Assert.assertEquals(12, 12,"Dropdown list does not match please check with devs");
		
		System.out.println("donew");
		
	}
	

}
