package notepad_package;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Notepad_Read_Class {

	public static void main(String[] args)
	{
		try {
			
			//how to Create Connection from   notepad to selenium
			File fi=new File("Testdata\\Inputdata12.txt");
			//Create Connection for FileReader
			FileReader fr=new FileReader(fi);
			//Craete Connection for Bufferreader
			BufferedReader br=new BufferedReader(fr);
//			How to read the data from notepad in Runtime
			String app_url=br.readLine();
			System.out.println(app_url);
			
			//Application
			WebDriver driver=new ChromeDriver();
			driver.get(app_url);
			driver.manage().window().maximize();
//			
			
			String x;
			//Loops
			while ((x=br.readLine())!=null)
			{
				System.out.println(x);
				
			}
			
			br.close();
			
			
			
			
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
