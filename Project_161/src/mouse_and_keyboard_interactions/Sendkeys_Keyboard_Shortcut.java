package mouse_and_keyboard_interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sendkeys_Keyboard_Shortcut {

	public static void main(String[] args) throws Exception
	{
		
		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("https://cleartrip.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
	
		//Enable keyboard control on browser window
		Actions action=new Actions(driver);
		
		WebElement Origin_Editbox=driver.findElement(By.xpath("//input[@name='origin']"));
		Origin_Editbox.clear();
		Origin_Editbox.sendKeys("HYD");
		Thread.sleep(5000);
		//keyboard shortcut on page..
		action.sendKeys(Keys.ENTER).perform();
		
		
		
       
	}

}
