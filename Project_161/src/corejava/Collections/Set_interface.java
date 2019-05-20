package corejava.Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_interface 
{

	public static void main(String[] args) 
	{

		/*
		 * Note:--> Set allow unorder collection of objects to
		 * 			store and set avoid duplication of object.
		 */
		
		Set<String> set=new HashSet<String>();
		set.add("IDE");
		set.add("RC");
		set.add("WD");
		set.add("GRID");
		set.add("IDE");
		set.add("APPIUM");
		set.add("RPM");
		
		
		//Get count object at Set Interface..
		int object_count=set.size();
		System.out.println("Collection of objects available => "+object_count);
		
		
		//Remove object from collection
		set.remove("RPM");
		
		//Verify Contains of object
		boolean flag=set.contains("APPIUM");
		System.out.println("Object Status is => "+flag);
		
		
		//Next iterator at collection of objects
		String inext=set.iterator().next();
		System.out.println("First variable to read is => "+inext);
		
		
		//Apply foreach loop to iterate number of collection objects
		for (String eachtool : set)
		{
			System.out.println("=> "+eachtool);
			if(eachtool.contains("WD"))
			{
				System.out.println("Target found");
			}
		}
		

	}

}
