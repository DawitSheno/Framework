import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handling_Popup {

public static void main(String[]args) {
	
WebDriver Driver = new ChromeDriver();
Driver.manage().window().maximize();
Driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
try {
Driver.get("https://netbanking.hdfcbank.com/netbanking/CCLogin.html");
WebElement RC = Driver.findElement(By.linkText("Log In"));
Actions Action = new Actions(Driver);
Action.moveToElement(RC);
Action.contextClick(RC).sendKeys(Keys.ARROW_DOWN).build().perform();
}
catch (Exception e) {;
System.out.println(e);

}}}
