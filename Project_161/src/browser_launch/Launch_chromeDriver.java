package browser_launch;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_chromeDriver {

	public static void main(String[] args) 
	{
		/*
		 * Download Chromedriver.exe 
		 * 
		 * 		=> https://www.seleniumhq.org/download/
		 * 		=> Under thirdpary drivers and plugins click
		 * 				on google-chromedriver link
		 * 		=> Select suitable version and download w.r.t OS
		 */
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeDriver chrome=new ChromeDriver();
		chrome.get("http://google.com");
	

	}

}
