package method_parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Repository 
{
	public WebDriver driver;
	public WebDriverWait wait;
	
	/*
	 * Keywordname:-->  Launch diff browsers [Firefox,Chrome,IE]
	 * Author:-->
	 * CreatedOn:-->
	 * ReviewedBy:-->
	 * parametersUsed:-->
	 * LastUpdatedDate:-->
	 */
	
	public void LaunchBrowser(String browsername)
	{
		switch (browsername) 
		{
		case "firefox":
			driver=new FirefoxDriver();
			break;
			
		case "chrome":
			driver=new ChromeDriver();
			break;
			
		case "ie":
			driver=new InternetExplorerDriver();
			break;
				
		default:System.out.println("browser mismatch");
			break;
		}
	}
	
	/*
	 * Keywordname:-->  load webapplication url to browser window
	 * Author:-->
	 * CreatedOn:-->
	 * ReviewedBy:-->
	 * parametersUsed:-->
	 * LastUpdatedDate:-->
	 */
	public void load_webpage(String url)
	{
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	

	/*
	 * Keywordname:-->  set dynamic timeout [Implicit/explicit]
	 * Author:-->
	 * CreatedOn:-->
	 * ReviewedBy:-->
	 * parametersUsed:-->
	 * LastUpdatedDate:-->
	 */
	public void set_timeout(int time_in_sec)
	{
		//Implicit wait timeout
		driver.manage().timeouts().implicitlyWait(time_in_sec, TimeUnit.SECONDS);
		//Explicit wait timeout
		wait=new WebDriverWait(driver, time_in_sec);
	}

	

	/*
	 * Keywordname:-->  Enter text into editbox using xpath locator
	 * Author:-->
	 * CreatedOn:-->
	 * ReviewedBy:-->
	 * parametersUsed:-->
	 * LastUpdatedDate:-->
	 */
	public void Enter_text(String element_Xpath,String InputData)
	{
		WebElement Editbox=driver.findElement(By.xpath(element_Xpath));
		Editbox.clear();
		Editbox.sendKeys(InputData);
	}
	
	
	/*
	 * Keywordname:-->  Enter text into editbox using Locator class
	 * Author:-->
	 * CreatedOn:-->
	 * ReviewedBy:-->
	 * parametersUsed:-->
	 * LastUpdatedDate:-->
	 */
	public void Enter_text(By locator,String inputdata)
	{
		WebElement Editbox=driver.findElement(locator);
		Editbox.clear();
		Editbox.sendKeys(inputdata);
	}

	
	
	
	
	
	
	
	/*
	 * Keywordname:-->  Enter text into editbox using WebElement [Pagefactory keyword]
	 * Author:-->
	 * CreatedOn:-->
	 * ReviewedBy:-->
	 * parametersUsed:-->
	 * LastUpdatedDate:-->
	 */
	public void Enter_text(WebElement Element,String inputdata)
	{
		WebElement Editbox=wait.until(ExpectedConditions.visibilityOf(Element));
		Editbox.clear();
		Editbox.sendKeys(inputdata);
	}
	




}
