package pageobjects;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FB_Signup
{
	
	@FindBy(how=How.ID,using="u_0_j") 
	public WebElement firstname_EB;
	
	@FindBy(xpath="//input[@name='lastname']")
	public @CacheLookup WebElement Surname_EB;
	
	@FindBy(xpath = "//input[@name='reg_email__']")
	public WebElement Mobile_or_Email_EB;
	
	
	@FindBy(xpath = "//input[@aria-label='Re-enter email address']")
	public WebElement Retype_Mobile_or_email_EB;

	@FindBy(xpath = "//input[@data-type='password']")
	public WebElement password_EB;
	
	@FindBy(xpath = "//select[@id='day']")
	public WebElement DOB_Day_Dropdown;
	
	@FindBy(xpath = "//select[@id='month']")
	public WebElement DOB_Month_Dropdown;
	
	@FindBy(xpath = "//select[@id='year']")
	public WebElement DOB_Year_Dropdown;
	
	@FindBy(xpath="//form[@id='reg']/select")
	public List<WebElement> DOB_Dropdowns;
	
	/*
	 * The element is now looked up using the name attribute,
	 * and we never look it up once it has been used the first time
	 */
	@FindBy(xpath = "//button[@name='websubmit']")
	@CacheLookup  
	public WebElement SIgnup_btn;
	
	
	//Input data 
	String IP_firstname="Ajay";
	String IP_Surname="Krishna";
	String IP_Email_or_mobile="AjayKrishna@gmail.com";
	String IP_Retype_Email_or_mobile="AjayKrishna@gmail.com";
	

}
