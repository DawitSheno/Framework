import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("http://www.habeshaschool.com/");
		System.out.println(Driver.getCurrentUrl());
		Driver.findElement(By.linkText("Resume")).click();
		{
			
		
		//Driver.findElement(By.xpath("//input[@id='jot-ui-searchInput']")).sendKeys("Selenium");
		//Driver.navigate().to("https://www.yahoo.com/");
		//System.out.println(Driver.getTitle());
		//Driver.navigate().back();
		//Driver.navigate().to("http://www.bbc.com/");
		//System.out.println(Driver.getCurrentUrl());
        //Driver.navigate().forward();
	    //Select Dropcountry = new Select( Driver.findElement(By.name("country")));
		//Dropcountry.selectByVisibleText("VATICAN CITY");
		//Driver.findElement(By.name("userName")).sendKeys("Selenium");
		//Driver.findElement(By.name("password")).sendKeys("selenium");
		//Driver.findElement(By.name("login")).click();
		//String url = Driver.getCurrentUrl();
		//System.out.println( url);
		//if(url.equals("https://www.google.com/"))
		//{
		//	System.out.println("i am in the right page  TC Passed ");
		//}
		//else
		//{System.out.println("i am not in the right page TC Failed");
			
			
		
			
		}
		

		//Driver.close();
		//Driver.findElement(By.linkText("SIGN-ON")).click();
		//Driver.findElement(By.name("userName")).sendKeys("a");
		//Driver.findElement(By.name("password")).sendKeys("a");
		//Driver.findElement(By.name("login")).click();
		//WebElement radio   = Driver.findElement(By.name("tripType"));
	 //boolean rvalue = false;
	 
}
		
		}

		
	
	

	

	
