package SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumWebElementCommands {

	public static void main(String[] args) {
		// Selenium Web element commands
		WebDriver Driver = new FirefoxDriver();
		Driver.get("http://newtours.demoaut.com/");//opening the Firefox browser
		Driver.findElement(By.name("userName"));
		WebElement userName = Driver.findElement(By.name("userName"));
		userName.clear();//this command will clear up any text in the edit box
		userName.click();//this command will clickable 
		System.out.println(userName.getAttribute("size"));//to get the size of the Attribute
		System.out.println(userName.getAttribute("type"));
		Point location = userName.getLocation();
		//System.out.println(" input box is located at:"+"x=", "+ location.x +" and y=+ location");
		 Dimension size = userName.getSize();
		System.out.println(size.height);
		System.out.println(size.width);
		System.out.println(userName.getTagName());// prints the TAG name of the element
		System.out.println(userName.getText());
		System.out.println(Driver.findElement(By.linkText("SIGN-ON")));//it will prints the Tag Name(first text)
		if(Driver.findElements(By.id("userName")).size() >= 1) {
			System.out.print("element exist");
		}else{
			System.out.print("element not exist");
		}
		

	}

}
