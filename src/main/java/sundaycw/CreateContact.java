package sundaycw;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CreateContact extends OpenTapsWrapper{
	
	@Test(groups="Smoke")
	  public void doCreateContact(){
		  System.out.println("Create Contact");
	  }
  @AfterMethod(groups="Smoke")
  public void VerifyCreateContact() {
	  System.out.println("Verify Create Contact");
  }
 
}