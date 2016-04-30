package sundaycw;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MergeContact extends OpenTapsWrapper{
	
	@Test(groups="Sanity")
  public void doMergeContact(){
	  System.out.println("MergeContact");
  }
  @AfterMethod(groups="Sanity")
  public void VerifyMergeContact() {
	  System.out.println("Verify MergeContact");
  }
}
