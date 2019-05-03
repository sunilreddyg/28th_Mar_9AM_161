package switch_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Frame_using_navigation_Commands
{

	public static void main(String[] args) throws Exception 
	{
		
		//browser initiation 
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();  		//launch browser
		driver.get("https://www.cleartrip.com/account/trips"); //load url to browser window
		driver.manage().window().maximize();  		//maximize browser window
		
		
		//Navigate to frame using Frame url
		driver.navigate().to("https://www.cleartrip.com/signinstatic/tripidlogin.shtml?popup=no&guest=true");
		Thread.sleep(5000);
		
		
		WebElement Email=driver.findElement(By.xpath("//input[@id='email']"));
		Email.clear();
		Email.sendKeys("qadarshan@gmail.com");
		
		
		//Get controls back to page using navigation command
		driver.navigate().back();
		
		
		

	}

}
