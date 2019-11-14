import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CapturingTheCurrentUrlAndCompareWithTheExpected {


	public static void main(String[] args) {
	
		
		WebDriver Driver = new ChromeDriver();
		Driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		Driver.manage().window().maximize();
		Driver.get("http://www.gcrit.com/build3/admin/login.php?osCAdminID=mhddesqsav99is0l66e3vo3ql4");
		Driver.findElement(By.linkText("Online Catalog")).click();
		String URL = Driver.getCurrentUrl();
		System.out.println(URL);
		
		if(URL.equals("http://www.gcrit.com/build3/")) {
		
			System.out.println("Application is Redirecting to User Interface");
		}else
			System.out.println("Application is not Redirecting to User Interface");
		//Driver.close();
		
	}

}
