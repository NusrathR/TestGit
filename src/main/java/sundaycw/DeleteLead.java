package sundaycw;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DeleteLead extends OpenTapsWrapper{

	@Test(groups="Sanity",dependsOnGroups = "Smoke")
	  public void doDeleteLead(){
		  System.out.println("Delete Lead");
	  }
  @AfterMethod(groups="Sanity")
  public void VerifyDeleteLead() {
	  System.out.println("Verify Delete Lead");
  }
}
