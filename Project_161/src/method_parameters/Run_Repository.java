package method_parameters;

import org.openqa.selenium.By;

public class Run_Repository {

	public static void main(String[] args) 
	{
		
		//Create object for Repository
		Repository obj=new Repository();
		obj.LaunchBrowser("chrome");
		obj.load_webpage("http://facebook.com");
		obj.set_timeout(30);
		
		//enter text into editox using xpath..
		obj.Enter_text("//input[@name='firstname']", "Arjun");
		obj.Enter_text("//input[@name='lastname']", "Krishna");
		
		//Enter text into editbox usnig By Locator class
		obj.Enter_text(By.id("u_0_o"), "Arjunkrishna@gmail.com");
		
		
		
		

	}

}
