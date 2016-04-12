package week4;


	import java.io.File;
	import java.io.FileNotFoundException;
	import java.io.FileOutputStream;
	import java.io.IOException;

	import org.apache.poi.xssf.usermodel.XSSFCell;
	import org.apache.poi.xssf.usermodel.XSSFRow;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	public class SampleExcel {


		public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub
			
			XSSFWorkbook wbook = new XSSFWorkbook();
			XSSFSheet sheet = wbook.createSheet();
			XSSFRow row= sheet.createRow(0);
			XSSFCell cell = row.createCell(0);
			String[] testcasename ={"Create Lead","Find Lead","Delete Lead","Merge Lead"};
			String rowresult;
			
			cell.setCellValue("Serial No.");
			cell = row.createCell(1);
			cell.setCellValue("Test case name");
			cell = row.createCell(2);		
			cell.setCellValue("Status");
			
			try {
				//FileOutputStream fileout = new FileOutputStream(new File(".\\data\\output.xlsx"));
				
				
				for (int i =1;i < 5;i++)
				{
					row= sheet.createRow(i);
					cell = row.createCell(0);
					cell.setCellValue(i);
					
					cell = row.createCell(1);
					cell.setCellValue(testcasename[i-1]);
					
					cell = row.createCell(2);
					if(i%2!=0)
					rowresult = "PASS";
					else
					rowresult = "FAIL";
					cell.setCellValue(rowresult);				
					
				}
				
				FileOutputStream fileout = new FileOutputStream(new File("./data/output.xlsx"));
				wbook.write(fileout);
				wbook.close();
				//fileout.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
			
			
		}

	}

