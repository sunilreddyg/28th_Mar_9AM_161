package framework_testng;

import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import java.lang.reflect.Method;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class TestNg_WithExtentReports
{
  
  ExtentReports extent;
  ExtentTest reporter;
  WebDriver driver;
  String filepath="C:\\Users\\Administrator\\git\\28th_Mar_9AM_161\\Project_161\\reports\\TestngTest.html";
  String Exp_title="Selenium - Web Browser Automation";
  
  @Test
  public void tc001_VerifyHomepage()
  {
	  	Assert.assertEquals(driver.getTitle(), Exp_title);
	  	reporter.log(LogStatus.PASS, "Expected title presented at browser");
	    
  }
  
  
  @Test
  public void tc002_Verify_Downloadpage()
  {
	  
	  	//Click Downloads link
	  	WebElement Downloads_link=driver.findElement(By.xpath("//a[@title='Get Selenium']"));
	  	Downloads_link.click();
	  	Assert.assertEquals(driver.getTitle(), "Downloads");
	  	reporter.log(LogStatus.PASS, "downloads title presented");
	
  }
  
  
  
  
  
  @BeforeMethod
  public void beforemethod(Method method)
  {
	  //method.getName()  --->Return next constructed or invoke method name
	  reporter=extent.startTest(method.getName());
	  
  }
 
  
  @AfterMethod
  public void AfterTest()
  {
	 extent.endTest(reporter);
  }
  
  @BeforeClass
  public void beforeClass() 
  {
	  driver=new ChromeDriver();
	  driver.get("http://seleniumhq.org");
	  driver.manage().window().maximize();
	  
	  //Create Extent Reports
	  extent=new ExtentReports(filepath, true);
  }

  @AfterClass
  public void afterClass() throws InterruptedException 
  {
	  Thread.sleep(5000);
	  driver.close();
	  extent.flush();
  }

}
