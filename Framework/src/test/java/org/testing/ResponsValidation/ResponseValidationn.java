package org.testing.ResponsValidation;

import org.testng.Assert;

import com.jayway.restassured.response.Response;

public class ResponseValidationn {
	
	
	public static void responseStatusCodeValidation(int ExpectedStatusCode,Response res)
	{
	 Assert.assertEquals(ExpectedStatusCode, res.getStatusCode());
	}
	public static void responseDataValidation()
	{
		
	}

}
