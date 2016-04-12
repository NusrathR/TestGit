package week1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Login_TapsOpen {
	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		//open the browser
		driver.get("http://demo1.opentaps.org/opentaps/control/main");
		//maximise the browser
		driver.manage().window().maximize();
		//Fetch the Page Title
		System.out.println(driver.getTitle());
		//Enter user name
		driver.findElementById("username").sendKeys("DemoSalesManager");
		//Enter Password
		driver.findElementByName("PASSWORD").sendKeys("crmsfa");
		//Click Login
		driver.findElementByClassName("decorativeSubmit").click();
		//Fetch the Page Title
		System.out.println(driver.getTitle());
		//For wait time in browser
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Click Logout
		driver.findElementByXPath("//*[@id='logout']/input").click();
		//Close the browser
		driver.quit();
	}

}
