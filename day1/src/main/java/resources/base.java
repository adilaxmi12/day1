package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import pageobject.loginpage;
import utility.readingproperties;

public class base {
	public static WebDriver driver;
	public static String username;
	public static String password;
	@Parameters("browser")
	@BeforeMethod
	public void browserini(String br) throws IOException
	{
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\eclipse-workspace\\demo1\\browsers\\geckodriver.exe");	
		driver=new FirefoxDriver();
		FileInputStream fis=new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\day1\\data.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String url = prop.getProperty("url");
		String username = prop.getProperty("username");
		String password = prop.getProperty("password");
		driver.get(url);
	
	}
	@AfterMethod
	public void teardown() {
driver.quit();
	}
	public void screenshot(String tname) throws IOException {
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File(System.getProperty("user.dir")+"//reports//"+tname+".png"));
		

	}

}
