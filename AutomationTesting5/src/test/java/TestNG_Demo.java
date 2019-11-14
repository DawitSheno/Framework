import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNG_Demo {
@Test
public void Setup() throws InterruptedException {
	
 WebDriver Driver = new ChromeDriver();
 Driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
 Driver.manage().window().maximize();
 Driver.get("https://va.org");
 Driver.findElement(By.linkText("Login")).click();
 try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
 Driver.findElement(By.id("user_login")).sendKeys("Selenium_ Testing");
 Thread.sleep(3000);
 Driver.findElement(By.name("pwd")).sendKeys("Hello Java");
 Driver.findElement(By.xpath("//input[@type='submit']")).clear();

}
}

