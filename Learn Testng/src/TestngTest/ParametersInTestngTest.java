package TestngTest;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersInTestngTest {
	
	
	@Test
	@Parameters({"userName","password"})//two parameters here
	public void test1(@Optional("userNameOptional") String userName,@Optional("passwordOptional")String password) //if we run without .xml file then we use optional.
	{
		
		System.out.println("username is:-"+userName+"password:-"+password);
		
		
		
		
		
	}

}
