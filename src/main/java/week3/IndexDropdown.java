package week3;

 	import org.junit.Test;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.support.ui.Select;

	public class IndexDropdown extends WrapperClass {

		@Test
		public void login() {

			launchApp("firefox", "https://www.irctc.co.in/eticketing/userSignUp.jsf");
			//Enter username
			enterTextById("userRegistrationForm:userName", "DemoSalesManager");
			//Enter Password
			enterTextById("userRegistrationForm:password", "crmsfa");
			//Enter CPassword
			enterTextById("userRegistrationForm:confpasword", "crmsfa");
			//Select value from dropdown
			DropdownbyID("userRegistrationForm:securityQ",2);
			
			
			

		}
		
		
	
		
	}


