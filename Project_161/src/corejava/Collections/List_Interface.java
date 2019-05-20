package corejava.Collections;

import java.util.ArrayList;
import java.util.List;

public class List_Interface {

	public static void main(String[] args) 
	{
		
		/*
		 * List:--> Inorder collection of object and accept
		 * 			duplicate values to store..
		 */
		
		
		List<String> list=new ArrayList<String>();
		list.add("IDE");
		list.add("RC");
		list.add("WD");
		list.add("GRID");
		list.add("IDE");
		list.add("APPIUM");
		list.add("RPM");
		
		
		//Get count object at List Interface..
		int object_count=list.size();
		System.out.println("Collection of objects available => "+object_count);
				
				
		//Remove object from collection
		list.remove("RPM");
		
		//Verify Contains of object
		boolean flag=list.contains("APPIUM");
		System.out.println("Object Status is => "+flag);
		
		
		//Next iterator at collection of objects
		String inext=list.iterator().next();
		System.out.println("First iterator value is => "+inext);
		
		
		/*
		 * get:--> Method get any single object from list of 
		 * 			object using index number
		 * 
		 */
		String toolname=list.get(2);
		System.out.println("Toolname using index number is => "+toolname);
		
		
		
		//Iterate for all objects using For-loop
		for (int i = 0; i < list.size(); i++)
		{
			String eachobject=list.get(i);
			System.out.println(eachobject);
		}
		
		
		
		
		
		
		
		
	}

}
