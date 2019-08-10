package org.testing.TestScripts;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testing.ResponsValidation.ResponseBodyParsing;
import org.testing.ResponsValidation.ResponseValidationn;
import org.testing.TestSteps.HTTPMethods;
import org.testing.Utilities.BodyRead;
import org.testing.Utilities.PropertiesFIleLoad;
import org.testing.Utilities.ResponseParsing;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

public class TC1
{
 
	@Test
	public void tc1() throws IOException
	{
	String body=BodyRead.getBody("..//Framework//body.json");
	Properties pr=PropertiesFIleLoad.propertiesload();
	
	HTTPMethods http=new HTTPMethods(pr);
	Response res=http.PostRequest(body,"QA_URI");
	ResponseValidationn.responseStatusCodeValidation(201, res);
	ResponseBodyParsing.responseDataParsing("[].id", res); // 1st way
	ResponseParsing.ResponseDataParse(res.asString(), "friends","id","Deepkkk","lastname");
	}
}
