package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.python.modules.thread.thread;

public class DropdownOptions {

	public static void main(String[] args) throws Exception 
	{
		/*
		 * Example:--> verify respective cities displayed on correspondent State
		 * 			    selection
		 */
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hdfcbank.com/branch-atm-locator");
		driver.manage().window().maximize();
		
		//Runtime array
		String Cities[]={"null","South Andaman","fdgfg","East Siang","Guwahati","Gaya"};
		
	
		//Identify State dropdown
		WebElement State_Dropdown=driver.findElement(By.id("customState"));
		
		//Identify list of option tags under select tag element
		List<WebElement> Dropdown_options=State_Dropdown.findElements(By.tagName("option"));
		
		//Iterate for list of element times
		for (int i = 0; i < Dropdown_options.size(); i++) 
		{
			//Get Single Dropdown Option From list of Options
			WebElement EachDropdown=Dropdown_options.get(i);
			EachDropdown.click();
			Thread.sleep(1000);
		}

	}

}
