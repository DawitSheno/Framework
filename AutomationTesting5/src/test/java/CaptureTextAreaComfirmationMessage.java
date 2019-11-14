import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CaptureTextAreaComfirmationMessage {

	public static void main(String[] args) {
    
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("http://www.gcrit.com/build3/");
		Driver.findElement(By.linkText("create an account")).click();
		Driver.findElement(By.xpath("//*[@id=\"bodyContent\"]/form/div/div[2]/table/tbody/tr[1]/td[2]/input[2]")).click();
		Driver.findElement(By.name("firstname")).sendKeys("Abene");
		Driver.findElement(By.name("lastname")).sendKeys("Mara");
		Driver.findElement(By.name("dob")).sendKeys("12/10/2015");
		Driver.findElement(By.name("email_address")).sendKeys("obenemara@yahoo.com");
		Driver.findElement(By.name("street_address")).sendKeys("4448 TAYLOR AVE");
		Driver.findElement(By.name("suburb")).sendKeys("Washington DC");
		Driver.findElement(By.name("postcode")).sendKeys("12345");
		Driver.findElement(By.name("city")).sendKeys("Arlington");
		Driver.findElement(By.name("state")).sendKeys("virginia");
		Select Dropdown = new Select(Driver.findElement(By.name("country")));
		Dropdown.selectByVisibleText("Ethiopia");
		Driver.findElement(By.name("telephone")).sendKeys("1234567890");
		Driver.findElement(By.name("password")).sendKeys("Thanks");
		Driver.findElement(By.name("confirmation")).sendKeys("Thanks");
		Driver.findElement(By.id("tdb4")).click();
		String TextArea =Driver.findElement(By.className("messageStackError")).getText();
		System.out.println(TextArea );
		boolean LinkPresent = (Driver.findElement(By.linkText("Log Off"))).isDisplayed();
		System.out.println(LinkPresent);
		
		if(TextArea.equals("Your Account Has Been Created!")) {
			System.out.println("Customer Registration is Successful = Passed");
		}
		else
	{
	System.out.println("Customer Registration UnSuccessful = Failed");	
	
	}
     Driver.close();
	}}
