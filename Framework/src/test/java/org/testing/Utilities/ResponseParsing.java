package org.testing.Utilities;

import org.json.JSONArray;
import org.json.JSONObject;

public class ResponseParsing 
{
    public static String ResponseDataParse(String Responsejson,String object,String searchKey,String searchValue,String item)
    {
    	JSONObject js=new JSONObject(Responsejson); // object of jsonObject
    	JSONArray arrayy=js.getJSONArray(object);
    	
    	int l=arrayy.length();
    	JSONObject ff=null;
    	String v=null;
    	for(int i=0;i<l;i++)
    	{
    		 ff=arrayy.getJSONObject(i);
    		if(ff.get(searchKey).equals(searchValue))
    		{
    		   v=v+" " +ff.get(item).toString();
    		}
    		
    	}
    	return v; // that you need
    	
    }
    
    
}
