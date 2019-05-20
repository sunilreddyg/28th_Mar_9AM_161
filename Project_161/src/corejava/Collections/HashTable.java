package corejava.Collections;

import java.util.Hashtable;
import java.util.Set;

public class HashTable 
{

	public static void main(String[] args) 
	{
		
		/*
		 *  Hashtable:-->
		 *  		=> Hashtable is sorted list of set.
		 *  		=> Hashtable allow pair values to store..
		 */
		
		Hashtable<Integer, String> hash = new Hashtable<Integer,String>();
		hash.put(1, "WD");
		hash.put(2, "IDE");
		hash.put(3, "RC");
		hash.put(4, "GRID");
		hash.put(5, "APPIUM");
		//We use put method to add object to hashtable using keyname and value..
		
		
		
		
		//Get any object value using keyname..
		String value=hash.get(3);
		System.out.println(value);
		
		
		
		//Get all keys
		Set<Integer> set=hash.keySet();
		//Write iteration for number of objects in set
		for (Integer eachkey : set) 
		{
			//Get Each pair object value using keyname
			String toolname=hash.get(eachkey);
			System.out.println(toolname);
		}
		
		
		
		

	}

}
