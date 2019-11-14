/**
 * 
 */
package mercury.loginPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Com.MercuryTours.Pom.LoginPage;


/**
 * @author Dawit
 *
 */
public class VerifyMercuryLoginPage {
@Test
public void verifyLogin() {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.get("http://www.newtours.demoaut.com");
// Now time to call the page
LoginPage login = new LoginPage(driver);
login.typeusername();
login.typePassword();
login.ClickonLoginpage();
driver.close();
}
}
