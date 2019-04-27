package verificationcommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Runtime_title {

	public static void main(String[] args) 
	{
		
		
		//Browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("http://seleniumhq.org");
		driver.manage().window().maximize();
		
		String Exp_title="Selenium - Web Browser Automation";
		
		//Get Runtime window title
		String Act_title=driver.getTitle();
		
		//Verify expected and actual title
		boolean flag=Act_title.equals(Exp_title);
		System.out.println("SeleniumHQ page display status is => "+flag);

		//Write single decision statement to continue on expected title presented
		if(flag==true)
		{
			System.out.println("Expected title presented");
		
		}
		else
		{
			System.out.println("Expected title not presented");
		}
		
		
	}

}
