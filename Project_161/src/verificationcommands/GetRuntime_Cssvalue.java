package verificationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRuntime_Cssvalue {

	public static void main(String[] args) 
	{
		//Browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		
		
		//Identify Roundtrip radio button
		WebElement Roundtrip_radio_btn=driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']"));
		Roundtrip_radio_btn.click();
		
		WebElement Roundtrip_label=driver.findElement(By.xpath("//label[@for='ctl00_mainContent_rbtnl_Trip_1']"));
		String Element_color=Roundtrip_label.getCssValue("color");
		
		String Exp_color="rgba(255, 0, 0, 1)";
		
		//Verify Expected Element color change to RED
		if(Element_color.equals(Exp_color))
			System.out.println("Color match Roundtrip selected");
		else
			System.out.println("Color mismatch roundtrip not selected");
		
	}

}
