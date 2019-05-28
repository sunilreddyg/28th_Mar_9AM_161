package framework_datadriven.Excel;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest_With_Multiple_Rows {

	public static void main(String[] args) throws IOException {
		
		String filepath="C:\\Users\\Administrator\\git\\28th_Mar_9AM_161\\Project_161\\Testdata\\InputData.xlsx";
		FileInputStream fi=new FileInputStream(filepath);
		System.out.println("file located");
		
		//Get Workbook Usng above location
		XSSFWorkbook wbook=new XSSFWorkbook(fi);
		System.out.println("Workbook Accessed");
		
		//Target sheet using above workbook
		XSSFSheet sht=wbook.getSheet("Sheet3");
		
		
		//Get Number of rows data available in sheet
		int LRow_num=sht.getLastRowNum();
		
		//Browser initiation
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		
		//Iterate for number of rows with in sheet
		for (int i = 5; i <= LRow_num; i++) 
		{
			
			//Get Data From Static Row
			String url=sht.getRow(0).getCell(1).getStringCellValue();
			driver.get(url);
			
			
			
			//Get username and password location from Excel
			String UID_Locator=sht.getRow(1).getCell(1).getStringCellValue();
			String PWD_Locator=sht.getRow(2).getCell(1).getStringCellValue();
			String Signin_btn_Locator=sht.getRow(3).getCell(1).getStringCellValue();
			
			//Input Data from dynamic rows
			String username=sht.getRow(i).getCell(0).getStringCellValue();
			String password=sht.getRow(i).getCell(1).getStringCellValue();
			System.out.println(username+"   "+password);
			
			
			//Type Usenrame
			driver.findElement(By.xpath(UID_Locator)).clear();
			driver.findElement(By.xpath(UID_Locator)).sendKeys(username);
			
			//type password
			driver.findElement(By.xpath(PWD_Locator)).clear();
			driver.findElement(By.xpath(PWD_Locator)).sendKeys(password);
			
			//Click Signin button
			driver.findElement(By.xpath(Signin_btn_Locator)).click();
						
		}
		
		
	}

}
