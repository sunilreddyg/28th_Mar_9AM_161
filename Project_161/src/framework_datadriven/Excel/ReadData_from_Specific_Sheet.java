package framework_datadriven.Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData_from_Specific_Sheet 
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
		
		//get row using above sheet
		XSSFRow row=sht.getRow(1);
		
		//Get Cell using row referal
		XSSFCell cell=row.getCell(0);
		
		//Get Cell Text
		String URL=cell.getStringCellValue();
		System.out.println("1st row zero cell value is =>  "+URL);
		
		//Get Cell text
		String CustomerID=row.getCell(1).getStringCellValue();
		System.out.println("1st row and 1st cell value is =>"+CustomerID);
		
		
		//Get Numeric Cell Data [Numeric cell data return in double format]
		Double Num_mobile=row.getCell(3).getNumericCellValue();
		
		//Converting double format into Integer format..
		int value_int=Num_mobile.intValue();
		System.out.println("Value in integer fromat is => "+value_int);
		
		//Converting double format into Long.
		long value_long=Num_mobile.longValue();
		System.out.println("Value in integer fromat is => "+value_long);
		
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
