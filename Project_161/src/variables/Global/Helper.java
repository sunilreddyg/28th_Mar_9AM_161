package variables.Global;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Helper 
{
	
	public WebDriver driver;
	public String url;
	public String email;
	
	public void launch_browser()
	{
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	
	public void navigate_to_login_page()
	{
		driver.findElement(Locators.Signin_nav_link).click();
	}
	
	public void email_validation() throws InterruptedException
	{
		WebElement Username=driver.findElement(Locators.Signin_email_eb);
		Username.clear();
		Username.sendKeys(email);
		
		WebElement Next_btn=driver.findElement(Locators.Email_next_btn);
		Next_btn.click();
		Thread.sleep(5000);	
	}
	
	
	
	
	

}
