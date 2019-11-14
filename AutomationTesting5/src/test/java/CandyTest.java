import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CandyTest {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Driver.get("https://www.bbc.com/");
		Thread.sleep(4000);
		Driver.findElement(By.linkText("More")).click();
		
		//Driver.findElement(By.linkText("Capital")).click();
		Thread.sleep(3000);
		Driver.findElement(By.id("orb-search-q")).sendKeys("Ethipian Prime Minister");
		Driver.findElement(By.id("orb-search-button")).click();
		String url = Driver.getTitle();
		
		//String pageTitle = Driver.getCurrentUrl();
		System.out.println(url);
		if (url.equals("BBC - Search results for Ethipian Prime Minister")) {
			System.out.println("we are on the right page");
		}else
		{
			System.out.println("we are not the same page");
		}
		Driver.close();
		
		
		
	}

}
