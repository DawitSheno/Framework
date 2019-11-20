package javaBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class LaunchingBrowser {
	WebDriver driver;
	@BeforeTest
	public void SetUp(){
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.facebook.com");
	} 
	@Test
	public void KnowingNumberofLinks() {
		
		
		
		
	}

}
