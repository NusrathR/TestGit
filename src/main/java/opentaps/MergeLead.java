package opentaps;

import org.testng.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class MergeLead extends OpenTapsWrapper{
  @Test(description ="This method is used for Merge Lead",enabled=false)
  public void leadMerge() {
  System.out.println("Merge Delete");
  }
  @AfterMethod(description ="This method is used for verification of Deleting Lead")
  public void verifyMergeLead()
  {
	  System.out.println("Verification of Merge Lead");
  }
}
