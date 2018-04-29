package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserDriver {

	private static WebDriver driver;

	public static WebDriver getInstance() {
        if (driver == null) {
			switch (ConfigReader.getProperty("browser")) {
			case "chrome":
                System.setProperty(ConfigReader.getProperty("drivertype"), ConfigReader.getProperty("driverpath"));
				driver = new ChromeDriver();
				break;
            case "firefox":
				System.setProperty("webdriver.gecko.driver", "/Users/ulugbek/Downloads/driver/geckodriver");
				driver= new FirefoxDriver();
				break;
            case "ie":
            	System.setProperty("webdriver.ieexpolorer.driver", ConfigReader.getProperty("ie.driver.path"));
            	driver= new InternetExplorerDriver();
            	break;
            	
            default:
            	System.setProperty("webdriver.chrome.driver", ConfigReader.getProperty("chrome.driver.path"));
            	driver=new ChromeDriver();
            	
            	
            	
            	
			}
		}
		return driver;

	}

	
	
	public static void closeDriver(){
		if(driver !=null){
			driver.quit();
			driver=null;
		}
	}
}
