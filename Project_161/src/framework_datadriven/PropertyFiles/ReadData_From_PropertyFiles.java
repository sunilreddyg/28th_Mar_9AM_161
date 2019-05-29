package framework_datadriven.PropertyFiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadData_From_PropertyFiles 
{

	public static void main(String[] args) throws IOException 
	{
		
		String filepath="C:\\Users\\Administrator\\git\\28th_Mar_9AM_161\\Project_161\\src\\framework_datadriven\\PropertyFiles\\Input.properties";
		FileInputStream fi=new FileInputStream(filepath);
		System.out.println("file located");
		
		//Create object for Properties
		Properties repository=new Properties();
		//Load all objects to repository
		repository.load(fi);
		
		//Get Any object value using object keyname
		String Appurl=repository.getProperty("appurl");
		System.out.println(Appurl);
		
		WebDriver driver=new ChromeDriver();
		driver.get(Appurl);
		driver.manage().window().maximize();
		
		
		
		//Get Object from repository
		String Input_UID=repository.getProperty("username");
	    String Obj_UID_location=repository.getProperty("username_locator");
	    
	    driver.findElement(By.xpath(Obj_UID_location)).clear();
	    driver.findElement(By.xpath(Obj_UID_location)).sendKeys(Input_UID);
		
	    
	    
		

	}

}
