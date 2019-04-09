package browser_launch;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch_Firefox_Browser {

	public static void main(String[] args) 
	{
		
		/*
		 * download geckodriver
		 * 
		 * 			=> https://github.com/mozilla/geckodriver/releases
		 * 			=> select suitable version for firefox
		 * 					firefox version    :--> 65 >
		 * 					geckodriver version:--> v0.24.0
		 * 			=> After download unzip file to project folder..
		 * 			=> Before launch browser set runtime variable to geckodriver
		 */
		
		
		
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		FirefoxDriver firefox=new FirefoxDriver();
		firefox.get("http://seleniumhq.org");

	}

}
