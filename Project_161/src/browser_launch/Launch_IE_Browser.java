package browser_launch;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class Launch_IE_Browser {

	public static void main(String[] args)
	{
		
		/*
		 * Download IEDriverServer.exe file
		 * 		=> https://www.seleniumhq.org/download/
		 * 		=> under The Internet Explorer Driver Server
		 * 				download latest IEDriverServer w.r.t
		 * 				operating system and Hotspot size..
		 * 		=> Set as runtime property before launch ie browser.
		 * 
		 * 		=> Browser supports  IE8,IE9,IE10,IE11 ---etc
		 * 		=> Disable all security and privacy settings..
		 */
		System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
		InternetExplorerDriver ie=new InternetExplorerDriver();
		ie.get("http://google.com");
	}

}
