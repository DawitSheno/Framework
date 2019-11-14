import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckingInternalAndExternalLinks {

	public static void main(String[] args) {
		
		
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://en.wikipedia.org/wiki/Selenium_(software)");
        Driver.findElement(By.linkText("Create account")).click();
      //  String FirstURL = Driver.getCurrentUrl();
        String FirstURL = Driver.getCurrentUrl();
        System.out.println(FirstURL);
        
        if( FirstURL.contains("wikipedia.org")) {
        System.out.println("1st Verification : "+"It is an Internal Link = Passed ");}
        
	else
        {
	   
	System.out.println("It is an External Link = Failed");}
     Driver.navigate().back();
     
     Driver.findElement(By.linkText("www.seleniumhq.org")).click();
     String secondURL = Driver.getCurrentUrl();
     System.out.println(secondURL);
     
     if(! secondURL.contains("wikipedia.org")) {
    	 System.out.println("2nd Verification : "+"It is External Link = Passed");
     }else {
    	 System.out.println("It is an Internal Link  = Failed ");
    	 
    	 Driver.close();
     }
	}
}
   //If we need to check with Negative Testing we have to use
   // "!" not Operator
   
