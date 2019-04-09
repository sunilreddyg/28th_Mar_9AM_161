package corejava.diff_package;

import corejava.default_methods.ClassA;
import corejava.static_methods.ClassB;

public class Run_Methods_From_diff_package 
{

	public static void main(String[] args) 
	{
		
		//Create object for Default methods to call
		
		ClassA obj=new ClassA();
		obj.method1();
		obj.method2();
		
		//Calling Static methods
		ClassB.method3();
		ClassB.method4();
		

	}

}
