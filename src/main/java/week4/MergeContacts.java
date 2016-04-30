package week4;

import java.util.Iterator;
import java.util.Set;

import org.junit.Test;

public class MergeContacts extends WrapperMain  {
	@Test
	public void MergeContatc() throws Exception
	{
		  launchApp("chrome","http://demo1.opentaps.org/opentaps/control/main");
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
			/*Set<String> whndls = driver.getWindowHandles();
			Iterator<String> itr = whndls.iterator();
			//Capture first window handle
			String firstwin = itr.next();
			System.out.println("Parent Window handle::"+firstwin);
			//Capture next window handle
			String nextwin = itr.next();
			System.out.println("Parent Window handle::"+nextwin);
			//Navigate to 2nd window
			driver.switchTo().window(nextwin);*/
			Thread.sleep(3000);
			//Find first contact using phone number
			findWebElementByXpath("//span[contains(text(),'Phone')]");
			clickOnElement();
			//Type phone number
			findWebElementByXpath("//input[@name='phoneNumber']");
			sendKeysToWebElement("3892801567");
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
			nextWin();
			Thread.sleep(3000);
			
			//Find second contact using phone number
			findWebElementByXpath("//span[contains(text(),'Phone')]");
			clickOnElement();
			
			//Type phone number
			findWebElementByXpath("//input[@name='phoneNumber']");
			sendKeysToWebElement("8765390215");
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
