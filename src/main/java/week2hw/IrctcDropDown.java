package week2hw;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IrctcDropDown {
	public static void main(String[] args) throws InterruptedException{
		//Set system property
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//Creating Object
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Finding the number of dropdown and printing it
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		List<WebElement> dropdown = driver.findElementsByTagName("select");
		System.out.println("Total number of dropdown in IRCTC page is::"+dropdown.size());
	}

}
