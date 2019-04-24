package variables;

public class DataTypes 
{
	public static void main(String[] args)
	{
		
		/*
		 * int:--> Numeric datatype
		 * 		   And default value is 0
		 * 
		 */
		int a=100;
		int b=200;
		
		int c=a+b;
		System.out.println("Total value is => "+c);
		
		
		/*
		 * boolean:--> boolean accept true/false
		 * 			   And default value is  false.
		 */
		boolean flag=true;
		System.out.println("boolean value is => "+flag);
		
		
		
		/*
		 * String:--> Allow set of characters to store.
		 * 			  And default value is null.
		 */
		String name="Mindq";
		String email="info.dsnr@gmail.com";
		String mobile="9030248855";
		
		System.out.println(name+"    "+email+"   "+mobile);

	}

}
