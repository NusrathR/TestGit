package miniproject1;

import java.io.IOException;

	import org.junit.Test;

	public class DeleteLead extends Wrapper{
		@Test
		public void Delete() throws IOException, InterruptedException
		{
			launchApp("firefox","http://demo1.opentaps.org/opentaps/control/main");
			//enter username
			findWebElementByID("username");
			//prepareExcelSheet("OpenTaps", "DataInput");
		//	getRowAt("DataInput", 1);
			//readrow("DataInput", 1);
			
			//sendKeysToWebElement(getCellAt(1, 0).getStringCellValue());
			sendKeysToWebElement(readExcel("OpenTaps","DataInput",1,0).getStringCellValue());
			//enter password
			findWebElementByID("password");
			sendKeysToWebElement(readExcel("OpenTaps","DataInput",1,1).getStringCellValue());
			//Click Login
			findWebElementByClassName("decorativeSubmit");
			clickOnElement();
			//click on crm/sfa button
			findWebElementByID("button");
			clickOnElement();
			//Implicit wait and create leads
			browserWait(40);
			findWebElementByLinkText("Create Lead");
			clickOnElement();
			//enter company name,first name and last name
			findWebElementByID("createLeadForm_companyName");
			sendKeysToWebElement(readExcel("OpenTaps","DataInput",1,2).getStringCellValue());
			//enter first name
			findWebElementByID("createLeadForm_firstName");
			sendKeysToWebElement(readExcel("OpenTaps","DataInput",1,3).getStringCellValue());
			//enter last name
			findWebElementByID("createLeadForm_lastName");
			sendKeysToWebElement(readExcel("OpenTaps","DataInput",1,4).getStringCellValue());
			//enter phone number
			findWebElementByID("createLeadForm_primaryPhoneNumber");
			sendKeysToWebElement(readExcel("OpenTaps","DataInput",1,5).getStringCellValue());
			//enter email id
			findWebElementByID("createLeadForm_primaryEmail");
			sendKeysToWebElement(readExcel("OpenTaps","DataInput",1,6).getStringCellValue());
			//Click Create Lead button
			findWebElementByClassName("smallSubmit");
			clickOnElement();		
			
			//Code for Find Leads
			findWebElementByXpath("//a[text()='Find Leads']");
			clickOnElement();
			//Click on phone tab
		    Thread.sleep(3000);
			findWebElementByXpath("//span[contains(text(),'Phone')]");
			clickOnElement();
			//Type phone number
			findWebElementByXpath("//input[@name='phoneNumber']");
			sendKeysToWebElement(readExcel("OpenTaps","DataInput",1,5).getStringCellValue());
			//click on findleads button
			findWebElementByXpath("//button[text()='Find Leads']");
			clickOnElement();
			//Click on the first element
			Thread.sleep(3000);
			findWebElementByXpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
			clickOnElement();
			//Click on delete button
			Thread.sleep(3000);
			findWebElementByClassName("subMenuButtonDangerous");
			clickOnElement();
			//Confirm if the element is deleted
			//Code for Find Leads
					findWebElementByXpath("//a[text()='Find Leads']");
					clickOnElement();
					//Click on phone tab
				    Thread.sleep(3000);
					findWebElementByXpath("//span[contains(text(),'Phone')]");
					clickOnElement();
					//Type phone number
					findWebElementByXpath("//input[@name='phoneNumber']");
					sendKeysToWebElement(readExcel("OpenTaps","DataInput",1,5).getStringCellValue());
					//click on findleads button
					findWebElementByXpath("//button[text()='Find Leads']");
					clickOnElement();
				//Verify if no record displayed
					Thread.sleep(5000);
					findWebElementByClassName("x-paging-info");
					System.out.println(element.getText());
					System.out.println(verifyElementText("No records to display"));
	}
	}


