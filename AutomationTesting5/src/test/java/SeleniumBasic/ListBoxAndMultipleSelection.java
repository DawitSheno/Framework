package SeleniumBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxAndMultipleSelection {

	public static void main(String[] args)  {
		// Testing list box and multiple list box selection
		
		WebDriver Driver = new ChromeDriver();
		
		Driver.get("http://letef.com/test/testPage.php");
		//Using Sending keys
		//Driver.findElement(By.name("country")).sendKeys("Ethiopia");
		//Driver.findElement(By.xpath("*.//select/option[@value='India']")).click();
//Driver.findElement(By.name("country")).findElement(By.cssSelector("option[value='FRANCE']")).click();
		//Multiple Selections
	//Driver.findElement(By.xpath("/html/body/form/select[2]/option[2]")).click();
	//Driver.findElement(By.xpath("/html/body/form/select[2]/option[4]")).click();
      
     //Using Select Class
    Select Skill = new Select(Driver.findElement(By.name("Skill")));
     Skill.selectByValue("qa");
    //Skill.selectByIndex(1);
    //Skill.selectByVisibleText("Database");
    //Driver.findElement(By.name("name")).clear();
    //Driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
   // Driver.findElement(By.name("name")).sendKeys("Selenium");

	}

}
