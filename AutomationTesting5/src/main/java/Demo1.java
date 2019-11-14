import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
	WebDriver Driver;
	public static void main(String[] args) throws InterruptedException {
		//WebDriver Driver = new FirefoxDriver();
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://www.myhealth.va.gov/mhv-portal-web/home");
		Thread.sleep(5000);
		Driver.findElement(By.id("banner")).click();
		Driver.findElement(By.id("sidenav-5")).click();
		
		//String URL =Driver.getCurrentUrl();
		//System.out.println(URL);
		//Driver.findElement(By.linkText("Contact")).click();
		//Driver.findElement(By.linkText("Return to the top")).click();
		//Thread.sleep(5000);
		//Driver.navigate().to("https://www.google.com");
		//String URL2 = Driver.getCurrentUrl();
		//System.out.println(URL2);
		//Driver.navigate().back();
		/*//Driver.findElement(By.xpath("//li[2]//button[1]")).click();
		//Driver.findElement(By.linkText("Personal Information")).click();
		Driver.findElement(By.id("mhv-header-login-button")).click();
		Driver.findElement(By.name("_58_login")).sendKeys("Welcome to Va");
		Driver.findElement(By.xpath("//input[@type='submit']")).click();
		String TextArea =Driver.findElement(By.xpath("//*[@class='required']")).getText();
		System.out.println(TextArea);
		Driver.findElement(By.name("commit")).click();
		String BigTextArea = Driver.findElement(By.id("errorExplanation")).getText();
		System.out.println(BigTextArea);
		Driver.close();
		
		
		*///Driver.manage().deleteAllCookies();
		//Driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Driver.quit();
	}
	

}
