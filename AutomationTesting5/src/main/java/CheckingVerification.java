import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckingVerification {

	public static void main(String[] args) {

	WebDriver Driver = new ChromeDriver();
	Driver.get("https://www.google.com/");
	
	try {
	
	boolean linkEnabled = Driver.findElement(By.linkText("Gmail")).isEnabled();
	
	System.out.println(linkEnabled);
		
	}
catch (NoSuchElementException a) {
	System.out.println("Element is Not Exists");
}}
}
