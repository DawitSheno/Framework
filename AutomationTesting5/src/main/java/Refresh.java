import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Refresh {

	public static void main(String[] args) throws InterruptedException {
	
		
		WebDriver Driver = new ChromeDriver();
	    Driver.manage().window().maximize();
		Driver.get("https://www.google.com/");
		Driver.navigate().to("http://www.habeshaschool.com/");
		Driver.navigate().back();
		Driver.navigate().forward();
		Driver.findElement(By.name("q")).sendKeys("Selenium");
		Thread.sleep(5000);
		Driver.navigate().refresh();
		Driver.close();
		

	}

}
