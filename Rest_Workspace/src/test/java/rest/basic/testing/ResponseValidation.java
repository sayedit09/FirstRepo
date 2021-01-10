package rest.basic.testing;

import static io.restassured.RestAssured.given;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.equalTo;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class ResponseValidation {
	
	@Test
	public void SearchPlaceInGoogle() {
		
		String requestBody="{\r\n" + 
				"  \"location\": {\r\n" + 
				"    \"lat\": -33.8669710,\r\n" + 
				"    \"lng\": 151.1958750\r\n" + 
				"  },\r\n" + 
				"  \"accuracy\": 50,\r\n" + 
				"  \"name\": \"Google Shoes!\",\r\n" + 
				"  \"phone_number\": \"(02) 9374 4000\",\r\n" + 
				"  \"address\": \"48 Pirrama Road, Pyrmont, NSW 2009, Australia\",\r\n" + 
				"  \"types\": [\"shoe_store\"],\r\n" + 
				"  \"website\": \"http://www.google.com.au/\",\r\n" + 
				"  \"language\": \"en-AU\"\r\n" + 
				"}";
		
		
		
		RestAssured.baseURI="https://maps.googleapis.com";
		Response res =given().
		queryParam("key", "AIzaSyAmN7iOXsfc4syUBNw9n4iSDSa1Ia-TRoE").
		body(requestBody).
		when().
		post("/maps/api/place/add/json").
		then().
		assertThat().statusCode(200).and().
		
		extract().response();
		String response=res.asString();   //asString()..It will convert response in to string
		
		System.out.println(response);
		JsonPath jsonResponse =new JsonPath(response);     // convert string into json
		String placeID=jsonResponse.get("place_id");
		System.out.println(placeID);
		//System.out.println(jsonResponse);
		
		given().//To delete 
		queryParam("key", "AIzaSyAmN7iOXsfc4syUBNw9n4iSDSa1Ia-TRoE").
		body("{"+
		  "\"place_id\": \""+placeID+"\"" +
	"}").
		when().
		post("/maps/api/place/delete/json").
		
		then().assertThat().statusCode(200).and().body("status", equalTo("OK"));
		
		
	
		
		
		
		
		
		
	}
	

}
