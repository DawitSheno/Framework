package JavaAdvance;

import org.openqa.selenium.WebDriver;

public class TestLoginPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =ChooseBrowser.startABrowser("Chrome");
		driver.get("http://www.newtours.demoaut.com");
		
		driver =ChooseBrowser.startABrowser("firefox");
		driver.get("http://www.newtours.demoaut.com");

	}

}
