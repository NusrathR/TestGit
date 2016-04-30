package contacts_testng;

import org.testng.annotations.Test;

public class DeleteLead extends CommonMethd {
	  @Test(dependsOnMethods="contacts_testng.CreateLead.leadCreate",groups="Sanity")
	  public void leadDelete() throws Exception {
		//Click on Leads Tab
				findWebElementByXpath("(//div[@class='x-panel-header'])[2]/a");
				clickOnElement();
				//Click on Find Leads
				findWebElementByXpath("//ul[@class='shortcuts']/li[3]/a");
				clickOnElement();
				//Click on phone tab
			    Thread.sleep(3000);
				findWebElementByXpath("//span[contains(text(),'Phone')]");
				clickOnElement();
				//Type phone number
				findWebElementByXpath("//input[@name='phoneNumber']");
				sendKeysToWebElement("7609854321");
			
		        //Click on Find Lead
			    findWebElementByXpath("(//td[@class='x-btn-center'])[7]");
			    clickOnElement();
			    //Click on the first element
				Thread.sleep(3000);
				findWebElementByXpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
				clickOnElement();			
		 	//Navigating to page and click on Deactivate Lead Button
			browserWait(3000);

			findWebElementByClassName("subMenuButtonDangerous");
			clickOnElement();
			
			
	  }
	}
