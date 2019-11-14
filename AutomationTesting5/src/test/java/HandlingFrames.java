import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

	public static void main(String[] args) throws InterruptedException {
	
		//we can use in both FrameName and FrameIndex
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://seleniumhq.github.io/selenium/docs/api/java/index.html");
		Driver.switchTo().frame(2);
		Thread.sleep(4000);
		Driver.findElement(By.linkText("org.openqa.selenium")).click();
	    Driver.switchTo().defaultContent();
		Driver.switchTo().frame(0);
		Thread.sleep(4000);
		Driver.findElement(By.linkText("com.thoughtworks.selenium")).click();
		Driver.switchTo().frame("packageFrame");
		Thread.sleep(1000);
		//Driver.findElement(By.name("packageFrame")).click();

		Driver.findElement(By.linkText("AbstractAnnotations")).click();
		//Thread.sleep(4000)
		//Driver.close();


	}

			
			
			
			
			
		}

