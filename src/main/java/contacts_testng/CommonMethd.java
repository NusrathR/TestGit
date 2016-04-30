package contacts_testng;
import week4.*;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CommonMethd extends WrapperMain {
	@Parameters("browser")
	@BeforeClass(groups={"Smoke","Sanity"})
  public void LaunchAndLogin(String brows) {
	  launchApp(brows,"http://demo1.opentaps.org/opentaps/control/main");
		//enter username
		findWebElementByID("username");
		sendKeysToWebElement("DemoSalesManager");
		//enter password
		findWebElementByID("password");
		sendKeysToWebElement("crmsfa");
		//Click Login
		findWebElementByClassName("decorativeSubmit");
		clickOnElement();
		//click on crm/sfa button
				findWebElementByID("button");
				clickOnElement();
				
  }
  
 /* @BeforeMethod
  public void ClickCrmBtn()
  {
		//click on crm/sfa button
		findWebElementByID("button");
		clickOnElement();
		
  }*/
  
  @AfterClass(description="Closing OpenTaps Browser",alwaysRun=true, groups={"Smoke","Sanity"})
  public void BrowserClose()
  {
	  closeTheBrowser();
  }
}
