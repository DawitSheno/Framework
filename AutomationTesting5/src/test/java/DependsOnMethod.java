import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class DependsOnMethod {
	WebDriver Driver ;
	@BeforeMethod
	public void SetUp() {
	Driver= new ChromeDriver();
	Driver.manage().window().maximize();
	Driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	Driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	Driver.manage().deleteAllCookies();
	Driver.get("https://google.com/");
}
	@Test
    public void googleLogoTest() {
		//int i = 9/0;
    boolean b = Driver.findElement(By.xpath("//*[@id=\"hplogo\"]")).isDisplayed();
    //System.out.println(b);
    Assert.assertTrue(b,"true");
    Assert.assertTrue(b, "is Displaying the correct MSG");
	}
	@Test
	public void googleTitlePage() {
		String URL = Driver.getCurrentUrl();
		System.out.println(URL);
 Assert.assertEquals(URL,"https://www.google.com/","Title Not Matched");		
	}
	@AfterMethod
	public void TearDown() {
	
		Driver.close();
	
	}
}
