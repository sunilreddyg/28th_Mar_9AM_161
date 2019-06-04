package method_parameters;


public class Local_Parameters 
{
	//Method without parameter
	public void print_tool()
	{
		String name="WebDriver";
		System.out.println("Tool name is => "+name);
	}
	
	
	//Method with single parameter
	public void print_tool(String toolname)
	{
		String name=toolname;
		System.out.println("Tool name is => "+name);
	}
	
	//method with multiple parameter
	public void print_tool(String toolname,double price)
	{
		String name=toolname;
		double tool_price=price;
		System.out.println("toolname is => "+name
				+"  And  tool price is => "+tool_price);
	}
	

	public static void main(String[] args) 
	{
		
		//Create object for Class
		Local_Parameters obj=new Local_Parameters();
		obj.print_tool();
		
		//Method calling with single argument
		obj.print_tool("RC");
		obj.print_tool("WD");
		obj.print_tool("GRID");
		
		
		//Method Calling with multiple arguments
		obj.print_tool("IDE", 1000.00);
		
	}

}
