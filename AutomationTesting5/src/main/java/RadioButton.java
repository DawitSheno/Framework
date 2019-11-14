import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButton {

	public static void main(String[] args) {

		
	WebDriver Driver = new ChromeDriver();
	WebElement ElementStatus = Driver.findElement(By.name("tripType"));
	ElementStatus = RadioButton.isSelected();
	
	Driver.get("http://newtours.demoaut.com");
	RadioButton.click();
	RadioButton.click();
	RadioButton.click();
    //Driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]")).click();
    //boolean
    ElementStatus = RadioButton.isSelected();
    System.out.println(ElementStatus);
	}

	private static WebElement isSelected() {
		// TODO Auto-generated method stub
		return null;
	}

	private static void click() {
		// TODO Auto-generated method stub
		
	}

	//private static void click() {
		// TODO Auto-generated method stub
		
	//}

	//private static WebElement isSelected() {
		// TODO Auto-generated method stub
		//return null;
	{}
}

