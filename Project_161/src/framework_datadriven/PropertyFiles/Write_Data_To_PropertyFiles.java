package framework_datadriven.PropertyFiles;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Write_Data_To_PropertyFiles
{

	public static void main(String[] args) throws IOException, IOException 
	{
		
		//Create object for Property files
		Properties repository=new Properties();
		
		repository.setProperty("Result1", "Tc001 Pass");
		repository.setProperty("Result2", "Tc002 Pass");
		repository.setProperty("Result3", "Tc003 Pass");
		repository.setProperty("Result4", "Tc004 Pass");
		
		String filepath="C:\\Users\\Administrator\\git\\28th_Mar_9AM_161\\Project_161\\src\\framework_datadriven\\PropertyFiles\\";
		repository.store(new FileOutputStream(filepath+"Ouput.properties"), "Test output for Tc001");
		

	}

}
