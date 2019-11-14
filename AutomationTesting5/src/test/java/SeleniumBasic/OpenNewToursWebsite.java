package SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenNewToursWebsite {

	public static void main(String[] args) {
		// Open newtours.deamoaut.com
	//System.setProperty("webdriver.gecko.driver,","C:\\Users\\dba\\Downloads\\geckodriver-v0.20.1-win64,",".exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http:newtours.demoaut.com");
		Actions action = new Actions(driver);
		

	}

}
