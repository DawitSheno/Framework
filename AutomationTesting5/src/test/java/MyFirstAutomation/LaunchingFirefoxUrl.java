package MyFirstAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchingFirefoxUrl {

	public static void main(String[] args) {
		// launching fireFox Url
		 //set.propery
		
		
	System.setProperty(" webdriver.gecko.driver","geckodriver.exe");
		
		WebDriver Driver = new FirefoxDriver();
		Driver.get("http://www.bbc.com");
		Driver.quit();
		
		

	}

}
