package utilis;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	

	
	public static Properties intializeProperties() {
		
        Properties value = new Properties();
		
		FileInputStream file = null;
		try {
			file = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\config\\data.properties");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			value.load(file); //It will read the data from FileInputStream in key value pairs
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return value;    //returning that key value pairs
	}

}
