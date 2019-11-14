package SeleniumBasic;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;

public class SeleniumWebBrowserFindingTheTitleAndAssertion {

	public static void main(String[] args)  {
		// Checking if we are in the right page 
		//using Selenium web browser command 
		
		WebDriver Driver = new ChromeDriver();
		Driver.get("http://www.habeshaschool.com");
		String Title = Driver.getTitle();
		System.out.println(Title);
		
		if(Title.contains("Habesha-School.com")) {
		
			Assert.assertTrue(Title.contains("Habesha-School.com"));
			System.out.println(Title);
			File screenshot = ((TakesScreenshot)Driver).getScreenshotAs(OutputType.FILE);
			
			try {
			FileUtils.copyFile(screenshot, new File("T:\\Users\\dba\\kjhkjh\\solomon.jpg"));
			}catch(Exception e) {
				System.out.print("solomon i am not able to write to this file");
				
			}
			
		
	}

}}
