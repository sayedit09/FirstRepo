package TestngTest;

import org.testng.annotations.Test;


public class InvocationCountTest {
	@Test(invocationCount=10)
public void test1() {
	
	int i =5;
	int y =10;
	int c=i+y;
	
	System.out.println("sum of number:"+c);
	
}
}
