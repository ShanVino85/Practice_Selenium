package test_java2025;

public class Palindrome_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Madam";
		String reversed=str;
		String rev="";
		
		
		int length=str.length();
		for(int i=length-1;i>=0;i--) 
		{
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);

	
	if(reversed.equals(rev))
			{
		System.out.println("Palindrome");
	}
	else {
		System.out.println("it is not a Palindrome");
	}
}
}
