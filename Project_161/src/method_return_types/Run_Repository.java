package method_return_types;

public class Run_Repository {

	public static void main(String[] args)
	{
		
		//Create object for Repository
		Repository obj=new Repository();
		obj.LaunchBrowser("chrome");
		obj.load_webpage("http://facebook.com");
		obj.set_timeout(30);
		
		
		if(obj.is_title_presented("Facebook"))
			System.out.println("Title match found");
		else
			System.out.println("title found mismatch");
		
		
		if(obj.isUrl_Presented("https://www.facebook.com/"))
			System.out.println("url match found");
		else
			System.out.println("url mismatch");
		
		
		if(obj.isText_visibleAt_Webpage("Create an account"))
			System.out.println("text visible at webpage");
		else
			System.out.println("text not visible at webpge");
		
		obj.CloseAlert();  //Close alert window
		
		
	}

}
