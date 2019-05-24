package notepad_package;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Notepad_Write_class {

	public static void main(String[] args)
	{
		try {
			
			
			//How to Create Connection from notepad to Selenium
			File fo=new File("Logfiles\\Output12.txt");
			//Create Connection for FileWriter
			FileWriter fw=new FileWriter(fo);
			//Create Connection for Bufferwriter
			BufferedWriter bw=new BufferedWriter(fw);
			
			//How to write data into notepad in runtime
			bw.write("http://www.facebook.com");
			bw.newLine();
			
			bw.write("mindq");
			
			bw.close();
			fw.close();
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
