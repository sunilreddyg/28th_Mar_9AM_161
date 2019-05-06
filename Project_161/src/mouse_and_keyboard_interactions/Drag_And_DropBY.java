package mouse_and_keyboard_interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_And_DropBY {

	public static void main(String[] args) {
		
		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hdfcbank.com/personal/car-loan-emi-calculator");
		driver.manage().window().maximize();
		
		//Enable mouse and keybaord interaction on automation browser
		Actions action=new Actions(driver);
		
		//Identify Location
		WebElement Slider=driver.findElement(By.xpath("//div[@id='js-rangeslider-0']/div[2]"));
		
		//Perform drag and drop by using coorindates
		action.dragAndDropBy(Slider,200, 0).build().perform();

	}

}
