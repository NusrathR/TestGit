package week2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Chrome {

	public static void main(String[] args) throws InterruptedException {
		//Set Property to open the URL in chrome browser
		System.setProperty("webdriver.chrome.driver", "C:/Users/Nusrath/Documents/Homework/drivers/chromedriver.exe");
		
		//Create Object
		ChromeDriver object = new ChromeDriver();
		//maximize window
		object.manage().window().maximize();
		//Open URL
		object.get("https://www.google.co.in");
		//Get the Element using TagName
		List<WebElement> links = object.findElementsByTagName("a");
		//Using for each loop
		for (WebElement link : links)
		{
			if((link.getText().contains("c")) && (link.getLocation().getX()>50) && (link.getSize().getWidth()>20))
			{
			  System.out.println("Total number of links\t" +links.size());
			  System.out.println("The first link matching all the condition is "+link.getText());
			  //links.get(4).click();
			  link.click();
			  break;
			}}
			object.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);		
		    
			object.quit(); //Close the browser
		
		

	}

}
