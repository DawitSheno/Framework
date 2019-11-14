import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingRadioButton {

	public static void main(String[] args) throws InterruptedException {
	
		
		WebDriver Driver = new ChromeDriver();
		Driver.get("http://www.gcrit.com/build3/create_account.php");
		WebElement RadioButton = Driver.findElement(By.xpath("//*[@id=\"bodyContent\"]/form/div/div[2]/table/tbody/tr[1]/td[2]/input[1]"));
		boolean Status = RadioButton.isDisplayed();
		System.out.println(Status);//True
		
		Status=RadioButton.isEnabled();
		System.out.println(Status);//True
		
		Status =RadioButton.isSelected();
		System.out.println(Status);//False
		
		//Driver.findElement(By.xpath("//*[@id=\"bodyContent\"]/form/div/div[2]/table/tbody/tr[1]/td[2]/input[1]")).click();
		RadioButton.click();
		Status = RadioButton.isSelected();
		System.out.println(Status);//true
		
		Driver.close();
		
	
		//RadioButton.click();
		//boolean Status = RadioButton.isSelected();
		//System.out.println(Status);//TRUE
		//Driver.findElement(By.xpath("//*[@id=\"bodyContent\"]/form/div/div[2]/table/tbody/tr[1]/td[2]/input[1]")).click();
		//RadioButton.click();
		//RadioButton.isSelected();
		//System.out.println(Status);
		
		//RadioButton.click();

	}

}
