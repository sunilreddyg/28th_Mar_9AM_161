package framework_datadriven.Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_WebDriver_Testcase 
{
	public static void main(String[] args) throws IOException 
	{
	
		String filepath="C:\\Users\\Administrator\\git\\28th_Mar_9AM_161\\Project_161\\Testdata\\InputData.xlsx";
		FileInputStream fi=new FileInputStream(filepath);
		System.out.println("file located");
		
		//Get Workbook Usng above location
		XSSFWorkbook book=new XSSFWorkbook(fi);
		System.out.println("Workbook Accessed");
		
		//Target sheet using above workbook
		XSSFSheet sht=book.getSheet("Sheet2");
		
		//Target row
		XSSFRow row=sht.getRow(1);
		
		//Get 1st cell data
		String URL=row.getCell(1).getStringCellValue();
		
		//Browser inititation
		WebDriver driver=new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		
		
		//Get singin button xpath 
		String Signin_nav_btn_locator=row.getCell(2).getStringCellValue();
		driver.findElement(By.xpath(Signin_nav_btn_locator)).click();
		
		
		//Get Email Xpath And input values
		String Email_location=row.getCell(3).getStringCellValue();
		String Email_input=row.getCell(4).getStringCellValue();
		driver.findElement(By.xpath(Email_location)).clear();
		driver.findElement(By.xpath(Email_location)).sendKeys(Email_input);
		
		
		//Get Next button location
		String Next_btn_locator=row.getCell(5).getStringCellValue();
		driver.findElement(By.xpath(Next_btn_locator)).click();
	}

}
