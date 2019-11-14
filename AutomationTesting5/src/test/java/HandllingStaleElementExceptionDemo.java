import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandllingStaleElementExceptionDemo {
	public static void main(String[]args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.freecrm.com/index.html");
		
		driver.findElement(By.linkText("SIGN UP")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.partialLinkText("Log in here")).click();
		
       WebElement username = driver.findElement(By.name("email"));
       username.sendKeys("Selenium");
       
      WebElement Password= driver.findElement(By.name("password"));
       Password.sendKeys("Dave");
       
       driver.navigate().refresh();
      // username.sendKeys("Dawit");
       
       try {
       username.sendKeys("selenium");
		}
       catch(StaleElementReferenceException e) {
    	   System.out.println(e.getMessage());
       }
       
       {
    	  username = driver.findElement(By.name("email"));
    	  username.sendKeys("mara"); 
          Password= driver.findElement(By.name("password"));
    	  Password.sendKeys("Abene");
       }
       driver.close();
	}
}	
	


