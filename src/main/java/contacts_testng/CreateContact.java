package contacts_testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateContact extends CommonMethd{
 @DataProvider(name="Contacts")
  public Object[][] ContactInfor()
  {
	 Object[][] data = new Object[5][4];
	 data[0][0]= "LD_CC_Mar_FN_100";
	 data[0][1] = "LD_CC_Mar_LN_100";
	 data[0][2] = "LD_CC_Mar_100@testleaf.com";
	 data[0][3] = "8763215678";
	 data[1][0]= "LD_CC_Mar_FN_101";
	 data[1][1] = "LD_CC_Mar_LN_101";
	 data[1][2] = "LD_CC_Mar_101@testleaf.com";
	 data[1][3] = "6543217890"; 
	 data[2][0]= "LD_CC_Mar_FN_102";
	 data[2][1] = "LD_CC_Mar_LN_102";
	 data[2][2] = "LD_CC_Mar_102@testleaf.com";
	 data[2][3] = "0984352167";	 
	 data[3][0]= "LD_CC_Mar_FN_103";
	 data[3][1] = "LD_CC_Mar_LN_103";
	 data[3][2] = "LD_CC_Mar_103@testleaf.com";
	 data[3][3] = "5432167890";	  
	 data[4][0]= "LD_CC_Mar_FN_104";
	 data[4][1] = "LD_CC_Mar_LN_104";
	 data[4][2] = "LD_CC_Mar_104@testleaf.com";
	 data[4][3] = "5343728910";	 
	 return data;
  }
	@Test(dataProvider = "Contacts",groups="Smoke")
  public void contactCreate(String forename, String lastname, String mailaddress, String phoneno ) {
	//Implicit wait and create contact
			browserWait(40);
			  //Click on Contacts Tab
	  		findWebElementByXpath("(//div[@class='x-panel-header'])[3]/a");
	  		clickOnElement();
	  		//Click on create contact
	  		findWebElementByXpath("//ul[@class='shortcuts']/li[2]/a");
			clickOnElement();
			
	  		//Enter First Name
			findWebElementByXpath("//input[@id='firstNameField']");
			sendKeysToWebElement(forename);
			//Enter Last Name
			findWebElementByXpath("//input[@id='lastNameField']");
			sendKeysToWebElement(lastname);

			//Enter Email address
			findWebElementByID("createContactForm_primaryEmail");
			sendKeysToWebElement(mailaddress);
			//Enter Phone Number
			findWebElementByXpath("(//input[@name='primaryPhoneNumber'])[4]");
			sendKeysToWebElement(phoneno);
			//Click on Create Contact Button
			findWebElementByName("submitButton");
			clickOnElement();
		
  }
}
