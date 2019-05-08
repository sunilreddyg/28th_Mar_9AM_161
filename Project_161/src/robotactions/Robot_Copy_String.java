package robotactions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class Robot_Copy_String {

	public static void main(String[] args) throws IOException, InterruptedException, AWTException 
	{
		
		//launch notepad file by executing command at runtime
		Runtime.getRuntime().exec("notepad.exe");
		Thread.sleep(5000);
		
		//Store text into variable
		String text="Selenium automates browsers. That's it! What you do with that power is entirely up to you";

		//Copy String
		StringSelection Stext=new StringSelection(text);
		//Get default system clipbord
		Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
		//Using Runtime clipboard copy text.
		clipboard.setContents(Stext, Stext);
		
		//Create object for robot class
		Robot robot=new Robot();
		robot.setAutoDelay(500);  //Time in ms.
		
		//use cntrl+V shortcut
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		//Release control
		robot.keyRelease(KeyEvent.VK_CONTROL);

	}

}
