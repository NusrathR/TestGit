package opentaps;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OpenTapsWrapper {
  @BeforeClass(description ="This method is used for launch browser")
  public void launchBrowser() {
  System.out.println("Browser Launch");
  }
  @AfterClass(description ="This method is used for Close Browser",alwaysRun=true)
  public void closeBrowser()
  {
	  System.out.println("Close the Browser");
  }
  @BeforeMethod(description ="This method is used for Clicking Leads along with login")
  public void click()
  {
	  System.out.println("Login+ click CRM + Click Leads Tab");
  }
  
}
