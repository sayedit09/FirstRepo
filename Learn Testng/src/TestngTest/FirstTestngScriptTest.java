

import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTestngScriptTest {
	
	
	@Test(priority=1,description="This is login")
	public void loginApplication() 
	{
		
		System.out.println("login");
		Assert.assertEquals(12, 13);
		}
	
	
	@Test(priority=-3,description="This is selectitem'")
	public void selectItems() 
	{
		
		System.out.println("Item selected");
		}
	
	@Test(priority=-2,description="This is checkout")
	public void checkOut() 
	{
		
		System.out.println(" checkout");
		}


}
