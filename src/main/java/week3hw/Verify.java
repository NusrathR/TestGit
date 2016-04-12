package week3hw;

	import org.junit.Test;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.support.ui.Select;

	public class Verify extends WrapperClass {

		@Test
		public void login()  {
  
		      
			launchApp("chrome", "http://www.crystalcruises.com/");
			//Switch to parent window
			PWindowltxt("GUEST CHECK-IN");
clickByxpath("//*[@id='homeModuleTR']/a/img");

		}
		
		
	
		
	}


