package week1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.ui.Select;

public class Password {
	public static void main(String[] args) {
		//Object Creation
		FirefoxDriver force = new FirefoxDriver();
		//Window Maximize
		force.manage().window().maximize();
		//Get the page URL
		 //Login Page
        force.get("https://login.salesforce.com/");
        //force.findElementByClassName("input r4 wide mb16 mt8 username").sendKeys("r.nusrath@gmail.com");
        force.findElementByXPath("//*[@id='username']").sendKeys("r.nusrath@gmail.com");
        //force.findElementByClassName("input r4 wide mb16 mt8 password").sendKeys("allah2503");
        force.findElementByXPath("//*[@id='password']").sendKeys("allah2503");
        force.findElementByXPath("//*[@id='Login']").click();
        //Phone number
        Select mobile = new Select(force.findElementByXPath("//*[@id='c']"));
        mobile.selectByValue("India (+91)");
        force.findElementByXPath("//*[@id='p']").sendKeys("9677904201");
        force.findElementByXPath("//*[@id='editPage']/input[7]").click();
        
        
      
        
        	}

}
