package switch_commands;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Next_Window {

	public static void main(String[] args) {
		
		//browser initiation 
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();  		//launch browser
		driver.get("https://facebook.com/");     //load url to browser window
		driver.manage().window().maximize();  		//maximize browser window
		
		
		//Get Mainwindow dynamic ID at runtime
		String MainwindowID=driver.getWindowHandle();
		
		
		//Identify external link 
		WebElement Instagram_link=driver.findElement(By.linkText("Instagram"));
		Instagram_link.click();  //Then link open external window
		
		
		//Get All window Dynamic ID's
		Set<String> AllwindowIDS=driver.getWindowHandles();
		for (String EachwindowID : AllwindowIDS) 
		{
			driver.switchTo().window(EachwindowID);
			if(!EachwindowID.equals(MainwindowID))
			{
				break; //It break iteration and get focus on extenral window
			}
		}
		
		
		System.out.println("Current Focused widnow is => "+driver.getTitle());
		
		
		
		
		
		
		
		
		

	}

}
