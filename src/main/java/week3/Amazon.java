package week3;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;


public class Amazon {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//Window Maximize
		driver.manage().window().maximize();
		//Get the URL
		driver.get("http://www.amazon.in/");
		//Enter the search text and press enter
		driver.findElementById("twotabsearchtextbox").sendKeys("bags");
		driver.findElement(By.xpath("//input[@class='nav-input']")).click();
		//driver.findElementById("twotabsearchtextbox").sendKeys("bags",Keys.RETURN);
        //Print the name of the third search link		
		System.out.println("The name of the 3rd search link is "+driver.findElementByXPath("//ul[@id='s-results-list-atf']/li[3]/div/div/div/div[2]/div[2]/a").getText());
		
	//Reading the data from excel
		FileInputStream data = new FileInputStream(new File("./data/Input.xlsx"));
		XSSFWorkbook workbook = new XSSFWorkbook(data);
	
	//Move to sheet level
	XSSFSheet sheet = workbook.getSheet("one");
	System.out.println("Total rows : " +sheet.getLastRowNum());
	
	for (int i = 1; i <=sheet.getLastRowNum() ; i++) {
		// Move to the currentRow
		XSSFRow currentRow = sheet.getRow(i);
		// Move to the particular cell
		System.out.println("name : " + currentRow.getCell(0).getStringCellValue());
		System.out.println("Index : " + currentRow.getCell(1).getStringCellValue());
			
	}
	

		
	}

}
