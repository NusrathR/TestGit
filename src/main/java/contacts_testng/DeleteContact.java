package contacts_testng;

import org.testng.annotations.Test;

public class DeleteContact extends CommonMethd {
  @Test(dependsOnMethods="contacts_testng.CreateContact.contactCreate",groups="Sanity",dependsOnGroups = "Smoke")
  public void contactDelete() throws Exception {
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
			sendKeysToWebElement("8763215678");
			/*//Find the contact using id
			findWebElementByXpath("//input[@name='id']");
		    sendKeysToWebElement("10035");*/
	        //Click on Find Contact
		    findWebElementByXpath("(//td[@class='x-btn-center'])[7]");
		    clickOnElement();
		    //Click on the first element
			Thread.sleep(3000);
			findWebElementByXpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
			clickOnElement();			
	 	//Navigating to page and click on Deactivate Contact Button
		browserWait(3000);

		findWebElementByClassName("subMenuButtonDangerous");
		clickOnElement();
		//findWebElementByXpath("//a[@class='subMenuButtonDangerous']");
		//findWebElementByXpath("(//div[@class='frameSectionExtra'])[2]/a[2]");
		
		 //Alert Handling
	    switchToWindowAlert();
	    manageAlert("accept");
		
		
  }
}
