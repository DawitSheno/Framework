package MyFirstAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationLink2 {

	public static void main(String[] args) {
		// Checking the "REGEISTRATION"Link
		
		WebDriver Driver = new ChromeDriver();
		Driver.get("http://newtours.demoaut.com/");
		Driver.findElement(By.name("firstName")).sendKeys("Abenezer");
		//Driver.findElement(By.name("firstName")).sendKeys("Abenezer");
		//Driver.findElement(By.name("firstName")).sendKeys("Abenezer");
		Driver.findElement(By.linkText("REGISTER")).click();

	}

}
