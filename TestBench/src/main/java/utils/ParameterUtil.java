package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ParameterUtil {
	File file;
	FileInputStream fis;
	Properties prop;
	public ParameterUtil() throws IOException{
		fis = new FileInputStream("./parameters.properties");
//		file = new File("./parameters.properties");
		prop = new Properties();
		prop.load(fis);
	}
	public String getParametersValue(String propertyName) throws IOException {
		String propertyValue = prop.getProperty(propertyName);
		return propertyValue;
	}

}
