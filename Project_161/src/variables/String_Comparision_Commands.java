package variables;

public class String_Comparision_Commands 
{

	public static void main(String[] args) 
	{
		
		/*
		 * String:--> 
		 * 			=> String allow set of characters
		 * 			=> String is a non-primitive datatype and also
		 * 				called as CLASS. Because string contains set of
		 * 				events to validate stored characters..
		 */
		
		
		/*
		 * Equals:-->
		 * 			method verify equal comparision between any two strings		
		 * 			and return boolean value true/false.
		 */
		String Exp_result="Account Created";
		String Act_result="account created";
		
		boolean flag=Act_result.equals(Exp_result);
		System.out.println("Equal comparision is => "+flag);
		
		
		/*
		 * EqualIgnorecase:-->
		 * 			method verify equal comparision between two strings by
		 * 			ignoring casesensitive  and return boolean value true/false.
		 */
		boolean flag1=Act_result.equalsIgnoreCase(Exp_result);
		System.out.println("Equalingorecase comparision is => "+flag1);
		
		
		/*
		 * Contains:-->
		 * 			method Verify sub string available at main String
		 * 			and return boolean value true/false.
		 */
		String Status="Account 100 Created successfull";
		boolean flag2=Status.contains("100");
		System.out.println("Sub string available status is => "+flag2);
		
		
		
		/*
		 * length:-->
		 * 		method return number of characters available at string 
		 */
		String mobile="9030248855";
		int len=mobile.length();
		System.out.println("Mobile number length is => "+len);
		

		/*
		 * trim:-->
		 * 		method trim extra spaces with in string
		 */
		String pincode="     5150076    ";
		System.out.println("pincode length before trim =>  "+pincode.length());
		//Perform trim method
		String New_pincode=pincode.trim();
		System.out.println("Pincode length after trim => "+New_pincode.length());
		
		
		/*
		 * subString:-->
		 * 			method get sub string from main string
		 */
		String Account_number="10212457854214578";
		String Last_Number=Account_number.substring(11);
		System.out.println("Last six digit numbers are => "+Last_Number);
		String Middle_number=Account_number.substring(5, 11);
		System.out.println("Middle digit numbers are => "+Middle_number);
		
		
		/*
		 * Startswith:-->
		 * 			Method verify required string available with expected
		 * 			characters and return boolean value true/false
		 */
		String IFSC_Code="HDFC000012";
		boolean flag3=IFSC_Code.startsWith("HDFC");
		System.out.println("Status for Start with  => "+flag3);
		
		/*
		 * isempty:-->
		 * 			Method verify string empty status and return true/false
		 */
		String var="";
		String var1="Hello";
		System.out.println("Var empty status is => "+var.isEmpty());
		System.out.println("Var1 empty status is => "+var1.isEmpty());
		
		
		
		
	}

}
