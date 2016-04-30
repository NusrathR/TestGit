package week4;

import java.util.Iterator;
import java.util.Set;

import org.junit.*;
public class ContactsCode extends WrapperMain {

	@Test
	public void CreateContact() throws InterruptedException
	{
		launchApp("chrome","http://demo1.opentaps.org/opentaps/control/main");
		//enter username
		findWebElementByID("username");
		
		//sendKeysToWebElement(readExcel("OpenTaps","DataInput",1,0).getStringCellValue());
		//enter password
		findWebElementByID("password");
		sendKeysToWebElement(readExcel("OpenTaps","DataInput",1,1).getStringCellValue());
		//Click Login
		findWebElementByClassName("decorativeSubmit");
		clickOnElement();
		//click on crm/sfa button
		findWebElementByID("button");
		clickOnElement();
		
		//=====================Creating Contact=================
		
		//Implicit wait and create contact
		browserWait(40);
		findWebElementByLinkText("Create Contact");
		clickOnElement();
		//Enter First Name
		findWebElementByXpath("//input[@id='firstNameField']");
		sendKeysToWebElement("LD_FN_04");
		//Enter Last Name
		findWebElementByXpath("//input[@id='lastNameField']");
		sendKeysToWebElement("LD_LN_04");
		//Enter Phone Number
		findWebElementByXpath("(//input[@name='primaryPhoneNumber'])[4]");
		sendKeysToWebElement("8765437654");
		//Enter Email address
		findWebElementByID("createContactForm_primaryEmail");
		sendKeysToWebElement("LD_CC3@gmail.com");
		//Click on Create Contact Button
		findWebElementByName("submitButton");
		clickOnElement();
	
		//==================Finding the Contact===================
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
		sendKeysToWebElement("8765437654");
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
		
		//=================Editing the contact=============
		browserWait(3000);
		findWebElementByXpath("//a[@class='subMenuButton']");
		clickOnElement();
		findWebElementByXpath("(//input[@name='firstName'])[3]");
		sendKeysToWebElement("FirstContactEdited");
		findWebElementByXpath("(//input[@class='smallSubmit'])[1]");
	    clickOnElement();
		
		//==============Deleting the contact=======================
		browserWait(3000);
		findWebElementByXpath("//a[@class='subMenuButtonDangerous']");
		clickOnElement();
		 //Alert Handling
	    switchToWindowAlert();
	    manageAlert("accept");
		
	    //=================Finding contact for verification========================
		//Find the Contact for verification
		//Click on Find Contacts
	  //Click on Contacts Tab
	  		findWebElementByXpath("(//div[@class='x-panel-header'])[3]/a");
	  		clickOnElement();
	  		//Click on Find Contacts
	  		findWebElementByXpath("//ul[@class='shortcuts']/li[3]/a");
	  		clickOnElement();
	  		browserWait(3000);		
	  	//Click on phone tab
		    Thread.sleep(3000);
			findWebElementByXpath("//span[contains(text(),'Phone')]");
			clickOnElement();
			//Type phone number
			findWebElementByXpath("//input[@name='phoneNumber']");
			sendKeysToWebElement("8765437654");
					
			/*	//Find the contact using id
				findWebElementByXpath("//input[@name='id']");
			    sendKeysToWebElement("10035");
		        //Click on Find Contact
			    findWebElementByXpath("(//td[@class='x-btn-center'])[7]");
			    clickOnElement();*/
               //Verify if no record displayed
					Thread.sleep(5000);
					findWebElementByClassName("x-paging-info");
					System.out.println(element.getText());
					System.out.println(verifyElementText("No records to display"));
					
					//=============Merge Contacts================================
					
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
					
					
					/*Set<String> whndls = driver.getWindowHandles();
					Iterator<String> itr = whndls.iterator();
					//Capture first window handle
					String firstwin = itr.next();
					System.out.println("Parent Window handle::"+firstwin);
					//Capture next window handle
					String nextwin = itr.next();
					System.out.println("Parent Window handle::"+nextwin);
					//Navigate to 2nd window
					driver.switchTo().window(nextwin);
					Thread.sleep(3000);*/
					
					
					//Find first contact using phone number
					findWebElementByXpath("//span[contains(text(),'Phone')]");
					clickOnElement();
					//Type phone number
					findWebElementByXpath("//input[@name='phoneNumber']");
					sendKeysToWebElement("8877665544");
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
					//driver.switchTo().window(firstwin);
					
					Thread.sleep(3000);
					
					//Click on search icon
					findWebElementByXpath("(//img[@alt='Lookup'])[2]");
					clickOnElement();
					Thread.sleep(3000);
					nextWin();
					/*Set<String> whndls1 = driver.getWindowHandles();
					Iterator<String> itr1 = whndls1.iterator();
					//Capture first window handle
					String firstwin1 = itr1.next();
					System.out.println("Parent Window handle::"+firstwin1);
					//Capture next window handle
					String nextwin1 = itr1.next();
					System.out.println("Parent Window handle::"+nextwin1);
					//Navigate to 2nd window
					driver.switchTo().window(nextwin1);*/
					
					Thread.sleep(3000);
					
					//Find second contact using phone number
					findWebElementByXpath("//span[contains(text(),'Phone')]");
					clickOnElement();
					
					//Type phone number
					findWebElementByXpath("//input[@name='phoneNumber']");
					sendKeysToWebElement("2233445566");
					//Click on Find Contact
				    findWebElementByXpath("(//td[@class='x-btn-center'])[1]");
				    clickOnElement();
				    //Click on the first element
					Thread.sleep(3000);
					findWebElementByXpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
					clickOnElement();
					//Navigate back to parent window
					primaryWin();
					//driver.switchTo().window(firstwin);
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
