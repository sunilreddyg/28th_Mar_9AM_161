package verificationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Selected_Element_Text {

	public static void main(String[] args) throws Exception 
	{
		/*
		 * Scenario:-->  Gmail login with invalid domain-name
		 * 
		 * 		Given valid url http://gmail.com
		 * 		When enter username with invalid domain address
		 * 		And click on Next button
		 * 		Then receive Expected Error msg.
		 * 		
		 */
		
		
		//Browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		
		
		//identify location and type invalid email with wrong domain name
		WebElement Username=driver.findElement(By.id("identifierId"));
		Username.clear();
		Username.sendKeys("qadarshan@outlook.com");
		
		//Click Next button
		WebElement Next_btn=driver.findElement(By.xpath("//content[contains(.,'Next')]"));
		Next_btn.click();
		Thread.sleep(4000);
		
		
		//Identify error location
		WebElement Error_location=driver.findElement(By.xpath("//div[@class='GQ8Pzc']"));
		//Get Text at Error location
		String Runtime_ErrText=Error_location.getText();
		
		String Exp_err_text="Couldn't find your Google Account";
		
		
		//Verify text visible status
		if(!Runtime_ErrText.isEmpty())  //!--NOT
		{
			//Verify expected and actual text
			if(Runtime_ErrText.equals(Exp_err_text))
				System.out.println("Text match expected error presented");
			else
				System.out.println("Text mismatch wrong error presented");
		}
		else
		{
			System.out.println("Text not visible at front page");
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
