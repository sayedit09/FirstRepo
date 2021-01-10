package rest.basic.testing;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class GetRequestSample {
	
	//BaseURI
	    
		public static String baseURI ="https://maps.googleapis.com";
		@Test
		public static void searchPlaceInGoogle() {
			
			 RestAssured.baseURI=baseURI;
			   given().
			   param("key","AIzaSyAYLe8aMym9LofNkUBegP9qF8KayISq0Hk").
			   param("location","21.1938,81.3509").
			   param("radius","500").
			   when().
			   get("/maps/api/place/nearbysearch/json").
			  then().assertThat().statusCode(200).and()
			  .contentType(ContentType.JSON).and()
			  //.body("results[0].geometry.viewport.northeast.lat",equalTo("21.19519648029151"));
			   //.body("results[0].scope",equalTo("21.19519648029151"));
			  .body("results[0].name",equalTo("Om Sai Bajaj"));
			   System.out.println("test");

}}
