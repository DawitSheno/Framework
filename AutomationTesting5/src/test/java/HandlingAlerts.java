import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {

	public static void main(String[] args) throws InterruptedException {
	WebDriver Driver = new ChromeDriver();
	Driver.manage().window().maximize();
	Driver.get("https://mail.rediff.com");
	Thread.sleep(3000);
	Driver.findElement(By.linkText("Sign in")).click();
	Driver.findElement(By.name("proceed")).click();
	
	Alert Popup = Driver.switchTo().alert();
	 String ErroMsg = Popup.getText();
	 System.out.println(ErroMsg);
	 Thread.sleep(3000);
	Popup.accept();
	Thread.sleep(5000);
	Driver.findElement(By.id("login1")).sendKeys(" Love Selenium");
	Thread.sleep(5000);

	Driver.quit();
	

	}

}
