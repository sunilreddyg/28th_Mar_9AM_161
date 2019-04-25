package variables.Global;

public class Run_Helper {

	public static void main(String[] args) throws InterruptedException 
	{
		
		
		//Create object for Helper class
		Helper obj=new Helper();
		//Set Runtime value to global variable
		obj.url="http://outlook.com";
		obj.launch_browser();
		
		obj.navigate_to_login_page();
		
		//Set Runtime value to username
		obj.email="sunilreddy.gajjala@outlook.com";
		obj.email_validation();
		
		
		
		

	}

}
