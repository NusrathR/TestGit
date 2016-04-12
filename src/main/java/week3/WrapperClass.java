package week3;

	import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

	public class WrapperClass {
		//Defining the global object
		RemoteWebDriver driver;

		//Method for Browser and getting the URL
		public void launchApp(String browser, String url) {

			try {
				if (browser.equalsIgnoreCase("firefox")) {
					driver = new FirefoxDriver();
				} else if (browser.equalsIgnoreCase("chrome")) {
					System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
					driver = new ChromeDriver();
				}

				// "http://demo1.opentaps.org/opentaps/control/main"
				driver.get(url);
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			} catch (WebDriverException e) {
				System.out.println("Application could not be launched !!");
			}
		}

		//Method for entering username and password
		public void enterTextById(String id, String value) {
			try {
				driver.findElement(By.id(id)).clear();
				driver.findElement(By.id(id)).sendKeys(value);
			} catch (NoSuchElementException e) {
				System.out.println("The element with id : " + id + " could not be found !!");
			}
		}

		//Method for Login & Logout using classname
		public void clickByClassName(String className) {
			try {

				driver.findElement(By.className(className)).click();
			} catch (NoSuchElementException e) {
				System.out.println("The element with className : " + className + " could not be found !!");
			}
		}
		
		//Method for Login & Logout using id 
		public void clickById(String id) {
			try {

				driver.findElement(By.id(id)).click();
			} catch (NoSuchElementException e) {
				System.out.println("The element with id : " + id + " could not be found !!");
			}
		}
	
		//Method to check the page title
		
		public void verifyBrowserTitle(String expectedTitle){
			
			//boolean returnvalue = false;
			try {
				if (driver.getTitle().equals(expectedTitle)) {
					//returnvalue = true;
					System.out.println("The Page Title '" + expectedTitle + "' is displayed correctly");
				} else
					System.out.println("The title is displayed incorrectly. Expected display title is '" + expectedTitle
							+ "'" + ", but the actual title displayed is '" + driver.getTitle() + "'");
			} catch (Exception e) {
				System.out.println("Browser to be verified is not displayed");
			}
		}
		
		//Method to get the dropdown values by index using id
		
		public void DropdownbyID(String id, int index)
		{
			try {
				Select se = new Select(driver.findElement(By.id(id)));
				se.selectByIndex(index);
			} catch (Exception e) {
				
				System.out.println("The Dropdown item with the id '"+id+"' and index "+index+" is not displayed");
				}
		}
		
		//Method to get the dropdown values by index using classname
		
				public void Dropdownbycname(String cname, int index)
				{
					try {
						Select se = new Select(driver.findElement(By.className(cname)));
						se.selectByIndex(index);
					} catch (Exception e) {
									
							System.out.println("The Dropdown item with the Classname '"+cname+"' and index "+index+" is not displayed");
							}
				
					}
				}
		
		



