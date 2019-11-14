import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckingStatus {

	public static void main(String[] args) {

		
		
		 WebDriver Driver = new ChromeDriver();
		 Driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		 Driver.manage().window().maximize();
		 Driver.get("https://mail.google.com");
		 //boolean DisplayStatus = Driver.findElement(By.id("identifierId")).isDisplayed();
		 //System.out.println(DisplayStatus);
		 //System.out.println(Driver.findElement(By.id("identifierId")).isDisplayed());
		 
		 boolean EnableStatus = Driver.findElement(By.id("identifierId")).isEnabled();
		 System.out.println(EnableStatus );
		 System.out.println(Driver.findElement(By.id("identifierId")).isEnabled());
	}

}
