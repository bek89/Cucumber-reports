package properties;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

import utilities.ConfigReader;


public class DriverPaths {

	
	static WebDriver driver;
	@BeforeClass
	
	public static void setUp(){
		System.getProperty(ConfigReader.getProperty("chrome.driver.path"),ConfigReader.getProperty("gecko.driver.path"));
		

	
	}
	
}
