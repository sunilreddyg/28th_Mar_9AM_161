package verificationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runtime_url {

	public static void main(String[] args) 
	{
		
		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("http://seleniumhq.org");
		driver.manage().window().maximize();
		
		//Store Expected url
		String exp_url="https://www.seleniumhq.org/";
			
		//Capture runtime url
		String Runtime_url=driver.getCurrentUrl();

		//Verify expected and runtime url
		if(Runtime_url.contains(exp_url))
		{
			System.out.println("Expected url found for homepage");
			
			//Identify Element
			WebElement Downlaod_tab=driver.findElement(By.xpath("//a[contains(.,'Download')]"));
			Downlaod_tab.click();
			
			String DownloadPage_url="download/";
			//Capture Runtime url
			if(driver.getCurrentUrl().contains(DownloadPage_url))
				System.out.println("As expected download page url presented");
			else
				System.out.println("Downlod page url not found");
		}
		else
		{
			System.out.println("Homepage url mismatch");
		}
		
	}

}
