package method_parameters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import pageobjects.FB_Signup;

public class Run_Keywords_with_pageObjects 
{

	public static void main(String[] args) 
	{
		
		//Create object for Repository
		Repository obj=new Repository();
		obj.LaunchBrowser("chrome");
		obj.load_webpage("http://facebook.com");
		obj.set_timeout(30);
		
		
		
		//Identify Pageobjects using pagefactory class
		FB_Signup signup=PageFactory.initElements(obj.driver, FB_Signup.class);
		
		//Run keyword to enter text into editbox
		obj.Enter_text(signup.firstname_EB, "Arjun");
		obj.Enter_text(signup.Surname_EB, "Hello");

	}

}
