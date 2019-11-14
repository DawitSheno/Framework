import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextArea {

	public static void main(String[] args) {

		WebDriver Driver = new ChromeDriver();
		Driver.get("https://mail.google.com");//launching Gmail
		//inspect and getting Element Locator xpath
		//Driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span")).click();
		//using Element Locator id
	    Driver.findElement(By.id("identifierNext")).click();
	    //Capture the Error Message
		String ErrorMessage = Driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form/content/section/div/content/div[1]/div/div[2]/div[2]")).getText();
		//Display the Error Message on the Console
        System.out.println(ErrorMessage);
	}

}
