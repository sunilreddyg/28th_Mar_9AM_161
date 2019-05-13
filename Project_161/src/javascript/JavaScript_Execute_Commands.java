package javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_Execute_Commands 
{

	public static void main(String[] args)
	{
		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		//Enable javascript executor on automation browser
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		//IDentify Editbox and type text into editbox using javascript.
		js.executeScript("document.getElementById('u_0_j').value='Arjun'");
		//IDentify Editbox and type text into editbox using javascript.		
		js.executeScript("document.getElementById('u_0_l').value='Krishna'");
		
		
		//Write javascript executor using xpath locator
		WebElement UserEmail=driver.findElement(By.xpath("//input[@name='reg_email__']"));
		js.executeScript("arguments[0].value='ArjunKrishna@gmail.com'", UserEmail);
		
		
		
	}

}
