package javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_Execute_Commands 
{

	public static void main(String[] args) throws Exception
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
		
		
		//Select dropdown option using javascript..  [Option tag value attribute]
		js.executeScript("document.getElementById('day').value='8'");
		js.executeScript("document.getElementById('month').value='9'");
		js.executeScript("document.getElementById('year').value='2000'");
		Thread.sleep(3000); 
		
		//Select Radio button using javascript
		WebElement Female_radio_btn=driver.findElement(By.xpath("//input[@value='1']"));
		js.executeScript("arguments[0].checked=true", Female_radio_btn);
		Thread.sleep(3000);
		
		//Select Radio button using javascript
		WebElement male_radio_btn=driver.findElement(By.xpath("//input[@value='2']"));
		js.executeScript("arguments[0].click()", male_radio_btn);
		Thread.sleep(3000);
		
		//Identify button using webdriver
		WebElement Signup_btn=driver.findElement(By.xpath("//button[@name='websubmit']"));
		js.executeScript("arguments[0].click()", Signup_btn);
		
	}

}
