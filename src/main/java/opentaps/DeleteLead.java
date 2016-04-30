package opentaps;

import org.testng.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class DeleteLead extends OpenTapsWrapper{
  @Test(description ="This method is used for Deleting Lead",dependsOnMethods="opentaps.Editlead.leadEdit")
	public void leadDelete() {
  System.out.println("Lead Deletion");
  }
  @AfterMethod(description ="This method is used for verification of deleting Lead")
  public void verifyDeleteLead()
  {
	  System.out.println("Verification of Delete Lead");
  }
}
