package week2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CrystalCruise {
	public static void main(String[] args) {
		//boolean url;
		System.setProperty("webdriver.chrome.driver", "C:/Users/Nusrath/Documents/Homework/drivers/chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    ChromeDriver driver = new ChromeDriver();
	    driver.get("http://www.crystalcruises.com/calendar.aspx");
	    //driver.findElementsByTagName("a");
	    List<WebElement> quotes = driver.findElementsByTagName("a");
	  //  System.out.println("Total number of links" +quotes.size());
	    for(WebElement quote:quotes)
	    {
	    	if((quote.getText().contains("G")) && (quote.getLocation().getX()>50) && (quote.getSize().getWidth()>20))
	       
	       System.out.println("The Link with character c and x co-ordinate greate than 50 with width greater than 20 ::" +quote.getText());
	    	quote.click();
	    	break;
	       
	    }
	    //driver.quit();
	    
	
	}

}
