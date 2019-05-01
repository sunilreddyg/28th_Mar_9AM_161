package validation_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class IsDisplayed_For_Static_Elements 
{

	public static void main(String[] args) 
	{
		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("http://gmail.com/");
		driver.manage().window().maximize();
		
		
		//Identify Email Editbox
		WebElement Email_eb=driver.findElement(By.id("identifierId"));
		
		
		if(Email_eb.isDisplayed() && Email_eb.isEnabled())
		{
			Email_eb.clear();
			Email_eb.sendKeys("qadarshan@gmail.com");
		}
		else
			System.out.println("Element is not displayed nor enabled");
		

		/*
		 * ElementNotvisibleException   ==> When user perform action on hidden element  
		 * InvalidElementstateException ==> When user perform action on disabled element
		 */
		
		
		
		try {
			
			WebElement Next_btn=driver.findElement(By.xpath("//label[contains(.,'Next')]"));
			Next_btn.click();
			
			
		} catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
		} catch (ElementNotVisibleException e) {
			System.out.println(e.getMessage());
		} catch (InvalidElementStateException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
		
		
		System.out.println("Run continued");
	
			
			
		
		
		
		
		
		
		

	}

}
