package SeleniumBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumCommands {

	public static void main(String[] args) {
		
	WebDriver Driver = new FirefoxDriver();
	
	Driver.get("http://www.habeshaschool.com");// this will launch the Website 
	
	System.out.println(Driver.getTitle());// this prints the title of the page
	System.out.println(Driver.getCurrentUrl());// this prints the current URL landing page 
	//System.out.println(Driver.getPageSource());// this prints the entire code 
	System.out.println(Driver.getWindowHandle());// this prints the ID of the page 
	//Driver.manage().window().maximize();// this will maximize the window
	//Driver.manage().window().maximize();// this will maximize the window
	//Driver.navigate().forward();// this will click forward to the next page 
	//Driver.navigate().back();// this will click to go back 
	//Driver.switchTo();
	Driver.close();// this will close the browser Properly
	//Driver.quit();
	
	
	
	
		

	}

}
