import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
public class DragAndDrop1 {

	public static void main(String[] args) throws InterruptedException {

WebDriver Driver;
Driver=new ChromeDriver();

Driver.manage().window().maximize();
Driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
Driver.manage().timeouts().pageLoadTimeout(2000,TimeUnit.SECONDS);
Driver.manage().deleteAllCookies();
Driver.manage().timeouts().pageLoadTimeout(2000,TimeUnit.SECONDS);
Driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
Driver.findElement(By.id("box7")).click();
WebElement dragme = Driver.findElement(By.id("box7"));
WebElement dropme =Driver.findElement(By.id("box107"));
Actions Builder = new Actions(Driver);
Thread.sleep(4000);
Builder.dragAndDrop(dragme, dropme).perform();
//Driver.close();
Driver.findElement(By.id("box1")).click();
WebElement dragmeO = Driver.findElement(By.id("box101"));
WebElement dropmeN = Driver.findElement(By.id("box101"));
Actions Builder2 = new Actions(Driver);
Thread.sleep(4000);
Builder2.dragAndDrop(dragmeO, dropmeN).perform();
	}


}
