import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingAlert {

	public static void main(String[] args) throws InterruptedException {
    
		
		
		WebDriver Driver = new ChromeDriver();//launch Chrome browser
		Driver.manage().window().maximize();//Maximize the window
		Driver.get("https://mail.rediff.com/cgi-bin/login.cgi");// launch the website on chrome
		Driver.findElement(By.name("proceed")).click();//Locating Element Locator and Click
		Thread.sleep(3000);
		Actions Action = new Actions(Driver);
		Action.sendKeys(Keys.ENTER);
		//Alert Popup = Driver.switchTo().alert();//Switching the window from Web to Window
		//String popupMessage = Popup.getText();//Capturing the Error(POPUP)Message
		//System.out.println(popupMessage);//Displaying the Captured Message
		//Popup.accept();//Clicking on Alert "OK" Button
		Driver.findElement(By.id("login1")).sendKeys("Selenium123");
	    Driver.close();
		
		
	}

}
