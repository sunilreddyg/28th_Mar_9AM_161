package variables;

public class String_Comparision_Commands {

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
		
	}

}
