package week2;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
        driver.findElementByLinkText("Contact Us").click();
       //To get the window handles
        Set<String> windows = driver.getWindowHandles();
        
        
        System.out.println("Total number of windows is" +windows.size());  
        //int i =1;
        for (String singlewindow:windows)
        {
        	
        	//System.out.println("The Window handle / Session id of each window is \t "+driver.getWindowHandle());
        	//System.out.println("The Page / Window title is \t" +driver.getTitle());
        	driver.switchTo().window(singlewindow);
        	
        }        	
        System.out.println("The Current window title is\t" +driver.getTitle()+"\t and the window handle is \t"+driver.getWindowHandle());
        
	}

}
