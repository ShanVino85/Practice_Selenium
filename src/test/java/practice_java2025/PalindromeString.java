package practice_java2025;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "selenium";
		String reversed =str;
		
		String rev="";
		int length=str.length();
		
		 for(int i=length-1;i>=0;i--)
		 {
			 rev=rev+str.charAt(i);
		 }
		 System.out.println(rev);
	
	if(reversed.equals(rev)) 
	{
		 System.out.println("It is a palindrome String");
	}
	else 
	{
		 System.out.println("It is not a palindrome String");
	}

}
}