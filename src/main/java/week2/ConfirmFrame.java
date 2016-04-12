package week2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmFrame {
	public static void main(String[] args) {
		//Chrmoe Driver set property
		//System.setProperty("webdriver.chrome.driver", "C:/Users/Nusrath/Documents/Homework/drivers/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    		ChromeDriver driver = new ChromeDriver();
	    driver.get("http://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
        //Getting into Frame
	    //driver.switchTo().frame("iframeResult");
	    driver.switchTo().frame("iframe");
        driver.findElementByTagName("button").click();
        //Getting into Alert
        Alert a = driver.switchTo().alert();
        System.out.println("The Alert Text is " +a.getText());
        a.dismiss();
        //Print the cancel text
        System.out.println("The Cancel text is "+driver.findElementById("demo").getText());
        
        //Coming out of Frame
        //driver.switchTo().defaultContent();
        //Print the cancel text
        
        
     
	}

}
