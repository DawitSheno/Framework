package javaBasic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXpath {

	public static void main(String[] args) throws InterruptedException {
		
WebDriver Driver = new ChromeDriver();
Driver.manage().window().maximize();
Driver.get("https://mail.rediff.com");
Driver.findElement(By.linkText("Sign in")).click();
Driver.findElement(By.xpath("//input[@name='proceed']")).click();

Alert popup = Driver.switchTo().alert();
Thread.sleep(3000);

String ErrorMsg =popup.getText();
System.out.println(ErrorMsg);

Thread.sleep(3000);

popup.accept();
Driver.quit();


	}

}
