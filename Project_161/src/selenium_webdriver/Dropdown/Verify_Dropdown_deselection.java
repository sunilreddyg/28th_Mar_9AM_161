package selenium_webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_Dropdown_deselection {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();  		//launch browser
		driver.get("https://www.hdfcbank.com/branch-atm-locator");   	//load url to browser window
		driver.manage().window().maximize();  		//maximize browser window
		
	
		//Runtime syntax to convert single option dropdown to multiple option dropdown
		((JavascriptExecutor)driver).executeScript
		("document.getElementById('customState').setAttribute('multiple','multiple')");


		//Verify dropdown allow multiple selection
		boolean flag1=new Select(driver.findElement(By.id("customState"))).isMultiple();
		System.out.println("Muliple Selection state is => "+flag1);
		
		//Decision accept only dropdown return multiple selection as true
		if(flag1==true)
		{
			Select Multiple_Selection=new Select(driver.findElement(By.id("customState")));
			Multiple_Selection.deselectAll();    //Deselect all option
			Multiple_Selection.selectByIndex(2);
			Multiple_Selection.selectByIndex(5);
			Multiple_Selection.selectByIndex(8);
			
			
				//Verify maximum options 3 selected..
				int Count=Multiple_Selection.getAllSelectedOptions().size();
				if(Count==3)
				{
						//Deselect any single option
						Multiple_Selection.deselectByIndex(5);
						
						//Get Count of Selection after deselection of any single option
						int Dcount=Multiple_Selection.getAllSelectedOptions().size();
						if(Dcount==2)
						{
							System.out.println("As expected allowed user to deselect option");
						}
						else
						{
							System.out.println("Testfail:--> deselection failed");
						}
				}
				else
				{
					System.out.println("Failed to select maximum options");
				}
			
		}
		else
		{
			System.out.println("dropdown is not a multiple selection type");
		}
		

	}

}
