package org.testing.Utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Set;
import java.util.regex.Pattern;

import org.json.JSONObject;
import org.json.JSONTokener;

public class BodyRead {
	
	public static void getBody() throws FileNotFoundException
	{
		File f=new File("D:\\DeepakChananaClasses\\Framework\\body.json");
		  FileReader fr=new FileReader(f);
		  
		JSONTokener js=new JSONTokener(fr);
		JSONObject j=new JSONObject(js);
		replaceVariables(j.toString(),"firstname","deepak");
		
		Date d=new Date();
		System.out.println(d.getTime());
		System.out.println(d.getDay());
		System.out.println(d.ge);
	}

	public static void main(String[] args) throws FileNotFoundException {
		getBody();
	}
	
	public static void replaceVariables(String body,String searchVariable,String insertValue)
	{

   body=body.replaceAll(Pattern.quote("{{"+searchVariable+"}}"),insertValue);	
		System.out.println(body);
	}
	
}
