package framework_datadriven.Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Workbook
{

	public static void main(String[] args)
	{
		
		try {
			
			String filepath="C:\\Users\\Administrator\\git\\28th_Mar_9AM_161\\Project_161\\Testdata\\InputData.xlsx";
			FileInputStream fi=new FileInputStream(filepath);
			System.out.println("file located");
			
			//Get Workbook Usng above location
			XSSFWorkbook book=new XSSFWorkbook(fi);
			System.out.println("Workbook Accessed");
	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
