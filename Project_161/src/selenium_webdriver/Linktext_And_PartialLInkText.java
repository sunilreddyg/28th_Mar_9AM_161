package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linktext_And_PartialLInkText {

	public static void main(String[] args) 
	{
		//browser initiation 
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();  		//launch browser
		driver.get("http://www.cleartrip.com");   	//load url to browser window
		driver.manage().window().maximize();  		//maximize browser window
		
						
		/*
		 * Identify link using original linkname
		 *   <a href="/about" title="About Us">About Us</a>
		 */
		driver.findElement(By.linkText("About Us")).click();
		
		
		//Identify link using original linkname
		driver.findElement(By.linkText("Jobs")).click();
		
		
		//Identify link using original linkname
		driver.findElement(By.linkText("Job Openings")).click();
		
		
		/*
		 * Identify link with partial linkname.
		 * 	
		 * 	<a href="https://www.cleartrip.com/jobs/openings/process-trainer-2/">
		 *		<strong>Process Trainer</strong>
		 *		<span class="location">Mumbai</span>
		 *	</a>
		 *
		 *	Note:--> In above html source link name available in two
		 *			diff nodes.In this case we need to use partial linktext
		 *			to target element.
		 *
		 */
		driver.findElement(By.partialLinkText("Process Trainer")).click();
	}

}
