package contacts_testng;

import org.testng.annotations.Test;

public class EditContact extends CommonMethd{
  @Test(dependsOnMethods="contacts_testng.CreateContact.contactCreate",groups="Sanity")
  public void findContacts() throws InterruptedException {
	//Click on Contacts Tab
			findWebElementByXpath("(//div[@class='x-panel-header'])[3]/a");
			clickOnElement();
			//Click on Find Contacts
			findWebElementByXpath("//ul[@class='shortcuts']/li[3]/a");
			clickOnElement();
			//Click on phone tab
		    Thread.sleep(3000);
			
			findWebElementByXpath("//span[contains(text(),'Phone')]");
			clickOnElement();
			//Type phone number
			findWebElementByXpath("//input[@name='phoneNumber']");
			sendKeysToWebElement("6543217890");
			//Click on Find Contact
		    findWebElementByXpath("(//td[@class='x-btn-center'])[7]");
		    clickOnElement();
		  //Click on the first element
			Thread.sleep(2000);
			findWebElementByXpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
			clickOnElement();		
		    //==============Editing the Contact=================
		    browserWait(3000);
			findWebElementByXpath("//a[@class='subMenuButton']");
			clickOnElement();
			findWebElementByXpath("(//input[@name='firstName'])[3]");
			sendKeysToWebElement("FirstContactEdited");
			findWebElementByXpath("(//input[@class='smallSubmit'])[1]");
		    clickOnElement();
			
		    
  }
}
