/**
 * 
 */
package Com.MercuryTours.Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Dawit
 *
 */
public class LoginPage {
WebDriver driver;
//This Class will Store all the Locators and Methods of the Login Page
By userName= By.name("userName");
By password= By.name("password");
By submit = By.name("login");

public LoginPage(WebDriver driver2) {
	// TODO Auto-generated constructor stub
}
//This Constructor will intialize the Class level driver
public void Loginpage(WebDriver driver) {
this.driver=driver;
}
//Create Three Methods for the three Function
public void typeusername () {
driver.findElement(userName).sendKeys("a");
	
}
public void typePassword(){
driver.findElement(password).sendKeys("a");
	
}
public void ClickonLoginpage() {
driver.findElement(submit).click();	

}

}
