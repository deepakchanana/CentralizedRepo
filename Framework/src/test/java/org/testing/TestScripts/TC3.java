package org.testing.TestScripts;

import org.testing.Utilities.ResponseParsing;
import org.testng.annotations.Test;

public class TC3 {
	
	@Test
	public void tc3()
	{
		String body="{\r\n" + 
				"  \"friends\": [\r\n" + 
				"    {\r\n" + 
				"      \"id\": \"deep\",\r\n" + 
				"      \"firstName\": \"deep\",\r\n" + 
				"      \"lastName\": \"chanana\",\r\n" + 
				"      \"age\": \"27\",\r\n" + 
				"      \"designation\": \"Test Lead\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"firstname\": \"rishi\",\r\n" + 
				"      \"lastname\": \"raj\",\r\n" + 
				"      \"age\": 27,\r\n" + 
				"      \"id\": \"rishiraj\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": \"Deepkk\",\r\n" + 
				"      \"firstname\": \"Deeepakk\",\r\n" + 
				"      \"lastname\": \"chanana\",\r\n" + 
				"      \"age\": \"27\",\r\n" + 
				"      \"designation\": \"TL\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": \"Deepkkk\",\r\n" + 
				"      \"\": \"Deeepakk\",\r\n" + 
				"      \"lastname\": \"chanana\",\r\n" + 
				"      \"age\": \"27\",\r\n" + 
				"      \"designation\": \"TL\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": \"Deepp\",\r\n" + 
				"      \"firstname\": \"Deeepakk\",\r\n" + 
				"      \"lastname\": \"chanana\",\r\n" + 
				"      \"age\": \"27\",\r\n" + 
				"      \"designation\": \"TL\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": \"Deeppkk\",\r\n" + 
				"      \"firstname\": \"Deeepakk\",\r\n" + 
				"      \"lastname\": \"chanana\",\r\n" + 
				"      \"age\": \"27\",\r\n" + 
				"      \"designation\": \"TL\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": \"D\",\r\n" + 
				"      \"firstname\": \"Deeepakk\",\r\n" + 
				"      \"lastname\": \"chanana\",\r\n" + 
				"      \"age\": \"27\",\r\n" + 
				"      \"designation\": \"TL\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": \"D1\",\r\n" + 
				"      \"firstname\": \"Deeepakk\",\r\n" + 
				"      \"lastname\": \"chanana\",\r\n" + 
				"      \"age\": \"27\",\r\n" + 
				"      \"designation\": \"TL\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": \"D3\",\r\n" + 
				"      \"firstname\": \"Deeepakk\",\r\n" + 
				"      \"lastname\": \"chanana\",\r\n" + 
				"      \"age\": \"27\",\r\n" + 
				"      \"designation\": \"TL\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": \"D4\",\r\n" + 
				"      \"firstname\": \"Deeepakk\",\r\n" + 
				"      \"lastname\": \"chanana\",\r\n" + 
				"      \"age\": \"27\",\r\n" + 
				"      \"designation\": \"TL\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": \"D5\",\r\n" + 
				"      \"firstname\": \"Deeepakk\",\r\n" + 
				"      \"lastname\": \"chanana\",\r\n" + 
				"      \"age\": \"27\",\r\n" + 
				"      \"designation\": \"TL\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": \"D6\",\r\n" + 
				"      \"firstname\": \"Deeepakk\",\r\n" + 
				"      \"lastname\": \"chanana\",\r\n" + 
				"      \"age\": \"27\",\r\n" + 
				"      \"designation\": \"TL\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": \"D8\",\r\n" + 
				"      \"firstname\": \"Deeepakk\",\r\n" + 
				"      \"lastname\": \"chanana\",\r\n" + 
				"      \"age\": \"27\",\r\n" + 
				"      \"designation\": \"TL\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": \"D9\",\r\n" + 
				"      \"firstname\": \"Deeepakk\",\r\n" + 
				"      \"lastname\": \"chanana\",\r\n" + 
				"      \"age\": \"27\",\r\n" + 
				"      \"designation\": \"TL\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": \"D10\",\r\n" + 
				"      \"firstname\": \"Deeepakk\",\r\n" + 
				"      \"lastname\": \"chanana\",\r\n" + 
				"      \"age\": \"27\",\r\n" + 
				"      \"designation\": \"TL\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": \"D12\",\r\n" + 
				"      \"firstname\": \"Deeepakk\",\r\n" + 
				"      \"lastname\": \"chanana\",\r\n" + 
				"      \"age\": \"27\",\r\n" + 
				"      \"designation\": \"TL\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": \"D144\",\r\n" + 
				"      \"firstname\": \"Deeepakk\",\r\n" + 
				"      \"lastname\": \"chanana\",\r\n" + 
				"      \"age\": \"27\",\r\n" + 
				"      \"designation\": \"TL\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": \"DE12\",\r\n" + 
				"      \"firstname\": \"Deeepakk\",\r\n" + 
				"      \"lastname\": \"chanana\",\r\n" + 
				"      \"age\": \"27\",\r\n" + 
				"      \"designation\": \"TL\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"firstName\": \"deep\",\r\n" + 
				"      \"lastName\": \"chanana\",\r\n" + 
				"      \"id\": \"deepkdeep\",\r\n" + 
				"      \"designation\": \"Test Lead\",\r\n" + 
				"      \"age\": \"27\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"firstName\": \"deep\",\r\n" + 
				"      \"lastName\": \"chanana\",\r\n" + 
				"      \"id\": \"facebook\",\r\n" + 
				"      \"designation\": \"Test Lead\",\r\n" + 
				"      \"age\": \"27\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": \"SanjayS\",\r\n" + 
				"      \"firstname\": \"Sanjayname\",\r\n" + 
				"      \"lastname\": \"Lastname\",\r\n" + 
				"      \"age\": \"27\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": \"Charan\",\r\n" + 
				"      \"firstname\": \"Charan\",\r\n" + 
				"      \"lastname\": \"Singh\",\r\n" + 
				"      \"age\": \"28\",\r\n" + 
				"      \"designation\": \"TL\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": \"QA\",\r\n" + 
				"      \"name\": \"API\",\r\n" + 
				"      \"lastname\": \"Automation\",\r\n" + 
				"      \"age\": \"27\",\r\n" + 
				"      \"address\": {\r\n" + 
				"        \"ward_no\": \"15\",\r\n" + 
				"        \"houseno\": \"213\",\r\n" + 
				"        \"sector\": \"23\"\r\n" + 
				"      }\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"firstname\": \"Mr\",\r\n" + 
				"      \"lastname\": \"Deepak\",\r\n" + 
				"      \"age\": \"25\",\r\n" + 
				"      \"id\": \"deepakkkkkk\",\r\n" + 
				"      \"address\": [\r\n" + 
				"        {\r\n" + 
				"          \"wardNo\": \"14\",\r\n" + 
				"          \"sector\": \"23\",\r\n" + 
				"          \"houseno\": \"2334\"\r\n" + 
				"        },\r\n" + 
				"        null\r\n" + 
				"      ]\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"firstname\": \"Mr\",\r\n" + 
				"      \"lastname\": \"Deepak\",\r\n" + 
				"      \"age\": \"25\",\r\n" + 
				"      \"id\": \"dcchanana\",\r\n" + 
				"      \"address\": [\r\n" + 
				"        {\r\n" + 
				"          \"wardNo\": \"14\",\r\n" + 
				"          \"sector\": \"23\",\r\n" + 
				"          \"houseno\": \"2334\"\r\n" + 
				"        }\r\n" + 
				"      ]\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"firstname\": \"Mr\",\r\n" + 
				"      \"lastname\": \"Deepak\",\r\n" + 
				"      \"age\": \"25\",\r\n" + 
				"      \"id\": \"thappasir\",\r\n" + 
				"      \"address\": [\r\n" + 
				"        {\r\n" + 
				"          \"wardNo\": \"14\",\r\n" + 
				"          \"sector\": \"23\",\r\n" + 
				"          \"houseno\": \"2334\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"wardNo\": \"14444\",\r\n" + 
				"          \"sector\": \"23333\",\r\n" + 
				"          \"houseno\": \"133\"\r\n" + 
				"        }\r\n" + 
				"      ]\r\n" + 
				"    }\r\n" + 
				"  ]\r\n" + 
				"}";
		
		//System.out.println(body);
		
		String v=ResponseParsing.ResponseDataParse(body,"friends","age","27","designation");
		System.out.println(v);
	}

}
