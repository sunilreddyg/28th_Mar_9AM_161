package switch_commands;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AlertHandling 
{

	public static void main(String[] args) throws Exception
	{
		/*
		 * Scenario:-->  Verify Error popup display on invalid 
		 * 				search without Course or keyword entry
		 * 
		 * 		Given site url https://www.firstnaukri.com/
		 * 		When user leave search dropdown and keyword entry
		 * 		And click search button
		 * 		Then receive Error message at Alert window
		 * 		
		 */
		
		//browser initiation 
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();  		//launch browser
		driver.get("https://www.firstnaukri.com/"); //load url to browser window
		driver.manage().window().maximize();  		//maximize browser window
		
		
		//Identify search button
		WebElement Search_btn=driver.findElement(By.xpath("//input[@value='Search']"));
		Search_btn.click();
		Thread.sleep(5000);   //Timeout command
		
		
		//Write a decision to accept condition on alert presented.
		if(ExpectedConditions.alertIsPresent().apply(driver)!=null)
		{
			//Switch to alert
			Alert alert=driver.switchTo().alert();
			
			//Capture text on alert window
			String alert_msg=alert.getText();
			System.out.println(alert_msg);
			
			//Close alert window
			alert.accept();
		}
		else
		{
			System.out.println("Alert not presented");
		}
		
		

	}

}
