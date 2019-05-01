package switch_commands;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling_Using_Try_Catch 
{

	public static void main(String[] args) throws Exception 
	{
		
		//browser initiation 
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();  		//launch browser
		driver.get("https://www.firstnaukri.com/"); //load url to browser window
		driver.manage().window().maximize();  		//maximize browser window
		
		
		//Identify search button
		WebElement Search_btn=driver.findElement(By.xpath("//input[@value='Search']"));
		Search_btn.click();
		Thread.sleep(5000);   //Timeout command
		
		
		try {
			
			//Switch to alert
			Alert alert=driver.switchTo().alert();
			
			//Capture text on alert window
			String alert_msg=alert.getText();
			System.out.println(alert_msg);
			
			//Close alert window
			alert.accept();
			
			
		} catch (NoAlertPresentException e) {
			e.printStackTrace();
		} catch (UnhandledAlertException e) {
			e.printStackTrace();
		
		
		System.out.println("Script continued");
		
		
		



	}

}
