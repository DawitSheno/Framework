import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UsingXpath {
	WebDriver driver;
	
	@BeforeMethod
public void Setup() throws InterruptedException {
	
      driver=new ChromeDriver();
      Thread.sleep(8000);
      driver.get("https://www.myhealth.va.gov/mhv-portal-web/home");
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);    
} 
      @Test
      public void clickOnSearch() throws InterruptedException {
    	  driver.findElement(By.xpath("//span[contains(text(),'Pharmacy')]")).click();
    	  Thread.sleep(5000);
    	  driver.findElement(By.xpath("//a[contains(text(),'Refill VA Prescriptions')]")).click();
    	  Thread.sleep(5000);
    	  
    	  driver.findElement(By.xpath("//a[contains(text(),'Return to top')]")).click();
      }
      @AfterMethod
      public void CloseBrowser() {
    	  driver.close();
      }
}
