package method_return_types;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Webtable_Using_keywords 
{
	
	public static void main(String args[])
	{
		
		//Create object for repository
		Repository obj=new Repository();
		obj.LaunchBrowser("chrome");
		String url="http://content.icicidirect.com/IdirectContent/Markets/MarketOverview.aspx";
		obj.load_webpage(url);
		obj.set_timeout(30);
		
		//click market links
		obj.Click_element(By.xpath("(//a[contains(.,'markets')])[1]"));
		
		
		WebElement CellAddress=obj.Get_Static_Webtable_Cell("//table[@id='Table4']", 1, 2);
		String celldata=CellAddress.getText();
		System.out.println(celldata);
		
		
		
		//Get Dynamic Webtable
		WebElement DynamicCell=obj.Get_Dynaic_Webtable_Cell("//div[@id='pnl_Bse']/table","POWGRI", 7);
		DynamicCell.findElement(By.tagName("a")).click();
		
		
	}

}
