package SeleniumBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class openingNewTab {

	public static void main(String[] args) {
		
		
		WebDriver Driver = new ChromeDriver();
		Driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Driver.get("https://google.com");
		Driver.findElement(By.linkText("No, thanks")).click();
		Driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");
		//Driver.navigate().to("https://www.facebook.com");
		


}}
