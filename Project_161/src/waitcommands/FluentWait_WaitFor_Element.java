package waitcommands;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWait_WaitFor_Element 
{

	@SuppressWarnings("deprecation")
	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	
		
		// Waiting 30 seconds for an element to be present on the page, checking
		// for its presence once every 5 seconds.
		 Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		     .withTimeout(30, TimeUnit.SECONDS)
		     .pollingEvery(5, TimeUnit.SECONDS)
		     .ignoring(NoSuchElementException.class);
		 
		 WebElement foo = wait.until
		  (new Function<WebDriver, WebElement>() 
		  {
		     public WebElement apply(WebDriver driver) 
		     {
		       return driver.findElement(By.id("mail"));
		     }
		  });
		 
		 
		 
		 foo.clear();
		 foo.sendKeys("newuser");

	}

}
