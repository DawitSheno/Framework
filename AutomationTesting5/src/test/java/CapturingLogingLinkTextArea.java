import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CapturingLogingLinkTextArea {

	public static void main(String[] args) {

		
		WebDriver Driver = new ChromeDriver();
		Driver.get("http://www.gcrit.com/build3/");
		Driver.findElement(By.linkText("login")).click();
		Driver.findElement(By.name("email_address")).sendKeys("abcdefgh@gmail.com");
		Driver.findElement(By.name("password")).sendKeys("Abcd123");
		Driver.findElement(By.xpath("//*[@id=\"tdb4\"]/span[2]")).click();
	}

}
