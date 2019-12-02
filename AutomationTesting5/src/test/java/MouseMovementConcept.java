import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseMovementConcept {
	@Test

	public void openBroswer() throws InterruptedException{

	             
				//System.setProperty("webdriver.chrome.driver", "/Users/naveenkhunteta/Downloads/chromedriver.exe");	
				WebDriver driver = new ChromeDriver(); //launch chrome
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				
				driver.get("http://spicejet.com/");
				Actions action = new Actions(driver);
				Thread.sleep(5000);
				driver.findElement(By.xpath("//a[@id='highlight-addons']"));
				Thread.sleep(5000);
				action.clickAndHold(driver.findElement(By.xpath("//a[@id='highlight-addons']"))).build().perform();
				Thread.sleep(4000);
				driver.findElement(By.id("spicestyleheader")).click();
				//action.contextClick((WebElement) By.xpath("//a[@id='highlight-addons']")).build().perform();
				//Thread.sleep(5000);
			
				driver.close();
				
			}

		

	}

