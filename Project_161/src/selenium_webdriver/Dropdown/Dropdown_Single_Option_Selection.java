package selenium_webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Single_Option_Selection 
{

	public static void main(String[] args) throws InterruptedException 
	{
		//browser initiation 
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();  		//launch browser
		driver.get("https://www.hdfcbank.com/branch-atm-locator");   	//load url to browser window
		driver.manage().window().maximize();  		//maximize browser window
		
		
		//Select dropdown option using option name.
		new Select(driver.findElement(By.id("customState")))
		.selectByVisibleText("Telangana");
		Thread.sleep(4000);
	
		//Select Dropdown Option using Option value property
		new Select(driver.findElement(By.id("customCity")))
		.selectByValue("hyderabad");
		
		//Type Locality
		driver.findElement(By.id("customLocality")).clear();
		driver.findElement(By.id("customLocality")).sendKeys("Dilsukhnagar");
		
		
		//Select Dropdown using index number
		new Select(driver.findElement(By.id("customRadius")))
		.selectByIndex(3);
		
		
		//Select Search category
		driver.findElement(By.id("amenity_category_order_types50")).click();
		
		//Identify search button using xpath
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		

	}

}
