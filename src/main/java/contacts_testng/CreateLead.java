package contacts_testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends CommonMethd{
	 @DataProvider(name="Lead")
	  public Object[][] leadInfor()
	  {
		 Object[][] data = new Object[5][5];
		 data[0][0] = "Company1";
		 data[0][1]= "LD_CL_Mar_FN_100";
		 data[0][2] = "LD_CL_Mar_LN_100";
		 data[0][3] = "LD_CL_Mar_100@testleaf.com";
		 data[0][4] = "7654321890";
		 
		 data[1][0]= "Company2";
		 data[1][1]= "LD_CL_Mar_FN_101";
		 data[1][2] = "LD_CL_Mar_LN_101";
		 data[1][3] = "LD_CL_Mar_101@testleaf.com";
		 data[1][4] = "3214567890"; 
			
		 data[2][0]= "Company3";		 
		 data[2][1]= "LD_CL_Mar_FN_102";
		 data[2][2] = "LD_CL_Mar_LN_102";
		 data[2][3] = "LD_CL_Mar_102@testleaf.com";
		 data[2][4] = "8907654321";	 
		 
		 data[3][0]= "Company4";		 
		 data[3][1]= "LD_CL_Mar_FN_103";
		 data[3][2] = "LD_CL_Mar_LN_103";
		 data[3][3] = "LD_CL_Mar_103@testleaf.com";
		 data[3][4] = "9876543210";	  
		 
		 data[4][0]= "Company5";
		 data[4][1]= "LD_CL_Mar_FN_104";
		 data[4][2] = "LD_CL_Mar_LN_104";
		 data[4][3] = "LD_CL_Mar_104@testleaf.com";
		 data[4][4] = "7609854321";	 
		 
		 return data;
	  }
		@Test(dataProvider = "Lead",groups ="Smoke")
	  public void leadCreate(String Company, String forename, String lastname, String mailaddress, String phoneno ) {
		//Implicit wait and create contact
				browserWait(40);
				  //Click on Contacts Tab
		  		findWebElementByXpath("(//div[@class='x-panel-header'])[2]/a");
		  		clickOnElement();
		  		//Click on create contact
		  		findWebElementByXpath("//ul[@class='shortcuts']/li[2]/a");
				clickOnElement();
				//Enter Company Name
				findWebElementByXpath("//input[@id='createLeadForm_companyName']");
				sendKeysToWebElement(forename);
				
		  		//Enter First Name
				findWebElementByXpath("//input[@id='createLeadForm_firstName']");
				sendKeysToWebElement(forename);
				//Enter Last Name
				findWebElementByXpath("//input[@id='createLeadForm_lastName']");
				sendKeysToWebElement(lastname);

				//Enter Email address
				findWebElementByID("createLeadForm_primaryEmail");
				sendKeysToWebElement(mailaddress);
				//Enter Phone Number
				findWebElementByXpath("(//input[@name='primaryPhoneNumber'])[4]");
				sendKeysToWebElement(phoneno);
				//Click on Create Contact Button
				findWebElementByName("submitButton");
				clickOnElement();
			
	  }
	}
