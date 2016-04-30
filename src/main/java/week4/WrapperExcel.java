package week4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.NoSuchElementException;

public class WrapperExcel extends WrapperMain{
	
	XSSFWorkbook wkbk = null;
	XSSFSheet sht = null;
	XSSFRow rownum = null;
	XSSFCell cellnum = null;

	public XSSFCell readExcel(String filename,String sheetName, int rowIndex, int colnum) 
	{
				try{
		FileInputStream data = new FileInputStream(new File("./data/"+filename+".xlsx"));
		
		wkbk = new XSSFWorkbook(data);
		
		sht = wkbk.getSheet(sheetName);
		
	    rownum = sht.getRow(rowIndex);
		 
		}catch(Exception e){
			System.out.println("Error in retriving data");
		}
		return rownum.getCell(colnum);
	}
	
	public void ctwb(String filename)
	{
		FileOutputStream foutput;
		try {
			foutput = new FileOutputStream(new File("./data/"+filename+".xlsx"));
		 
		wkbk = new XSSFWorkbook();
		
			wkbk.write(foutput);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
