package week2hw;

	import java.util.List;

import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class NamesofLinks 
 {

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
			
			for(WebElement link:links)
		    { 
			if((link.getText().contains("NUSRATH"))||(link.getText().contains("nusrath")) && (link.getLocation().getX()>100) && (link.getText().length()>20))
		    
		    		System.out.println("The Name of the Search Link is "+link.getText());
		    	  	 			
		    		    }
			
			//search.quit();
		}

	}

