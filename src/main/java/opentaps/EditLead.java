package opentaps;

import org.testng.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class EditLead extends OpenTapsWrapper{
  @Test(description ="This method is used for Edit Lead",dependsOnMethods="opentaps.Createlead.createLead")
  public void leadEdit() {
System.out.println("Lead Edition");
  }
  @AfterMethod(description ="This method is used for verification of Edit Lead")
  public void verifyEditLead()
  {
	  System.out.println("Verification of Edit Lead");
  }
}
