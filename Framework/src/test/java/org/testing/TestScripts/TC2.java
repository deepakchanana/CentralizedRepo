package org.testing.TestScripts;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testing.TestSteps.HTTPMethods;
import org.testing.Utilities.BodyRead;
import org.testing.Utilities.PropertiesFIleLoad;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

// Post Request
public class TC2 {

	@Test
	public void tc2() throws IOException
	{
		String body=BodyRead.getBody("..//Framework//body2.json");
		Properties pr=PropertiesFIleLoad.propertiesload();
		HTTPMethods http=new HTTPMethods(pr);
		Response res=http.PostRequest(body,"TC2_URI");
	}
}
