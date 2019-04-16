package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutoComplete_Editbox 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();  		//launch browser
		driver.get("https://www.cleartrip.com");   	//load url to browser window
		driver.manage().window().maximize();  		//maximize browser window
		Thread.sleep(5000);
	
		//Select roundtrip radio button
		driver.findElement(By.id("RoundTrip")).click();
		
		//Identify origin editbox
		driver.findElement(By.name("origin")).clear();
		driver.findElement(By.name("origin")).sendKeys("HYD");
		Thread.sleep(4000);  //Static timeout to load city or airport referrals
		driver.findElement(By.linkText("Hyderabad, IN - Rajiv Gandhi International (HYD)")).click();

		
		//IDentify Destination editbox
		driver.findElement(By.name("destination")).clear();
		driver.findElement(By.name("destination")).sendKeys("JAI");
		Thread.sleep(4000);  //Static timeout to load city or airport referrals
		driver.findElement(By.linkText("Jaipur, IN - Sanganeer (JAI)")).click();
		
		
		//pick departure date fromc calendar
		driver.findElement(By.linkText("24")).click();
		Thread.sleep(3000);
	
		//Identify Return date editbox
		driver.findElement(By.id("ReturnDate")).clear();
		driver.findElement(By.id("ReturnDate")).sendKeys("Wed, 29 May, 2019");
		
		//Select Adults 
		new Select(driver.findElement(By.id("Adults")))
		.selectByVisibleText("2");
		
		//Click More option link
		driver.findElement(By.partialLinkText(" Class of travel, Airline preference")).click();
		
		//Select Airline from autocomplete editbox
		driver.findElement(By.id("AirlineAutocomplete")).clear();
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("vistara");
		Thread.sleep(4000);  //Static timeout to load city or airport referrals
		driver.findElement(By.linkText("Vistara (UK)")).click();
		
		//click signin button
		driver.findElement(By.id("SearchBtn")).click();
		
		
		
		
		
		
	}

}
