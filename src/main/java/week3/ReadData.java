package week3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream(new File("./data/Login.xlsx"));
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		// Move to the sheet level
		XSSFSheet sheet = workbook.getSheet("login");

		System.out.println("Total rows : " +sheet.getLastRowNum());
		
		for (int i = 1; i <=sheet.getLastRowNum() ; i++) {
			// Move to the currentRow
			XSSFRow currentRow = sheet.getRow(i);
			// Move to the particular cell
			System.out.println("username : " + currentRow.getCell(0).getStringCellValue());
			System.out.println("password : " + currentRow.getCell(1).getStringCellValue());
			System.out.println("welcomename : " + currentRow.getCell(2).getStringCellValue());
				
		}
 	}

}
