package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Run_FB_SignUp_Pageobjects 
{

	public static void main(String[] args) throws InterruptedException
	{
	
		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		
		//Identify Pageobjects using pagefactory class
		FB_Signup signup=PageFactory.initElements(driver, FB_Signup.class);
		
		signup.firstname_EB.clear();
		signup.firstname_EB.sendKeys(signup.IP_firstname);
		
		signup.Surname_EB.clear();
		signup.Surname_EB.sendKeys(signup.IP_Surname);
		
		signup.Mobile_or_Email_EB.clear();
		signup.Mobile_or_Email_EB.sendKeys(signup.IP_Email_or_mobile);

		signup.Retype_Mobile_or_email_EB.clear();
		signup.Retype_Mobile_or_email_EB.sendKeys(signup.IP_Retype_Email_or_mobile);
		
		
		
		Thread.sleep(5000);
		
		signup.Surname_EB.clear();
		signup.Surname_EB.sendKeys("Hello");
		
		
	}

}
