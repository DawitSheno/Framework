import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NextButton {

	public static void main(String[] args) {

		
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://www.Gmail.com/");
		WebElement NextButton = Driver.findElement(By.id("identifierNext"));
		
		System.out.println(NextButton.isDisplayed());//True
		
		System.out.println(NextButton.isEnabled());//True
		System.out.println(NextButton.getText());
		
		
		NextButton.click();
		//boolean status = NextButton.isDisplayed();
		//NextButton.isDisplayed();
		//System.out.println(status);
		//status = NextButton.isEnabled();
		//System.out.println(status);
		//NextButton.click();
				
	}

}
