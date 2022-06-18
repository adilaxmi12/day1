package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class readingproperties {
	public static String path = "C:\\Users\\DELL\\eclipse-workspace\\day1\\data.properties";
	public static Properties prp;
	public static FileInputStream fis;

	public readingproperties() throws IOException {
		fis = new FileInputStream(path);
		prp.load(fis);
	}
	public String geturl() {
		return prp.getProperty("url");
		

	}
	public String getusername() {
		return prp.getProperty("username");
		

	}
	public String getpassword() {
		return prp.getProperty("password");
		

	}

	

}
