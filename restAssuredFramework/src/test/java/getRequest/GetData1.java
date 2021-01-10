package getRequest;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class GetData1 {
	
	@Test
	public void testResponsecode()
	{
		int code=get("http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22").getStatusCode();
		
		System.out.println("Status code is"+code);

		Assert.assertEquals(code,200);
	}
	@Test
	public void testBody()
	{
		String data= get("").asString();
		long time=get("http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22").getTime();
		System.out.println("Response time"+ time);
	}
	
	
}

