import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_SampleTestCases {

	public static void main(String[] args) {

System.setProperty("WebDriver.ChromeDriver","ChromeDriver.exe");

WebDriver Driver = new ChromeDriver();

Driver.manage().window().maximize();

Driver.get("https://en.wikipedia.org/wiki/Selenium_(software)");

Driver.findElement(By.linkText("Create account")).click();

String URL1 = Driver.getCurrentUrl();

//System.out.println(URL1);

if(URL1.contains("wikipedia.org")) {

System.out.println("1st Verification:- " + " It is an Internal Link - Passed ");
}
else
System.out.println("It is NOT an Internal Link- Failed");

Driver.navigate().back();

Driver.findElement(By.partialLinkText("seleniumhq")).click();

String URL2 = Driver.getCurrentUrl();

System.out.println(URL2);

if(!URL2.contains("wikipedia.org")) {

System.out.println("It is an External Link - passed ");
}
else

System.out.println("It is Not an Internal Link - Failed ");
Driver.quit();
}	

}

