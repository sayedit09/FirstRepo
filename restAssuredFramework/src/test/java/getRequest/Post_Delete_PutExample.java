package getRequest;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class Post_Delete_PutExample {
	
	
	@Test
	public void test() {
		
		RequestSpecification request = RestAssured.given();
		request.header("Content-Type","application/json");
		JSONObject json = new JSONObject();
		json.put("id","89");
		json.put("title","mySelenium");
		json.put("author","sarfaraz hussain");
		
		request.body(json.toJSONString());
		
		
		Response response = request.put("http://localhost:3000/posts/89");// just change .put,.post,.delete for desired results.
				
		int code=response.getStatusCode();
		
		Assert.assertEquals(code, 200);// 201 is used for up creating resources in server but 200 is just modifiying..so for delete and put we use (200)and 201 for post. 
	}

}
