package sundaycw;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MergeLead extends OpenTapsWrapper{
	  
	@Test(groups="Sanity",enabled = false)
  public void doMergeLead(){
	  System.out.println("Merge Lead");
  }
  @AfterMethod(groups="Sanity")
  public void VerifyMergeLead() {
	  System.out.println("Verify Merge Lead");
  }
}
