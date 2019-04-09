package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys_Keyboard_Example 
{

	public static void main(String[] args) 
	{
		
		//browser initiation 
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();  		//launch browser
		driver.get("http://www.facebook.com");   	//load url to browser window
		driver.manage().window().maximize();  		//maximize browser window
		
				
		driver.findElement(By.name("firstname")).clear();
		driver.findElement(By.name("firstname"))
		.sendKeys("Arjun",Keys.TAB
		  ,"Krishna",Keys.TAB
		  ,"Arjunkrishna@gmail.com",Keys.TAB
		  ,"Arjunkrishna@gmail.com",Keys.TAB
		  ,"Hello12345");
		
		
		//Select dropdown option using sendkeys command
		driver.findElement(By.id("day")).sendKeys("21");
		
		//Select dropdown option using keyboard shortcut
		driver.findElement(By.id("month"))
		.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN);
		
		//Select dropdown option using keyboard shortcut
		driver.findElement(By.id("year")).sendKeys("1990");

	}

}
