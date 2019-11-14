package MyFirstAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RegistrationLink {

	public static void main(String[] args) {
		// 
		// login and logout new tours website
		// opening the firefox website
		WebDriver Driver = new FirefoxDriver();
		Driver.get("http://www.newtours.demoaut.com/");
		// finding Username element"a"
		// finding password element"a"
		// finding "sign in" button link
	    Driver.findElement(By.linkText("REGISTER")).click();
	    Driver.findElement(By.name("firstName")).sendKeys("Dawit");
	    
	    
	    

	}

}
