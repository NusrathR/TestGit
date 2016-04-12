package week3hw;

import org.junit.Test;

public class CreateLead extends WrapperClass {
	
	@Test
	public void LeadCreation()
	{
		
		launchApp("firefox", "http://demo1.opentaps.org/opentaps/control/main");
		//Enter username
		enterTextById("username", "DemoSalesManager");
		//Enter Password
		enterTextById("password", "crmsfa");
		//Click Login
		clickByClassName("decorativeSubmit");
		//Click CRM/SFA button
		clickById("button");
		//Click on create lead
	    clickByltxt("Create Lead");
	    //Enter the Company name , first name and last name using locator id
	    enterTextById("createLeadForm_companyName", "ABC Ltd");
	    enterTextById("createLeadForm_firstName", "FirstName");
	    enterTextById("createLeadForm_lastName", "Lastname");
	    //click submit button using class name
	    clickByClassName("smallSubmit");
		//Enter user name and password to create contact using xpath
	    enterTextByltxt("//div[@id='quickNewContact']/div/div[2]/div/div/div/div/form/div/div/input", "Forename");
	    enterTextByltxt("//div[@id='quickNewContact']/div/div[2]/div/div/div/div/form/div[2]/div/input", "surname");
	    //Clcik on Create contact by Xpath
	    clickByxpath("//div[@id='quickNewContact']/div/div[2]/div[2]/div/div/div/div/div/table/tbody/tr/td/table/tbody/tr/td[2]/em/button");
	    
	    
			}

}
