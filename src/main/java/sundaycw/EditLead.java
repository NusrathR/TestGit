package sundaycw;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class EditLead extends OpenTapsWrapper{
	 
	@Test(groups="Sanity")
	  public void doEditLead(){
		  System.out.println("Edit Lead");
	  }
  @AfterMethod(groups="Sanity")
  public void VerifyEditLead() {
	  System.out.println("Verify Edit Lead");
  }
}
