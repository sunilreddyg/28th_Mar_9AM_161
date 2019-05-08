package switch_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_ActiveElement {

	public static void main(String[] args) throws InterruptedException
	{
	
		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("https://cleartrip.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		WebElement Origin_Editbox=driver.findElement(By.xpath("//input[@name='origin']"));
		Origin_Editbox.clear();
		Origin_Editbox.sendKeys("HYD");
		Thread.sleep(5000);
		
		//Switch to active element
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
			
}

}
