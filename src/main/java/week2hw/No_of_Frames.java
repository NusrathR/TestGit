package week2hw;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class No_of_Frames {

public static void main(String[] args) throws InterruptedException {
	//Set system property for chrome driver
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	//Creating object
	ChromeDriver driver = new ChromeDriver();
	int eframe = 0;
	int intframe = 0;
	//Maximise the window size
	driver.manage().window().maximize();
	//Get page URL
	driver.get("http://layout.jquery-dev.com/demos/iframes_many.html");
    //find the number of frames
	List<WebElement> frames = driver.findElementsByTagName("iframe");
	eframe = frames.size();
	System.out.println("Total Number of frames in the current page are "+eframe);
	for (WebElement single :frames)
		{
		driver.switchTo().frame(single);
		Thread.sleep(3000);
		intframe = intframe + driver.findElementsByTagName("iframe").size();
		System.out.println("Number of internal frames::"+intframe);
		driver.switchTo().defaultContent();
						}
	int total = eframe+intframe;
	System.out.println("Total Number of frames in page ::"+total);
		
	}
}

