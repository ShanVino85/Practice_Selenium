package test_java2025;

public class Palindrome_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=1234321;
		int original_num=num;
		int reversed_num=rev(num);
		
		
		if(original_num==reversed_num)
		{
			System.out.println("It is a palindrome number");
		}
		else 
		{
			System.out.println("It is not a palindrome number");
		}
				
	}
		public static int rev(int num) {
			
			int rev=0;
			while(num!=0) {
				rev=rev*10+num%10;
				num=num/10;
				
			}
			return rev;
		}

	

}
