package SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class RadioCheckListBoxAndMultipleSelections {

	public static void main(String[] args) {
		//How to test Radio Button, Check Box, List Box and Multiple Selections
		WebDriver Driver = new ChromeDriver();
		Driver.get("http://www.habeshaschool.com");
		Driver.findElements(By.partialLinkText("Auto of")).size();
		//Driver.get("http://letef.com/test/testPage.php");//launch letef.com testing Webpage
		//Testing Radio Buttons
		//Driver.findElement(By.id("other")).click();
		//Driver.findElements(By.name("gender")).get(1).click();//Gender will be selected because index #1
	    //Driver.findElements(By.name("gender")).get(2).click();
		//Driver.findElement(By.xpath("//*[@id=\"other\"]")).click();
		//Driver.findElement(By.cssSelector("input[name='gender'][value='female']")).click();
	    //Driver.findElement(By.xpath("//*[@id=\"other\"]")).click();
		//Driver.findElement(By.cssSelector("input[name='gender'][value='female']")).click();
		
		}
}
		
		
