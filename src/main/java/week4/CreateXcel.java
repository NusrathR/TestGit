package week4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateXcel {

	public static void main(String[] args) throws IOException {
		
		//Declaring Two dimensional array with all the values
		String a[][]={{"Serial Number", "Test Case Name", "Status"},{"1", "Create Lead",""},{"2", "Edit Lead",""},{"3", "Merge Lead",""},{"4","Delete Lead",""}}; //For Header
        //Creating Workbook
		XSSFWorkbook workbook = new XSSFWorkbook();
		//Creating Sheet
		XSSFSheet sheet = workbook.createSheet("Output");
	    //Creating 5 rows and 3 columns and printing the values in the cells
		try{
		for(int i=0;i<5;i++)
		{
			XSSFRow row = sheet.createRow(i);
			XSSFCell cell=null;
			for(int j=0;j<3;j++)
			{
				cell = row.createCell(j);
				cell.setCellValue(a[i][j]);
								
			}
			//For last column, odd numbers should fail and even numbers should pass
	    	if(i!=0){	 //The if condition is to skip first iteration, as it is the Title   
			if(Integer.parseInt(a[i][0])%2==0)
			cell.setCellValue("Pass");
			else
			cell.setCellValue("Fail");
			}
	    	}
				   		
	    //For Creating Excel file
	    
			FileOutputStream foutput = new FileOutputStream(new File("./data/Test.xlsx"));
			workbook.write(foutput);
			workbook.close();
			
		} catch (FileNotFoundException e){
			e.printStackTrace();}
		
	    
	}

}
