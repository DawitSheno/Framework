package SeleniumBasic;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckingAllWebElements {

	public static void main(String[] args) throws InterruptedException {
		// //1- opening the Firefox Web browser
		//2-opening the "http://www.newtours.demoaut.com/" on Firefox web browser
		//3- finding the element" UserName"input box and type "a" over it 
		//4- finding the element" Password" text field and type"a" over it 
		//5- finding the " Sign-In" button and click on it
		
       
WebDriver Driver = new ChromeDriver();
Driver.get("http://newtours.demoaut.com/");
Driver.findElement(By.name("userName")).sendKeys("a");
Driver.findElement(By.name("password")).sendKeys("a");
                                                                                                                       
//Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
Driver.findElement(By.name("login")).click();
Thread.sleep(5000);
Driver.findElement(By.linkText("SIGN-OFF")).click();


        


	}

}
