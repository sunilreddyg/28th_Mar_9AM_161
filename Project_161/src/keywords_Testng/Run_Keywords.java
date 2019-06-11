package keywords_Testng;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import java.lang.reflect.Method;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class Run_Keywords extends Repository
{
	String browsername="chrome";
	String url="http://facebook.com";
	
	
	@Test
	public void verify_signup_link() 
	{
		Click_element(By.linkText("Sign Up"));
		Assert.assertTrue(is_title_presented("Sign up for Facebook | Facebook"));
		Reporter.log("Sign up link is verifed");
	}
	
	@Test
	public void verify_Signin_link() 
	{

		 driver.findElement(By.xpath("//a[contains(.,'Log In')]")).click();
		 Assert.assertEquals("Log in to Facebook | Facebook", driver.getTitle());
		 Reporter.log("Verified Signin link");
	}
	
	@Test
	public void verify_Messenger_link() 
	{
		
		driver.findElement(By.xpath("//a[contains(.,'Messenger')]")).click();
		Assert.assertEquals("Messenger", driver.getTitle());
		Reporter.log("Verified messenger link");
	}

	@Test
	public void verify_Games_link() 
	{
		driver.findElement(By.xpath("//a[contains(.,'Games')]")).click();
		Assert.assertEquals("Games", driver.getTitle());
		Reporter.log("Verified games link");
	}
	
	
	
	
	
	
	
	
	
	
	

  @BeforeMethod
  public void beforeMethod() 
  {
	  load_webpage(url);
  }

  @AfterMethod
  public void afterMethod(Method method)
  {
	  Capturescreen(method.getName());
  }

  @BeforeClass
  public void beforeClass() 
  {
	
	  LaunchBrowser(browsername);
	  set_timeout(30);
  }
  
  @AfterClass
  public void afterClass() throws InterruptedException
  {
	  Thread.sleep(3000);
	  driver.close();
  }

}
