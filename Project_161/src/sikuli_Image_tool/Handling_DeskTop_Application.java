package sikuli_Image_tool;

import org.sikuli.script.Screen;
import org.sikuli.script.SikuliException;

public class Handling_DeskTop_Application 
{

	public static void main(String[] args) throws SikuliException, Exception 
	{
		
		//file location
		String filepath="D:\\sunill\\28th_Mar-10AM-2019\\Project_161\\sikuli_screens\\";
		Thread.sleep(5000);
		
		//Create object for Screen
		Screen sikuli=new Screen();
		sikuli.doubleClick(filepath+"GTM_ICON.png");
		Thread.sleep(5000);
		
		//type text at editbox using sikuli script
		sikuli.type(filepath+"MeetingID.png", "10212457845");
		Thread.sleep(5000);
		
		//Click Join button
		sikuli.click(filepath+"MeetNow.png");
		
		
		
		
		
	}

}
