package mouse_and_keyboard_interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover
{

	public static void main(String[] args) throws Exception 
	{
		
		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	
		/*
		 * Enable Mouse and keyboard interaction at automation browser.
		 */
		Actions action=new Actions(driver);
		
		//Identify Webelment before hover on location
		WebElement Main_Category=driver.findElement(By.xpath("//span[@class='nav-line-1'][contains(.,'Shop by')]"));
		//perfrom hover on element
		action.moveToElement(Main_Category).perform();
		Thread.sleep(5000);
		
		//Identify sub-category under main category.
		WebElement Sub_category=driver.findElement(By.xpath("//span[text()='Mobiles, Computers']"));
		//Perform mouse hover action on sub-category
		action.moveToElement(Sub_category).perform();
		Thread.sleep(4000);  //Timeout to load categories under element
		
		//Identify Element under sub-category
		WebElement Laptops_link=driver.findElement(By.xpath("//span[contains(.,'Laptops')]"));
		action.click(Laptops_link).perform();
		
	}

}
