package method_parameters;

import org.openqa.selenium.By;

public class SwitchToWIndow_Using_keywords {

	public static void main(String[] args) throws Exception 
	{
		
		//Create object for Repository
		Repository obj=new Repository();
		obj.LaunchBrowser("chrome");
		obj.load_webpage("https://www.hdfcbank.com/wholesale/default.htm");
		obj.set_timeout(30);
		
		
		obj.Select_dropdown(By.xpath("//select[@name='where']"), "ATM");
		obj.switchto_window("ATMs in India.");
		Thread.sleep(3000);
		obj.Capturescreen("ATM window");
		obj.Enter_text("//input[@name='search']", "new window active as expected");
		
		obj.switchto_window("Wholesale Banking");
		Thread.sleep(3000);
		obj.Capturescreen("WholesaleBanking_From_ATM_window");
		
		

	}

}
