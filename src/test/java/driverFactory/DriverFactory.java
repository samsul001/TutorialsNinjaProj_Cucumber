package driverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverFactory {
	
	static WebDriver driver = null;
	
	public static void intiializeBrowser(String browserName) {		
		
		if(browserName.equals("chrome")) {
			driver = new ChromeDriver();
		}
		else if(browserName.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		if(browserName.equals("edge")) {
			driver = new EdgeDriver();
		}
		if(browserName.equals("safari")) {
			driver = new SafariDriver();
		}
				
	}
	
	public static WebDriver getDriver() {
		return driver;
	}

}
