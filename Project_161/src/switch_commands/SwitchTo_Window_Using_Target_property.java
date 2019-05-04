package switch_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SwitchTo_Window_Using_Target_property 
{

	public static void main(String[] args) throws Exception 
	{
		
		/*
		 * Switch to external window using external link
		 * target property.
		 */
		
		//browser initiation 
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();  		//launch browser
		driver.get("https://epass.apcfss.in/");     //load url to browser window
		driver.manage().window().maximize();  		//maximize browser window
		
		
		//Get Mainwindow dynamic ID at runtime
		String MainwindowID=driver.getWindowHandle();
		
		
		//Switch to frame using name property
		driver.switchTo().frame("messageFrame");
		
		
		//Click Reports link under messageframe
		WebElement Reports=driver.findElement(By.xpath("//a[@href='Reports.html']"));
		Reports.click();
		
		
		//Switch Controls back to main page
		driver.switchTo().defaultContent();
		
		
		//Switch to frame using frame id property
		driver.switchTo().frame("bodyFrame");
		
		
		/*
		 * External link Source:-->
		 * 		<a href="collegeregistrationreport.do" target="_new">
		 * 		Colleges Registration Status</a>
		 * 
		 * 		Note:--> Don't use when target property display at blank
		 * 					<< target="_blank" >>
		 */
		
		//Identify link under bodyframe
		WebElement College_Reports=driver.findElement(By.linkText("Colleges Registration Status"));
		College_Reports.click(); //The link open external window
		
		
		//Switch to external window using external link "target" property
		driver.switchTo().window("_new");
		Thread.sleep(5000);  //Timeout to load external window
		
		
		//Select dropdown at external window
		new Select(driver.findElement(By.name("ac_year"))).selectByIndex(2);
		Thread.sleep(5000);
		
		//Close external window
		driver.close();
		
		//Get back controls to main window using Runtime window ID
		driver.switchTo().window(MainwindowID);
		
		System.out.println("Current window title is => "+driver.getTitle());
		

	}

}
