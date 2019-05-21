package findelements;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownOptions 
{

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
		String Expected_Cities[]={"null","South Andaman","Guntur","East Siang","Guwahati","Gaya"};
		
	
		//Identify State dropdown
		WebElement State_Dropdown=driver.findElement(By.id("customState"));
		
		//Identify list of option tags under select tag element
		List<WebElement> Dropdown_options=State_Dropdown.findElements(By.tagName("option"));
		
		//Iterate for list of element times
		for (int i = 0; i < 6; i++) 
		{
			//Get Single Dropdown Option From list of Options
			WebElement EachDropdown=Dropdown_options.get(i);
			//Get Option Name
			String StateName=EachDropdown.getText();
			
			EachDropdown.click();
			Thread.sleep(2000);
			
			//identify City dropdown element
			WebElement City_Dropdown=driver.findElement(By.id("customCity"));
			//Capture all City Dropdown names
			String Runtime_CityNames=City_Dropdown.getText();
			
			//Verify Expected city name displayed at runtime cities
			if(Runtime_CityNames.contains(Expected_Cities[i]))
			{
				System.out.println("for  " +StateName +" ==>  "+Expected_Cities[i]+" ==> correct city displayed");
			}
			else
			{
				System.out.println("for  " +StateName +" ==> "+Expected_Cities[i]+" ==> wrong city displayed");
			}
		}

	}
	
	
	
	

}
