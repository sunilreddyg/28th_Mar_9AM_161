package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Selection {

	public static void main(String[] args) {
		
		//browser initiation 
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();  		//launch browser
		driver.get("http://www.facebook.com");   	//load url to browser window
		driver.manage().window().maximize();  		//maximize browser window
		
			
		new Select(driver.findElement(By.id("day")))
		.selectByVisibleText("21");
		
		
		new Select(driver.findElement(By.id("month")))
		.selectByVisibleText("May");
		
		System.out.println("Dropdown selected");
		
		

	}

}
