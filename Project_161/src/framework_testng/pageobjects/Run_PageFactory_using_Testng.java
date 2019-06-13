package framework_testng.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Run_PageFactory_using_Testng 
{
	WebDriver driver;
	FB_Signup Signup;
	String url="http://facebook.com";
	
	@Test
	public void Create_Account()
	{
		String Fname=Signup.IP_firstname;
		String Lname=Signup.IP_Surname;
		String email_or_mobile=Signup.IP_Email_or_mobile;
		Signup.User_SignUp(Fname, Lname, email_or_mobile);
	}

	
	@BeforeClass
	public void Browser_initiation()
	{
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		Signup=new FB_Signup(driver);
	}
	
}
