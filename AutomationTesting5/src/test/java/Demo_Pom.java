import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Pom {

	public static void main(String[] args) {
WebDriver Driver = new ChromeDriver();
Driver.get("https://bbc.com");
System.out.println(Driver.getTitle());
//Driver.findElement(By.linkText("No,thanks")).click();
//Driver.findElement(By.cssSelector("Body")).sendKeys(Keys.CONTROL + "t");
//Driver.navigate().to("https://bbc.com");
//Driver.findElement(By.linkText("Travel")).click();
Driver.findElement(By.cssSelector("Body")).sendKeys(Keys.CONTROL+ "t");
Driver.get("https://google.com");
System.out.println(Driver.getCurrentUrl());

	}

}
