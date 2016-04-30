package sundaycw;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DeleteContact extends OpenTapsWrapper{
	 
	@Test(groups="Sanity",dependsOnGroups = "Smoke")
	  public void doDeleteContact(){
		  System.out.println("DeleteContact");
	  }
  @AfterMethod(groups="Sanity",dependsOnGroups = "Smoke")
  public void VerifyDeleteContact() {
	  System.out.println("Verify DeleteContact");
  }
}
