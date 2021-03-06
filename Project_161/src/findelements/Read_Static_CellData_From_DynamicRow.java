package findelements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_Static_CellData_From_DynamicRow {

	public static void main(String[] args)
	{
		//Browser initiation
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://content.icicidirect.com/IdirectContent/Markets/MarketOverview.aspx");
		driver.manage().window().maximize();
			
		//click markets link
		WebElement Markets_Tab=driver.findElement
				(By.xpath("//a[@href='https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx'][contains(.,'markets')]"));
		Markets_Tab.click();
		
		
		//Identify webtable
		WebElement table=driver.findElement(By.xpath("//div[@id='pnl_Bse']/table"));
		
		//Find list of rows avilable under table
		List<WebElement> rows=table.findElements(By.tagName("tr"));
				
		//Iterate for number of rows
		for (int i = 1; i < rows.size(); i++) 
		{
			
			//target Each dynamic row
			WebElement DynamicRow=rows.get(i);
			
			//Find list of cells under selected row
			List<WebElement> cells=DynamicRow.findElements(By.tagName("td"));
			
			//Target First cell and 4th cell
			String CompanyName=cells.get(0).getText();
			String HighPrice=cells.get(3).getText();
			
			System.out.println(CompanyName+"   "+HighPrice);
			
		}
		
		
		
		
		

	}

}
