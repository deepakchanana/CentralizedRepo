package org.testing.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFIleLoad {

	public static Properties propertiesload() throws IOException
	{
	File f=new File("..//Framework//Env.properties");	
	FileInputStream fi=new FileInputStream(f);
	Properties pr=new Properties();
	pr.load(fi);
	return pr;
	}
}
