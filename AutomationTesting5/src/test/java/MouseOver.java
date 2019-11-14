import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) throws InterruptedException {
//Mouse Over on WebElement

WebDriver Driver;

Driver = new ChromeDriver();

 Driver.get("http://www.habeshaschool.com");

WebElement Element = Driver.findElement(By.linkText("Projects"));

Actions MouseOver = new Actions(Driver);

MouseOver.moveToElement(Element).moveToElement( Driver.findElement(By.linkText("Projects"))).build().perform();

Thread.sleep(4000);
Driver.findElement(By.linkText("Template")).click();
Thread.sleep(4000);



Driver.quit();
	}

}
