package capturescreen;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screen_Capture 
{

	public static void main(String[] args) throws IOException
	{
		
		
		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/flights");
		driver.manage().window().maximize();
		
		
		
		/*
		 * Note:--> After capture screen and converted into file format, We need 
		 * 			to dump sceenshot into local drive. Where webdriver don't have
		 * 			permission to access local utilities.So that we need to add
		 * 			local utilites supported jar files to Current WebDriver project.
		 * 
		 * 
		 * 			Downlaod jar files and configure to current project:-->
		 * 	
		 * 				URL:--> https://commons.apache.org/proper/commons-io/download_io.cgi
		 * 				Under binaries download zip format file
		 * 				After unzip file add all executable jar files to current project.
		 * 		
		 */
		
	    //take screen shot and convert into file format
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Dump file into local utilities..
		FileUtils.copyFile(src, new File("screens\\image.png"));
		  
		
		
		
		
		
		

	}

}
