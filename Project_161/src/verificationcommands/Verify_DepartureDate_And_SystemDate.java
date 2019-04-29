package verificationcommands;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_DepartureDate_And_SystemDate 
{

	public static void main(String[] args)
	{
		/*
		 * example:--> Verify system date match with deparute date.
		 */
		
		//Browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		
		
		WebElement DepartueDate=driver.findElement(By.id("ctl00_mainContent_view_date1"));
		String Ddate=DepartueDate.getAttribute("value");
	

		//Create simple date format
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM");
		//Get current system date
		Date d=new Date();
		//Using simple date formatter convert system date
		String Sdate=sdf.format(d);
		
		
		//Verify system date match with Departue date
		if(Ddate.equals(Sdate))
			System.out.println("data match found");
		else
			System.out.println("date mismatch");

	}

}
