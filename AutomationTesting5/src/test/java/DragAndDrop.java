import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DragAndDrop {
WebDriver Driver ;
@BeforeMethod
public void Setup() {
Driver.manage().window().maximize();
Driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
Driver.manage().timeouts().pageLoadTimeout(3000, TimeUnit.SECONDS);
Driver.manage().deleteAllCookies();
Driver = new ChromeDriver();

Driver.get("http://www.dhtmlgoodies.com/");


}
@Test
public void DragAandDropTest() {

}
}