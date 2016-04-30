package contacts_testng;


import org.testng.annotations.Test;

public class MergeContact extends CommonMethd{
	@Test(dependsOnMethods="contacts_testng.CreateContact.contactCreate",groups="Sanity")
	 
  public void contactmerge() throws Exception {
		 
			
		 //Click on Contacts Tab
	  		findWebElementByXpath("(//div[@class='x-panel-header'])[3]/a");
	  		clickOnElement();
	  			
	
			//Click Merge Contacts button
			findWebElementByXpath("//ul[@class='shortcuts']/li[4]/a");
			clickOnElement();
			//==========First Search Item====
			//Click on search icon
			findWebElementByXpath("//img[@alt='Lookup']");
			clickOnElement();
			//Go to Next Window
			Thread.sleep(3000);
			nextWin();
			Thread.sleep(3000);
			//Find first contact using phone number
			findWebElementByXpath("//span[contains(text(),'Phone')]");
			clickOnElement();
			//Type phone number
			findWebElementByXpath("//input[@name='phoneNumber']");
			sendKeysToWebElement("0984352167");
			//Click on Find Contact
		    findWebElementByXpath("(//td[@class='x-btn-center'])[1]");
		    clickOnElement();
		    //Click on the first element
			Thread.sleep(3000);
			findWebElementByXpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
			clickOnElement();
			//==========Second Search Item====
			//Navigate back to parent window
			primaryWin();
			Thread.sleep(3000);
			
			//Click on search icon
			findWebElementByXpath("(//img[@alt='Lookup'])[2]");
			clickOnElement();
			Thread.sleep(3000);
			nextWin();
			Thread.sleep(3000);
			
			//Find second contact using phone number
			findWebElementByXpath("//span[contains(text(),'Phone')]");
			clickOnElement();
			
			//Type phone number
			findWebElementByXpath("//input[@name='phoneNumber']");
			sendKeysToWebElement("5432167890");
			//Click on Find Contact
		    findWebElementByXpath("(//td[@class='x-btn-center'])[1]");
		    clickOnElement();
		    //Click on the first element
			Thread.sleep(3000);
			findWebElementByXpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
			clickOnElement();
			//Navigate back to parent window
			primaryWin();
			Thread.sleep(3000);
			
			/*findWebElementByXpath("//input[@name='ComboBox_partyIdFrom']");
			sendKeysToWebElement("10031");
			findWebElementByXpath("//input[@name='ComboBox_partyIdTo']");
			sendKeysToWebElement("10045");*/
			//Click on Merge Button
			findWebElementByClassName("buttonDangerous");
			clickOnElement();
			//Alert Handling
		    switchToWindowAlert();
		    manageAlert("accept");
		    

	 }
}
