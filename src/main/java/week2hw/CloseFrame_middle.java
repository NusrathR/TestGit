package week2hw;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseFrame_middle {
	
	public static void main(String[] args) throws InterruptedException {
		//Set system property for chrome driver
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//Creating object
		ChromeDriver driver = new ChromeDriver();
		//Maximise the window size
		driver.manage().window().maximize();
		//Get page URL
		driver.get("http://layout.jquery-dev.com/demos/iframe_local.html");
	    //find the number of frames
		List<WebElement> frames = driver.findElementsByTagName("iframe");
		System.out.println("Total Number of frames in the current page are "+frames.size());
		//Closing the boxes outside frames		
		driver.findElementByXPath("/html/body/div[7]/div").click();
		driver.findElementByXPath("/html/body/div[5]/div").click();
		driver.findElementByXPath("/html/body/div[8]/div").click();
		driver.findElementByXPath("/html/body/div[6]/div").click();
		//Switching into frame and closing the frames other than middle one
		driver.switchTo().frame("childIframe");
		driver.findElementByXPath("/html/body/div[6]/div").click();
		driver.findElementByXPath("/html/body/div[8]/div").click();
		driver.findElementByXPath("/html/body/div[9]/div").click();
		driver.findElementByXPath("/html/body/div[7]/div").click();
		driver.switchTo().defaultContent(); //Coming out of frame
		
		
	}
	}




