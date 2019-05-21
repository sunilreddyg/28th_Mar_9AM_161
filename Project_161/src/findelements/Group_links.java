package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Group_links {

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://paytm.com/");
		driver.manage().window().maximize();
		
		//Target Location
		WebElement Paytm_navigation_pages;
		Paytm_navigation_pages=driver.findElement(By.cssSelector("div[data-reactid='233']"));
		
		//Identify list of anchor tags under page-navigations
		List<WebElement> Nav_links;
		Nav_links=Paytm_navigation_pages.findElements(By.tagName("a"));
		
		
		//Iterate for number of links
		for (int i = 0; i < Nav_links.size(); i++) 
		{
			WebElement Eachlink=Nav_links.get(i);
			//Get Name and href of link
			String linkname=Eachlink.getText();
			String linkhref=Eachlink.getAttribute("href");
			
			System.out.println(linkname+"    "+linkhref);
			
			//click eachlink
			Eachlink.click();
			Thread.sleep(3000);
			
			//navigate back to homepage
			driver.navigate().back();
			Thread.sleep(3000);
			
			//Restore all page referrals to avoid stale-elemnet-referral-exception
			Paytm_navigation_pages=driver.findElement(By.cssSelector("div[data-reactid='233']"));
			Nav_links=Paytm_navigation_pages.findElements(By.tagName("a"));
			

		}
		

	}

}
