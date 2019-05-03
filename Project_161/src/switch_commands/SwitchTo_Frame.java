package switch_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Frame {

	public static void main(String[] args)
	{
		//browser initiation 
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();  		//launch browser
		driver.get("https://www.cleartrip.com/account/trips"); //load url to browser window
		driver.manage().window().maximize();  		//maximize browser window
		
		
		//Switch to Frame using ID/Name attribute
		driver.switchTo().frame("modal_window");
		
		
		//Under frame identify elemnets
		WebElement Email=driver.findElement(By.xpath("//input[@id='email']"));
		Email.clear();
		Email.sendKeys("qadarshan@gmail.com");
		
		WebElement TripID=driver.findElement(By.xpath("//input[@title='Trip ID']"));
		TripID.clear();
		TripID.sendKeys("13455464");
		
		//Get control back to page
		driver.switchTo().defaultContent();
		
		
		//Identify Element under page
		WebElement Flights=driver.findElement(By.xpath("//span[contains(.,'Flights')]"));
		Flights.click();
		
		

	}

}
