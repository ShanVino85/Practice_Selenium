package test_java2025;

public class Interview_practice {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		//-------------------------Palindrome Number--------------------------
/* int ori_num=1234321;
 //int num=ori_num;
 int rever_num=Reverse(ori_num);
  
 if(ori_num==rever_num) 
 {
	 System.out.println("palindrome number");
 }
	 else 
	 {
		 System.out.println("it is not a palindrome number");
	 
	 }
	}
	
	 public static int Reverse( int ori_num ) {
		  int rev=0;
		 while(ori_num!=0)
				  {
			 rev=rev*10+ori_num%10;  // 0+4  40+3  430+2 4320+1
			 ori_num=ori_num/10;  //123  12  1 0
			 }
		 return rev;
	 }*/
		
	//--------------------------------Palindrome String-------------------------------------------------------------	
	  
	/*	
		String str="MADAM";
		String reverse=Reverse( str);
		
		 if(reverse.equals(str)) 
		 {
			 System.out.println("palindrome String");
		 }
			 else 
			 {
				 System.out.println("it is not a palindrome String");
			 
			 }
	}
		
		public static String Reverse(String str) {
			
			String vow="";
			int length=str.length();
			
			for(int i=length-1;i>=0;i--) {
				vow=vow+str.charAt(i);
			}
			 return vow;
		
		
	*/

	//--------------------------------Sum of array-------------------------------------------------------------------
	
		/*int arr[]= {10,20,30,40};
		int sum=0;
		for(int i=0;i<=arr.length-1;i++) {
			sum=sum+arr[i];
			}
		System.out.println("sum of array :" +sum);*/
	//---------------------------------------Swap Number-----------------------------------------------------------------	
		/*int a=2;
		int b=4;
		
		a=a*b;
		b=a/b;
		a=a/b;
		
		System.out.println(a);
		System.out.println(b);*/
		//------------------------------Reverse Number----------------------------------------------------------------------
		int num= 1234;
		int reverse=reverse(num);
		
		System.out.println(reverse);
		
	}
		public static int reverse(int num)
		{
			int fact=0;
		
		while(num!=0)
		{
			fact=fact*10+num%10;
			num=num/10;
		}
			return num;	
		}
		
}
