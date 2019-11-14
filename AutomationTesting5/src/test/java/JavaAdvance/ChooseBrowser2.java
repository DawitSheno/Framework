package JavaAdvance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChooseBrowser2 {

	public static void main(String[] args) {
		//launching the website
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.partialLinkText("Si")).click();
		//driver.findElement(By.name("username")).sendKeys("dawitsheno");
		//driver.findElement(By.id("login-signin")).click();
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("Google")) {
			System.out.println("I'm in the right Page");
		}
		else
		{
			System.out.println("I'm in wrong page");
		
		}
		 System.out.println(driver.getCurrentUrl());//gives you current url
		 //System.out.println(driver.getPageSource());
		driver.close();
		
       
	}

}
