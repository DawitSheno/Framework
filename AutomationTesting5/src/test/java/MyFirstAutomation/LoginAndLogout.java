package MyFirstAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginAndLogout {

	public static void main(String[] args) {
		// login and logout new tours website
		// opening the firefox website
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://ethiopianembassy.org");
		Driver.findElement(By.linkText("Contact")).click();
			
		// finding Username element"a"
		// finding password element"a"
		// finding "sign in" button link
	   //river.findElement(By.name("login")).click();
	    
	    //checking login is successful or not
	    
	   // String url = Driver.getCurrentUrl();
	   // String MyTitle = Driver.getCurrentUrl();

		

	}

}
