package week2hw;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class MultiWindow {
	public static void main(String[] args) throws InterruptedException
	{
		//Set Chrome Property
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");		
	ChromeDriver driver = new ChromeDriver();
	//Window Maximise
	driver.manage().window().maximize();
	//Get URL
	driver.get("http://popuptest.com/");
	//Primary Page Window handle
	String primarywindow = driver.getWindowHandle();
	System.out.println("The primary window handle is :: "+primarywindow);
	//Primary Page Title
	String primarypagetitle = driver.getTitle();
	System.out.println("The primary window title is :: "+primarypagetitle);
	//click on Multi PopUp Test #2 Link
		driver.findElementByLinkText("Multi-PopUp Test #2").click();
		//Wait for Page Load
		Thread.sleep(3000);
    //Closing Windows
	Set<String> allwindows = driver.getWindowHandles();
	System.out.println("Total Number of Windows opened ::"+allwindows.size());
		
	for (String eachwindow :allwindows)
	{
	driver.switchTo().window(eachwindow);
	
	if(!eachwindow.equalsIgnoreCase(primarywindow))
	driver.close();
	
	}

	}}
	


