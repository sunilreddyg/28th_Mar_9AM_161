package switch_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Frame_Using_WebElement_referral {

	public static void main(String[] args) throws Exception {
		
		//browser initiation 
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();  		//launch browser
		driver.get("https://www.redbus.in/hotels/"); //load url to browser window
		driver.manage().window().maximize();  		//maximize browser window
		
		
		WebElement Signin_btn=driver.findElement(By.xpath("//button[contains(.,'Sign in')]"));
		Signin_btn.click();
		
		
		//Switch to frame using webelemnet referral
		WebElement FrameElement=driver.findElement(By.xpath("//iframe[@class='modalIframe']"));
		driver.switchTo().frame(FrameElement);
		
		//identify elemnet under frame
		WebElement Email_OR_Mobile=driver.findElement(By.xpath("//input[@id='mobileNoInp']"));
		Email_OR_Mobile.clear();
		Email_OR_Mobile.sendKeys("9030248855");
		
		Thread.sleep(5000);   //Hold execution for 5 seconds
		
		
		//switch controls back to mainpage
		driver.switchTo().defaultContent();
		
		//Close Frame window 
		WebElement Frame_Window_Close_btn=driver.findElement(By.xpath("(//div[@title='close'])[3]"));
		Frame_Window_Close_btn.click();
		
		
		
		
		
		
		
		
		
		
		
				

	}

}
