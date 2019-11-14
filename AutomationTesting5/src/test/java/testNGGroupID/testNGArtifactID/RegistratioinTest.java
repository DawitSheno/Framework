package testNGGroupID.testNGArtifactID;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RegistratioinTest {
	
	public WebDriver Driver;
	@BeforeTest
	public void opennewtourswebbrowser() {
		WebDriver Driver = new ChromeDriver();//lauch the Chrome browser
		Driver.get("http://newtours.demoaut.com/mercuryregister.php");//opening the newtours webpage	
	}
  @Test
  public void registration() throws InterruptedException {
	  
	 WebDriver Driver = new ChromeDriver();//lauch the Chrome browser
	  Driver.get("http://newtours.demoaut.com");//opening the newtours webpage
	  Driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")).click();
	  Driver.findElement(By.name("firstName")).sendKeys("Mara");
	  Driver.findElement(By.name("lastName")).sendKeys("Dawit");
	  Driver.findElement(By.name("phone")).sendKeys("301 408 8443");
	  Driver.findElement(By.id("userName")).sendKeys("confirmPassword");
	  Driver.findElement(By.name("address1")).sendKeys("4447 South Four Mile Run Dr");
	  Driver.findElement(By.name("city")).sendKeys("Arlington");
	  Driver.findElement(By.name("state")).sendKeys("VA");
	  Driver.findElement(By.name("postalCode")).sendKeys("22204");
	  Driver.findElement(By.name("country")).sendKeys("USA");
	  Driver.findElement(By.id("email")).sendKeys("MaraDavo@gmail.com");
	  Driver.findElement(By.name("password")).sendKeys("*****");
	  Driver.findElement(By.name("confirmPassword")).sendKeys("*****");
	  Driver.findElement(By.name("register")).click();
	  Driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a")).click();
	  Driver.close();
	  //Assert.assertEquals("SIGN-OFF", "SIGN-OFF");
	  
	  //Driver.findElement(By.name("userName")).sendKeys("a");
	  //Driver.findElement(By.name("password")).sendKeys("a");
	  //Thread.sleep(5000);
	  //Driver.findElement(By.name("login")).click();
	  //System.out.println("registration test code should be here");
  }
  @AfterTest
  public void closingnewtourswebbrowser() {
  }
}
