import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasics {
	
	/*Setup System Property for Chrome
	login to the App
	launch chrome Browser
	Enter the URL
	 Google Title Test
	Logout from the App
	Close Browser
	delete all cookies
	PASSED: googleTitletest
	*/
	// Any Annotation Starts with @Before is Called Pre-Condition
	
	@BeforeSuite//1
	public void Setup() {
		System.out.println("Setup System Property for Chrome");
	}

	@BeforeTest	//2
	public void launchBrowser() {
		
		System.out.println("launch Browser");
	}
	@BeforeClass//3
	public void Login() {
		System.out.println("login to the App");
	}
	
	@BeforeMethod//4
	public void EnterURL() {
		System.out.println("Enter the URL");
	}
	
	// Any Annotation Starts with @Test is Called TestCase
	@Test//5
	public void googleTitletest(){
		System.out.println(" googleTitletest");
	}
	@Test(priority=2)
	public void SearchTest() {
		System.out.println("Search Test ");
	}
	
	// Any Annotation Starts with @After is Called Post-Condition
	
	@AfterMethod//6
	public void Logout() {
		System.out.println("Logout from the App");
	}
	
	@AfterClass//7
	public void CloseBrowser() {
		System.out.println("Close Browser");
	}
	@AfterTest//8
	public void deleteAllCookies() {
		System.out.println("delete all cookies");
}}