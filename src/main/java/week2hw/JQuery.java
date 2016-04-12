package week2hw;

import org.openqa.selenium.chrome.ChromeDriver;

public class JQuery {
	public static void main(String[] args) {
		//Set System Property
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//Maximise the window and get the URL
		driver.manage().window().maximize();
		driver.get("http://jqueryui.com/");
		driver.findElementByLinkText("Draggable").click();
		driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
		System.out.println(driver.findElementById("draggable").getText());
		driver.switchTo().defaultContent();
		driver.findElementByLinkText("Droppable").click();
		
	}

}
