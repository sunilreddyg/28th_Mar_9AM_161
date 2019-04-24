package variables;

public class Variable_Types 
{
	
	static int c=300;
	int b=200;
	
	public void method1()
	{
		String name="WebDriver";
		System.out.println(name);
		
		System.out.println("instant variable is => "+b);
		System.out.println("class variable is => "+c);
	}
	
	public static void method2()
	{
		//static methods accept only static varaible
		System.out.println(c);
	}

	public static void main(String args[])
	{
		//Create object for class
		Variable_Types obj=new Variable_Types();
		obj.method1();
		
	}

}
