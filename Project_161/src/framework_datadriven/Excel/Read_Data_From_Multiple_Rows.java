package framework_datadriven.Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data_From_Multiple_Rows 
{

	public static void main(String[] args) throws IOException 
	{
		String filepath="C:\\Users\\Administrator\\git\\28th_Mar_9AM_161\\Project_161\\Testdata\\InputData.xlsx";
		FileInputStream fi=new FileInputStream(filepath);
		System.out.println("file located");
		
		//Get Workbook Usng above location
		XSSFWorkbook wbook=new XSSFWorkbook(fi);
		System.out.println("Workbook Accessed");
		
		//Target sheet using above workbook
		XSSFSheet sht=wbook.getSheet("Sheet3");
		
		
		//Get Number of rows data available in sheet
		int LRow_num=sht.getLastRowNum();
		
		
		//Iterate for number of rows with in sheet
		for (int i = 5; i <= LRow_num; i++) 
		{
			
			String username=sht.getRow(i).getCell(0).getStringCellValue();
			String password=sht.getRow(i).getCell(1).getStringCellValue();
			System.out.println(username+"   "+password);
			
						
		}
		
		
		
		//Iterate for number of dynamic cells in selected row
		int LCell_num=sht.getRow(1).getLastCellNum();
		for (int j = 0; j < LCell_num; j++)
		{
			String InputData=sht.getRow(1).getCell(j).getStringCellValue();
			System.out.println("==> "+InputData);
		}
		
		

	}

}
