package org.testing.TestSteps;

import java.util.Properties;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.*;

public class HTTPMethods 
{
	Properties pr;
	public HTTPMethods(Properties pr)
	{
		this.pr=pr;
	}
   public Response PostRequest(String payload,String uri)
   {
	   Response res=
	   given()
	   .contentType(ContentType.JSON)
	   .body(payload)
	   .when()
	   .post(pr.getProperty(uri));
	   return res;
	    
   }
	
   public Response GetRequest(String uri)
   {
	Response res=
			given()
			.contentType(ContentType.JSON)
			.when()
			.get(pr.getProperty(uri));
			
	return res;
	   
   }
   
   public Response putRequest(String body,String uri)
   {
	   Response res=
			   given()
			   .contentType(ContentType.JSON)
			   .body(body)
			   .when()
			   .put(pr.getProperty(uri));
	   return res;
   }
}
