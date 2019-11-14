package SeleniumBasic;

import org.testng.annotations.Test;

public class TestNGPriority {
  @Test(groups={"Sanity"})
  public void D() {
   
	  System.out.println("D");
  }
  @Test(priority = 2)
  public void C() {
	System.out.println("c");  
	  
	  }
  @Test(priority = 3)
  public void B() {
	System.out.println("B");  
  }
  @Test(priority = 4)
  public void A() {
	  System.out.println("A");
	  
  }
}
