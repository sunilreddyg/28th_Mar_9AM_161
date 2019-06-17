package framework_testng.DP;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class New_InputData 
{
  @Test(dataProvider = "dp")
  public void tc001(Integer n, String s) 
  {
	  
  }

  @DataProvider
  public Object[][] dp() 
  {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
}
