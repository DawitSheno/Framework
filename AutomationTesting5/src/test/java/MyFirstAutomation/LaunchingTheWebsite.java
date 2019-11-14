package MyFirstAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchingTheWebsite {

	public static void main(String[] args) {
		//launching the website
        WebDriver Driver = new ChromeDriver();
		Driver.get("https://www.facebook.com/");//lauching the browser 
		
		Driver.findElement(By.name("email")).sendKeys("chudawit@yahoo.com");
		Driver.findElement(By.name("pass")).sendKeys("Anacostia7");
        Driver.findElement(By.xpath("//input[@value='Log In']")).click();
       Driver.findElement(By.linkText("Sign Up")).click();
       Driver.findElement(By.xpath("//input[@value='Log Into Existing Account']")).click();
        Driver.close();
	}

}
