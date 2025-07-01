package test_java2025;

import java.util.Scanner;

public class ReverseNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		 System.out.println("Enter number:");
		 int num=sc.nextInt();
		 
		/* int rev=0;
		 while(num!=0)
		 {
			 rev=rev*10+num%10;
			 num=num/10;
		 }
System.out.println("Reverse Number:"  +rev);*/
	
	
	//method2
	StringBuffer sf=new StringBuffer(String.valueOf(num));
	StringBuffer rev=sf.reverse();
	System.out.println(rev);
	
	
	}
	//method 2
			/*StringBuffer sf=new StringBuffer(String.valueOf(num));
			StringBuffer rev=sf.reverse();
			System.out.println(rev);*/
}
