package SeleniumBasic;

import java.sql.DriverAction;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class OpeningTheWebsite {

	//private static final WebDriver Driver ;

	public static void main(String[] args) {
		//1- opening the Firefox Web browser
		//2-opening the "http://www.newtours.demoaut.com/" on Firefox web browser
		//3- finding the element" UserName"input box and type "a" over it 
		//4- finding the element" Password" text field and type"a" over it 
		//5- finding the " Sign-In" button and click on it
		//6- finding the " SIGN-ON" button

		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("http://newtours.demoaut.com/");
		Driver.findElement(By.name("userName")).sendKeys("a");
		Driver.findElement(By.name("password")).sendKeys("a");
		Driver.findElement(By.name("login")).click();
		
		
		if(Driver.findElement(By.linkText("SIGN-OFF")).isDisplayed()){
		
		System.out.println("Test case is Passed");
		}
		
	else
	
	{
		
		System.out.println("Test Case is Failed");
		
	}
		Driver.close();
		}

	}


