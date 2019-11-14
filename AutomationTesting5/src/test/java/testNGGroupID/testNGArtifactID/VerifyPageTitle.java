package testNGGroupID.testNGArtifactID;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class VerifyPageTitle {
	WebDriver Driver;
	@Test
	
	public void VerifyPageTitle() {
		
        WebDriver Driver = new FirefoxDriver();
		Driver.get("https://Google.com");//launch the browser
		Driver.findElement(By.linkText("NO, THANKS")).click();
		Driver.findElement(By.cssSelector("Body")).sendKeys(Keys.CONTROL +"t");
		Driver.get("https://facebook.com");
		//String currentURL = Driver.getCurrentUrl();
		//System.out.println(currentURL);
				
		//String pagetitle = Driver.getTitle();
		//.assertEquals(pagetitle, "Google");
		Driver.close();
		
	}

}
