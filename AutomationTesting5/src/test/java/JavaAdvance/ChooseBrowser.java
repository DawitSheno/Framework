package JavaAdvance;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ChooseBrowser {

	public static void main(String[] args) {
		// this prog helps to pick browser to launch test
		// create scanner object
		// scan what tester inputs from keyboard
		// based on input browser name to lauch
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your browser name");
		String browserName = sc.nextLine();// helps to save value
		// System.out.println("prefer to launch " + browserName + "browser");
		// to run the browser
		if (browserName.toUpperCase().contains("IE")) {
			System.out.println("i am about to run ie browser");
		} else if (browserName.toUpperCase().contains("CHROME")) {
			System.out.println("I am about to run chrome browser");
			WebDriver Driver = new ChromeDriver();
			Driver.get("https://www.newtours.demoaut.com");

		} else if (browserName.toUpperCase().contains("FIREFOX")) {
			// System.out.println("i am about to run firefox");

			// WebDriver Driver = new ChromeDriver();
			// Driver.get("\"http://newtours.demoaut.com/");
		}
	}

	public static WebDriver startABrowser(String browserName) {
		WebDriver driver = null;
		if (browserName.toUpperCase().contains("IE")) {
			System.out.println("i am about to run ie browser");
			driver = new InternetExplorerDriver();

		} else if (browserName.toUpperCase().contains("CHROME")) {
			System.out.println("I am about to run chrome browser");
			driver = new ChromeDriver();

		} else if (browserName.toUpperCase().contains("FIREFOX")) {
			// System.out.println("i am about to run firefox");
			driver = new FirefoxDriver();

		}

	return driver;
	}
}
