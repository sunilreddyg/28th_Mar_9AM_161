package framework_datadriven.CSVfiles;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

import org.python.tests.RedundantInterfaceDeclarations;

import com.opencsv.CSVReader;

public class ReadData_From_Csv_Files {

	public static void main(String[] args) throws IOException
	{
		
		//Target file location
		String filepath="C:\\Users\\Administrator\\git\\28th_Mar_9AM_161\\Project_161\\src\\framework_datadriven\\CSVfiles\\";
		//Target file location
		FileReader fr=new FileReader(filepath+"Inputdata.csv");
		System.out.println("file located");
		
		
		
		//Create object for csvreader
		CSVReader reader=new CSVReader(fr);
		
		//Read header
		reader.readNext();
		
		//Target first line at csv file
		String line1[]=reader.readNext();
		System.out.println("=>"+line1[0]+"   =>"+line1[1]);
		
		//Target first line at csv file
		String line2[]=reader.readNext();
		System.out.println("=>"+line2[0]+"   =>"+line2[1]);
		
		
		String Line[];
		while((Line=reader.readNext())!=null)
		{
			
			System.out.println(Line[0]+"     "+Line[1]);
		}
		
		

	}

}
