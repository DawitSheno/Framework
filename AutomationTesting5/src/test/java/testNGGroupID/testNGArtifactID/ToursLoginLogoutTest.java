package testNGGroupID.testNGArtifactID;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.service.DriverCommandExecutor;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;


public class ToursLoginLogoutTest {
 WebDriver  Driver; 
	@BeforeMethod
	public void openingnewtoursHomepge() {
		Driver= new ChromeDriver();
		Driver.get("http://newtours.demoaut.com/");	
	}
	
	@AfterMethod
	public void closeTheBrowser() {
		  Driver.close();	
	}
  @Test
  public void loginTestwithcorrectcredentials() throws InterruptedException {
	  Driver.findElement(By.name("userName")).sendKeys("a");
	  Driver.findElement(By.name("password")).sendKeys("a");
	  Driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input")).click();
  Driver.findElement(By.linkText("SIGN-OFF")).click();
	  String Currenturl = Driver.getCurrentUrl();
	  System.out.println(Currenturl);
	  //Assert.assertEquals("Welcome back to Mercury Tours", "Welcome back to Mercury Tours" );
	   //Driver.close();
	  
	  
	  
	  //System.out.println("Login Test will be excuted here");
  }
  @Test
  public void loginTestwithwrongcredentials() throws InterruptedException {
	  //WebDriver Driver = new ChromeDriver();
	 // Driver.get("http://newtours.demoaut.com/");
	  Driver.findElement(By.name("userName")).sendKeys("a");
	  Driver.findElement(By.name("password")).sendKeys("b");
	  Thread.sleep(5000);
	  Driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input")).click();
	  Driver.findElement(By.linkText("login")).click();
	  //String Currenturl = Driver.getCurrentUrl();
	  //System.out.println(Currenturl);
	  Assert.assertEquals("Welcome back to Mercury Tours", "Welcome back to Mercury Tours" );
	   //Driver.close();
  }  
  
  
  
  @Test
  public void test2() throws InterruptedException {
	  //WebDriver Driver = new ChromeDriver();
	 // Driver.get("http://newtours.demoaut.com/");
	  Driver.findElement(By.name("userName")).sendKeys("gfghfh");
	  Driver.findElement(By.name("password")).sendKeys("a");
	  Thread.sleep(5000);
	  Driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input")).click();
	  Driver.findElement(By.linkText("login")).click();
	  //String Currenturl = Driver.getCurrentUrl();
	  //System.out.println(Currenturl);
	  Assert.assertEquals("Welcome back to Mercury Tours", "Welcome back to Mercury Tours" );
	   //Driver.close();
  }  
  
  @Test
  public void tc2() throws InterruptedException {
	  //WebDriver Driver = new ChromeDriver();
	 // Driver.get("http://newtours.demoaut.com/");
	  Driver.findElement(By.name("userName")).sendKeys("a");
	  Driver.findElement(By.name("password")).sendKeys(" ");
	  Thread.sleep(5000);
	  Driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input")).click();
	  Driver.findElement(By.linkText("login")).click();
	  //String Currenturl = Driver.getCurrentUrl();
	  //System.out.println(Currenturl);
	  Assert.assertEquals("Welcome back to Mercury Tours", "Welcome back to Mercury Tours" );
	   //Driver.close();
  }  
  @Test
  public void tc3() throws InterruptedException {
	  //WebDriver Driver = new ChromeDriver();
	 // Driver.get("http://newtours.demoaut.com/");
	  Driver.findElement(By.name("userName")).sendKeys(" ");
	  Driver.findElement(By.name("password")).sendKeys("b");
	  Thread.sleep(5000);
	  Driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input")).click();
	  Driver.findElement(By.linkText("login")).click();
	  //String Currenturl = Driver.getCurrentUrl();
	  //System.out.println(Currenturl);
	  Assert.assertEquals("Welcome back to Mercury Tours", "Welcome back to Mercury Tours" );
	   //Driver.close();
  }  
} 
  
  


