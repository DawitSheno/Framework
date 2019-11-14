import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown {

	public static void main(String[] args) {

		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("http://www.gcrit.com/build3/create_account.php");
		boolean DisplayStatus = Driver.findElement(By.name("country")).isDisplayed();
		System.out.println(DisplayStatus);
	
		
		boolean EnabledStatus = Driver.findElement(By.name("country")).isEnabled();
		System.out.println(EnabledStatus);
		
		Select DropDown = new Select(Driver.findElement(By.name("country")));
		
		DropDown.selectByVisibleText("Ethiopia");
		 
		List<WebElement> e = DropDown.getOptions();
		System.out.println(e.size());
	    
		/*WebElement DisplayStatus =Driver.findElement(By.name("country"));
		boolean CurrentStat = DisplayStatus.isDisplayed();
		System.out.println(CurrentStat);
		
		DisplayStatus.isEnabled();
		System.out.println(CurrentStat);
		
		DisplayStatus.click();
		System.out.println(CurrentStat);
		
		Select DropDown = new Select(Driver.findElement(By.name("country")));
		DropDown.selectByVisibleText("Ethiopia");
		*/
		Driver.close();
		
	}

}
