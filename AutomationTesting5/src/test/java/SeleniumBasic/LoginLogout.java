package SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginLogout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create an object of selenium class
		WebDriver driver = new ChromeDriver();
		// driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS );
		driver.get("http://newtours.demoaut.com/");
		String obj = driver.getCurrentUrl();
		System.out.println(obj);
		if(obj.equalsIgnoreCase("http://newtours.demoaut.com/")){
			System.out.println("i am in the right page ");
			}
	else {
		System.out.println("wrong page ");
	}
		//boolean url =driver.equals(obj)(http://newtours.demoaut.com/);
		//System.out.println(url);
		driver.findElement(By.name("userName")).sendKeys("a");
		driver.findElement(By.name("password")).sendKeys("a");
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys("Maraki");
		driver.findElement(By.name("lastName")).sendKeys("Dawit");
		driver.findElement(By.name("phone")).sendKeys("I don't have phone yet");
		driver.findElement(By.id("userName")).sendKeys("I LOVE MY DAD@ALL DAY");
		driver.findElement(By.name("address1")).sendKeys("It's MY DAD'S ADDRESS");
		driver.findElement(By.name("city")).sendKeys("Arlington");
		driver.findElement(By.name("state")).sendKeys("VA");
		driver.findElement(By.name("postalCode")).sendKeys("Almost Done");
		driver.findElement(By.name("country"));
		driver.findElement(By.id("email")).sendKeys("IlovemyMOMtoo@Allday");
		driver.findElement(By.name("password")).sendKeys("THANKYOU SOL");
		driver.findElement(By.name("confirmPassword")).sendKeys("I MEAN IT");
		// driver.findElement(By.name("")).sendKeys("I mean it ");
		driver.findElement(By.name("register")).click();
		// driver.findElement(By.name("login")).click();
		driver.close();

	}

	{
	}
}

// By driver;
// driver.findElement(By.name("userName")).sendKeys("a");
// driver.findElement(By.name("userName")).sendKeys("a");
// driver.findElement(By.name("password")).sendKeys("a");
// driver.findElement(By.name("login")).click();}
