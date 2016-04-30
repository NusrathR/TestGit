package week4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ErailData 
{
public static void main(String[] args) throws Exception {
			//Set system property for Chrome driver
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			//Creating object
			ChromeDriver driver = new ChromeDriver();
			//Maximise the window size
			driver.manage().window().maximize();
			//Get page URL
			driver.get("http://erail.in");
			//Sending input for to and from stations
			driver.findElement(By.id("txtStationFrom")).clear();
			driver.findElement(By.id("txtStationFrom")).sendKeys("MAS",Keys.TAB);
			driver.findElement(By.id("txtStationTo")).clear();
			driver.findElement(By.id("txtStationTo")).sendKeys("BNCE", Keys.TAB);
			//Creating Workbook
			XSSFWorkbook workbook = new XSSFWorkbook();
			//Creating Sheet
			XSSFSheet sheet = workbook.createSheet("Output");
		    
			Thread.sleep(5000);
			try{
			
				//The Header row size
				
			List<WebElement> tbhead = driver.findElements(By.xpath("//div[@id='divTrainsListHeader']/table/tbody/tr/td"));
			int tbheadcells = tbhead.size();
			System.out.println("Total number of cells in header are::"+tbheadcells);
			
			//Operation of Main table
			//The main table rows size
			
			List<WebElement> trows = driver.findElements(By.xpath("//div[@id='divTrainsList']/table[1]/tbody/tr"));
			int tbinnerrows = trows.size();
			System.out.println("Total number of rows in main table are::"+tbinnerrows);
			
			//As the number of cells in each row will be same, finding the number of cells in first row
			
			List<WebElement> columns = driver.findElements(By.xpath("//div[@id='divTrainsList']/table[1]/tbody/tr[1]/td"));
			int tbinnercells = columns.size();
			System.out.println("Number of cells in first row is::" +tbinnercells);
			//Row Creation in Excel for Table Header
			XSSFRow row0 = sheet.createRow(0);
			//Cell Creation for table header and printing the values in excel
			for(int i=1;i<=tbheadcells;i++)
		    {
			//WebElement column = tbhead.get(i);
			String column = driver.findElement(By.xpath("//div[@id='divTrainsListHeader']/table/tbody/tr/td["+i+"]")).getText();
			XSSFCell cell=row0.createCell(i);
			cell.setCellValue(column);
			   // System.out.println(column.getText());
		    }
			
			//Row and Cell creation for main table and set the cell values
			
			for(int n=1;n<=tbinnerrows;n++)
			{
				XSSFRow singlerow = sheet.createRow(n); //Create Row
				for(int t =1; t<=tbinnercells;t++)
				{
			    XSSFCell singlecell = singlerow.createCell(t);
				String incolumns = driver.findElement(By.xpath("//div[@id='divTrainsList']/table[1]/tbody/tr["+n+"]/td["+t+"]")).getText();
				singlecell.setCellValue(incolumns);
					//System.out.println(incolumns);
			    
			}
			
			}
			
			//Create a File at the location given and write the cell content
			FileOutputStream foutput = new FileOutputStream(new File("./data/ErailNewFile.xlsx"));
			workbook.write(foutput); 
			workbook.close();
			
			} catch (FileNotFoundException e){
			e.printStackTrace();}
			
}
	  }

 	



