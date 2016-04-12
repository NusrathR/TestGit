package week1;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Login_Irctc {
	public static void main(String[] args) throws InterruptedException
	{
		//System.setProperty("webdriver.chrome.driver", "C:/Users/Nusrath/Desktop/TestLeaf [Selenium Library]/Softwares/drivers/chromedriver.exe");
		//Creating object
		//ChromeDriver driver = new ChromeDriver();
		
		FirefoxDriver driver = new FirefoxDriver();
		//Open the IRCTC Page
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		//Maximise the browser
		driver.manage().window().maximize();
		//Get the user id 
		driver.findElementById("userRegistrationForm:userName").sendKeys("rafathnu");
		//Enter password
		driver.findElementById("userRegistrationForm:password").sendKeys("Qwerty123");
		//Enter password again for confirmation
		driver.findElementById("userRegistrationForm:confpasword").sendKeys("Qwerty123");
		//Capture Security Question using dropdown
		Select se = new Select(driver.findElementById("userRegistrationForm:securityQ"));
		se.selectByIndex(1);
		//Capture Security answer
		driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("St.Joseph");
		driver.findElementById("userRegistrationForm:prelan").sendKeys("English");
		//Capture Personal Details
		driver.findElementById("userRegistrationForm:firstName").sendKeys("NameF");
		driver.findElementById("userRegistrationForm:lastName").sendKeys("NameL");
		driver.findElementById("userRegistrationForm:gender:1").click();
		driver.findElementById("userRegistrationForm:maritalStatus:1").click();
		driver.findElementById("userRegistrationForm:dobDay").sendKeys("20");
		driver.findElementById("userRegistrationForm:dobMonth").sendKeys("APR");
		driver.findElementById("userRegistrationForm:dateOfBirth").sendKeys("1989");
		driver.findElementById("userRegistrationForm:occupation").sendKeys("Private");
		driver.findElementById("userRegistrationForm:email").sendKeys("xyz@gmail.com");
		driver.findElementById("userRegistrationForm:mobile").sendKeys("9677011945");
		driver.findElementById("userRegistrationForm:nationalityId").sendKeys("India");
		//Capture Residential address
		driver.findElementById("userRegistrationForm:address").sendKeys("2/9A");
		driver.findElementById("userRegistrationForm:countries").sendKeys("India");
		driver.findElementById("userRegistrationForm:pincode").sendKeys("604001");
		//driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
		//Wait for city to populate in dropdown
		driver.findElementByTagName("body").click();
		Thread.sleep(10000);
		//Selecting the city from dropdown
		Select city = new Select(driver.findElementById("userRegistrationForm:cityName"));
		city.selectByIndex(1);
		//Wait for post office to populate in dropdown
		driver.findElementByTagName("body").click();
		Thread.sleep(10000);
		//Selecting Post Office
		Select post = new Select(driver.findElementById("userRegistrationForm:postofficeName"));
		post.selectByIndex(15);
		//Add phone number
		driver.findElementById("userRegistrationForm:landline").sendKeys("012345678");
        driver.quit();

	}
	}
