package variables.Global;

import org.openqa.selenium.By;

public class Locators 
{
	
	public static By Signin_nav_link=By.xpath("//a[@class='linkButtonSigninHeader'][contains(.,'Sign in')]");
	public static By Signin_email_eb=By.xpath("//input[@name='loginfmt']");
	public static By Email_next_btn=By.xpath("//input[contains(@id,'idSIButton9')]");
	public static By Signin_pwd_eb=By.xpath("//input[@name='passwd']");
	public static By keep_me_signin_checkbox=By.xpath("//input[@name='KMSI']");
	public static By Signin_submit_btn=By.xpath("//input[@value='Sign in']");
}
