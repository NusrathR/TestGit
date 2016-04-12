package week2;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindName {

	public static void main(String[] args) throws InterruptedException {
		//Set Property for chrome Driver
		System.setProperty("webdriver.chrome.driver", "C:/Users/Nusrath/Documents/Homework/drivers/chromedriver.exe");
		//Create Object
		ChromeDriver search = new ChromeDriver();
		//Maximse the window and open the URL
		search.manage().window().maximize();
		search.get("https://www.google.co.in/");
		search.findElementById("lst-ib").sendKeys("Nusrath",Keys.RETURN);
		Thread.sleep(4000);
		//List<WebElement> links = search.findElementsByPartialLinkText("Nusrath");	
		List<WebElement> links = search.findElementsByTagName("a");
		//System.out.println("Total Number of Links starting with Nusrath\t" +links.size());
		//links.get(1).click();
		
		for(WebElement link:links)
	    { 
	    if((link.getText().contains("NUSRATH"))||(link.getText().contains("nusrath")))
	    {
	    System.out.println("The Top Link in Search is "+link.getText());
	    System.out.println("Total Number of Links starting with Nusrath\t" +links.size());
		link.click();
	    break;
	    }  	 			
	  }
        //search.quit();
	}

}
