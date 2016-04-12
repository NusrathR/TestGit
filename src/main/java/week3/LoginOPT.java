package week3;

 	import org.junit.Test;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.support.ui.Select;

	public class LoginOPT extends WrapperClass {

		@Test
		public void login() {

			/*
			 * FirefoxDriver driver=new FirefoxDriver();
			 * driver.get("http://demo1.opentaps.org/opentaps/control/main");
			 * driver.manage().window().maximize();
			 */

			launchApp("chrome", "http://demo1.opentaps.org/opentaps/control/main");
			//Enter username
			enterTextById("username", "DemoSalesManager");
			//Enter Password
			enterTextById("password", "crmsfa");
			//Click Login
			clickByClassName("decorativeSubmit");
			//Check Browser Title
			verifyBrowserTitle("Opentaps Open Source ERP + CRM");
			//Click Logout
			clickByClassName("decorativeSubmit");
			

		}
		
		
	
		
	}