import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {

	public static void main(String[] args) {
	
		
		
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://google.com/");
		Driver.manage().window().maximize();
		String WindowHandle = Driver.getWindowHandle();
		System.out.println(WindowHandle);
		//String BrowserTitle = Driver.getTitle();//getting page title
		//String Browserurl = Driver.getCurrentUrl();
	    //System.out.println(BrowserTitle);//it displays Title of the page
		//String browserurl = Driver.getCurrentUrl();//Getting currenturl
		//System.out.println(Browserurl);//prints currenturl
		Driver.close();

	}

}
