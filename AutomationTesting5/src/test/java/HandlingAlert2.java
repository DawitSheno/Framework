import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class HandlingAlert2 {
	
	WebDriver Driver;
	@BeforeMethod
	public void SetUp() {
	    Driver=new ChromeDriver();
	    Driver.manage().window().maximize();
	    Driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Driver.manage().deleteAllCookies();
		Driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS );
		Driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
	}
	@Test
	public void HandlingAlert2() {
		Driver.findElement(By.name("login")).clear();
		Driver.findElement(By.id("login1")).sendKeys("Selenium");
		Driver.findElement(By.name("proceed")).click();
		Driver.switchTo().alert().dismiss();
		Driver.findElement(By.name("passwd")).sendKeys("Mara");
		Driver.findElement(By.name("proceed")).click();
		WebElement msg = Driver.findElement(By.id("login"));
		//Alert text = Driver.switchTo().alert();
		//System.out.println(text.getText());
	   // Driver.findElement(By.id("login")).getText();
      // "Wrong username and password combination.");
      System.out.println(msg);
       
		
		

}
	@AfterMethod
	public void TearDown() {
		Driver.close();
	}
}