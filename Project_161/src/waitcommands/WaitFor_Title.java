package waitcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitFor_Title {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.org/");
		driver.manage().window().maximize();
		
		
		//Creating object for Explicitwait..
		WebDriverWait wait=new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.titleIs("Selenium - Web Browser Automation"));
		System.out.println("Title verified for selenium homepage");
		
		
		//Click Downlaod tab
		WebElement Downlaod_tab=driver.findElement(By.xpath("//a[@title='Get Selenium']"));
		Downlaod_tab.click();
		
		
		//Wait until expected title load at front page
		wait.until(ExpectedConditions.titleIs("Downloads"));
		System.out.println("Download page title verified");
		
		

	}

}
