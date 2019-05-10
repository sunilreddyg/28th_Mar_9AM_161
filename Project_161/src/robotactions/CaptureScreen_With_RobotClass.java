package robotactions;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreen_With_RobotClass 
{

	public static void main(String[] args) throws Exception
	{
		//browser initiation 
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();  		//launch browser
		driver.get("https://www.firstnaukri.com/"); //load url to browser window
		driver.manage().window().maximize();  		//maximize browser window
		
		
		//Identify search button click without enter proper details
		WebElement Search_btn=driver.findElement(By.xpath("//input[@value='Search']"));
		Search_btn.click();
		Thread.sleep(5000);   //Timeout command
		
		
		/*
		 * Example:--> Take screenshot when alert was presented
		 */
		
		//Get default screen size
		 Dimension Screen_dim=Toolkit.getDefaultToolkit().getScreenSize();
		 //Create object for Robot class
		 Robot robot=new Robot();
		 //Create Screen using above dimension
		 BufferedImage img=robot.createScreenCapture(new Rectangle(Screen_dim));
         //Locate file at System
		 File path=new File("C:\\Robot1.png");
		 //Using IO-writer access local file utilities..
		 ImageIO.write(img, "PNG", path);
		

	}

}
