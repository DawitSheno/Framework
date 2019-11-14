import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxHandling {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriver  Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		Driver.get("http://www.gcrit.com/build3/create_account.php");
		WebElement CheckBox = Driver.findElement(By.name("newsletter"));
		
		boolean XYZ = CheckBox.isDisplayed();//true
		System.out.println(XYZ);
		
		XYZ= CheckBox.isEnabled();//true
		System.out.println(XYZ);
		
		XYZ = CheckBox.isSelected();//False
		System.out.println(XYZ);
		
		CheckBox.click();//Select the CheckBox
		Thread.sleep(4000);
		
		XYZ = CheckBox.isSelected();
		System.out.println(XYZ);//True
		Thread.sleep(4000);
		
		CheckBox.click();//UnSelect the CheckBox
		System.out.println(XYZ);//True
		
	}

}
