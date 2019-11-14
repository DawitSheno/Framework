import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	
	
	private static final String[] googleTitleTest = null;
	WebDriver Driver;
	@BeforeMethod
	public void SetUp() {
	
		Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.manage().deleteAllCookies();
		Driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		Driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		Driver.get("https://google.com/");
	}
       @Test(priority=3,groups ="TitleTest")
       public void googleTitleTest() {
    	  String Title = Driver.getTitle();
    	  System.out.println(Title);
       }
       @Test(priority=1,groups ="Logo Test ")
       public void googleLogoTest() {
    	 boolean logo =  Driver.findElement(By.id("hplogo")).isDisplayed();
    	 System.out.println(logo);
       }
       @Test(priority=2,groups= "Link Test")
       public void LinkTest() {
    	boolean Link =   Driver.findElement(By.linkText("Gmail")).isDisplayed();
    	System.out.println(Link);
       }
       @AfterMethod
       public void TearDown() {
    	   Driver.close();
       }
}
