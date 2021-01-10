package TestngTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAndHardAssert {
	
	@Test(priority=2,description="this is soft")
	public void soft() {
		
	SoftAssert assertion=new SoftAssert();	//soft Assert 
	System.out.println("this is started");
		assertion.assertEquals(12, 13,"not matched");
		System.out.println("this is end");
		assertion.assertAll();//this is necessary for soft assert
		
	}
	
	@Test(priority=1,description="this is hard")
	public void hard() {
		System.out.println("hard start");
		Assert.assertEquals(12, 13);   //hard assert
		System.out.println("hard end");
		
	}

}
