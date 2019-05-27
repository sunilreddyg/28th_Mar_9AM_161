package framework_datadriven.Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Numeric_value_To_Text_Convertion 
{

	public static void main(String[] args) throws IOException 
	{
		
		String filepath="C:\\Users\\Administrator\\git\\28th_Mar_9AM_161\\Project_161\\Testdata\\InputData.xlsx";
		FileInputStream fi=new FileInputStream(filepath);
		System.out.println("file located");
		
		//Get Workbook Usng above location
		XSSFWorkbook book=new XSSFWorkbook(fi);
		System.out.println("Workbook Accessed");
		
		//Target sheet using above workbook
		XSSFSheet sht=book.getSheet("Sheet1");
		
		Double Numeric_mobile=sht.getRow(1).getCell(3).getNumericCellValue();
		String MobileNum_Text=NumberToTextConverter.toText(Numeric_mobile);
		System.out.println("Mobile number in text format is => "+MobileNum_Text);
		
		/*
		 * commands to read data from cell.
		 * 
		 * 	getStringCellvalue
		 *  getNumericCellValue
		 *  getBooleanCellvalue
		 *  getDateCellValue
		 */
		

	}

}
