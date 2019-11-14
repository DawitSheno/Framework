import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingButton {

	public static void main(String[] args) {

		
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		Driver.get("https://mail.google.com/");
		
		
		WebElement Button = Driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span"));
		//boolean Status = Driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span")).isDisplayed();
	   boolean XYZ = Button.isDisplayed();
		System.out.println(XYZ);//True
		
		XYZ = Button.isEnabled();
		System.out.println(XYZ);//
		
		String ButtonName =Driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span")).getText();
		System.out.println(ButtonName);

	}

}
