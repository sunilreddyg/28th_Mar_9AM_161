package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_Signin_Sendkeys_Example 
{

	public static void main(String[] args) throws InterruptedException 
	{
		//browser initiation 
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();  //launch browser
		driver.get("http://www.gmail.com");   //load url to browser window
		driver.manage().window().maximize();  //maximize browser window
		
		
		//Type text into email editbox and press enter with keyboard shortcut.
		driver.findElement(By.id("identifierId")).clear();
		driver.findElement(By.id("identifierId"))
		.sendKeys("qadarshan@gmail.com",Keys.ENTER);
		
		Thread.sleep(4000); //Static timegap to load password source
		
		
		//Type password and press enter with keyboard shortcut
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password"))
		.sendKeys("Hello123456"+Keys.ENTER);
		
		
	}

}
