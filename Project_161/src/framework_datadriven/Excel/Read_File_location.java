package framework_datadriven.Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Read_File_location 
{

	public static void main(String[] args) 
	{
		
		
		
		try {
			
			String filepath="C:\\Users\\Administrator\\git\\28th_Mar_9AM_161\\Project_161\\Testdata\\InputDat.xlsx";
			FileInputStream fi=new FileInputStream(filepath);
			System.out.println("file located");
			
	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	
		System.out.println("Run resume after catching exception");
		
		
		
		
		
		
	}

}
