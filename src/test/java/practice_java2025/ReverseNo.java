package practice_java2025;

import java.util.Scanner;

public class ReverseNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Scanner sc= new Scanner(System.in);
	//	System.out.println("Enter a Number :");
	//	int num=sc.nextInt();
		
		//method 1
	/*	int rev=0;
		  while(num!=0)
		  {
			  rev=rev*10+num%10;  //0+4,40+3,430+2,4320+1,rev=4321
			  num=num/10;       //123,12,1,0
			  
		  }
		System.out.println(rev);*/
		
		//method 2
		/*StringBuffer sf=new StringBuffer(String.valueOf(num));
		StringBuffer rev=sf.reverse();
		System.out.println(rev);*/
		
		//method3
		/*StringBuilder sb=new StringBuilder();
		sb.append(num);
		StringBuilder rev=sb.reverse();
		System.out.println(rev);*/
		
		int num=1234;
		int reverse=num;
		
		int rev=0;
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println(rev);
	}

}
