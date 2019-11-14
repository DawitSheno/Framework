import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextArea {

	public static void main(String[] args) {
		
		
		WebDriver Driver = new ChromeDriver();
		Driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		Driver.get("https://mail.google.com");// launching Gmail
		Driver.manage().window().maximize();//Maximize
		String TextArea = Driver.findElement(By.id("headingSubtext")).getText();//captures the TextArea
        System.out.println(TextArea);
	}

}
