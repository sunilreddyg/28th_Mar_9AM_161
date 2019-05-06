package mouse_and_keyboard_interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_And_Drop {

	public static void main(String[] args)
	{
		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		
		//Identify frame at htmlsource and switch to it
		WebElement Demo_Frame=driver.findElement(By.className("demo-frame"));
		//Switch to Frame
		driver.switchTo().frame(Demo_Frame);
		
		
		WebElement Src=driver.findElement(By.xpath("//div[contains(@id,'draggable')]"));
		WebElement Dst=driver.findElement(By.xpath("//div[@id='droppable']"));
		
		//Enable mouse and keybaord interaction on automation browser
		Actions action=new Actions(driver);
		action.dragAndDrop(Src, Dst).perform();
		
		
		/*
		 * Using mouse commands perform drag and drop
		 * 		action.clickAndHold(Src)
		 *		.moveToElement(Dst)
		 *		.release(Src).build().perform();
		 */
		
		
		//verify background color of Element
		String Bg_color=Dst.getCssValue("background-color");
		
		//Verify background color matches with expected color
		if(Bg_color.equals("rgba(255, 250, 144, 1)"))
			System.out.println("color match drag and drop successfull");
		else
			System.out.println("color mismatch");

	}

}
