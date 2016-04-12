package week1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenTaps_LeadCreate {
	public static void main(String[] args) {
		//Creating object
		FirefoxDriver lead = new FirefoxDriver();
		lead.get("http://demo1.opentaps.org/opentaps/control/main");
		//Maximise the browser
		lead.manage().window().maximize();
		//Opentaps Login
		lead.findElementById("username").sendKeys("DemoSalesManager");
		lead.findElementById("password").sendKeys("crmsfa");
	    lead.findElementByClassName("decorativeSubmit").click();
	    //Click CRM/SFA button
	    lead.findElementById("button").click();
	    //Click on create lead
	    lead.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	  lead.findElement(By.linkText("Create Lead")).click();
	    //Completing Create Lead details
	  lead.findElementById("createLeadForm_companyName").sendKeys("ABC Ltd");
	  lead.findElementById("createLeadForm_firstName").sendKeys("FirstName");
	  lead.findElementById("createLeadForm_lastName").sendKeys("Lastname");	
	  lead.findElementByClassName("smallSubmit").click();
	  lead.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
	  lead.quit();
	}

}
