 package sundaycw;

  import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

  public class EditContact extends OpenTapsWrapper{
	  
	  @Test(groups="Sanity")
  	  public void doEditContact(){
  		  System.out.println("EditContact");
  	  }
    @AfterMethod(groups="Sanity")
    public void VerifyEditContact() {
  	  System.out.println("Verify EditContact");
    }
  }


