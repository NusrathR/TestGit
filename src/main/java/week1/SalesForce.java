package week1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SalesForce {
	public static void main(String[] args) {
		//Object Creation
		FirefoxDriver force = new FirefoxDriver();
		//Window Maximize
		force.manage().window().maximize();
		//Get the page URL
		force.get("https://developer.salesforce.com/");
		//Wait for Page Load
		force.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		force.findElementByXPath("/html/body/div[3]/header/div/div/div/div[1]/div[1]/div[1]/a").click();
		//Completing Signup Details
		force.findElementById("first_name").sendKeys("Firstname"); //Name
		force.findElementById("last_name").sendKeys("lastname");
        force.findElementById("email").sendKeys("abc@gmail.com"); //Email
        Select role = new Select(force.findElementById("job_role")); //Job Role
        role.selectByIndex(0);
        force.findElementById("company").sendKeys("DEF Ltd"); //Company
        Select country = new Select(force.findElementByName("user[country]"));//Country
        country.selectByIndex(97);
        force.findElementByName("user[postal_code]").sendKeys("603013"); //Pincode
        force.findElementByName("user[username]").sendKeys("example@abc.com");//username
        force.findElementById("eula").click();//Check the agreement
        //Login Page
        force.get("https://login.salesforce.com/");
        force.findElementByXPath("//*[@id='username']").sendKeys("r.nusrath@gmail.com");
        force.findElementByXPath("//*[@id='password']").sendKeys("allah2503");
        force.findElementByXPath("//*[@id='Login']").click();
        force.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        force.quit();
        
	}

}
