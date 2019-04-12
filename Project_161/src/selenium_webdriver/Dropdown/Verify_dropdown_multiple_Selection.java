package selenium_webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_dropdown_multiple_Selection 
{

	public static void main(String[] args) 
	{
		//browser initiation 
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();  		//launch browser
		driver.get("https://www.hdfcbank.com/branch-atm-locator");   	//load url to browser window
		driver.manage().window().maximize();  		//maximize browser window
		
		
		//Verify dropdown allow multiple selection
		boolean flag=new Select(driver.findElement(By.id("customState"))).isMultiple();
		System.out.println("Muliple Selection state is => "+flag);
		
		
		//Set multiple property to selected node at runtime.
		((JavascriptExecutor)driver).executeScript
		("document.getElementById('customState').setAttribute('multiple','multiple')");

	
		
		//Verify dropdown allow multiple selection
		boolean flag1=new Select(driver.findElement(By.id("customState"))).isMultiple();
		System.out.println("Muliple Selection state is => "+flag1);
		
		
		
		
	}

}
