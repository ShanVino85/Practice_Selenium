package practice_java2025;

public class PalindromeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int num	= 1234;
		    int ori_num=num;
		   int reversed_num=rev(num);
		 
			
			if(ori_num==reversed_num)
			{
			    System.out.println("palindrome num");
			}
			else
			{
			    System.out.println("Not palindrome num");
			}
			
		}
		public static int rev(int num){
		    
		    int reve=0;
		    while(num!=0)
		    {
		        reve=reve*10+num%10;
		        num=num/10;
		    }
		    return reve;
		}
	}



/*
 {
	public static void main(String[] args) {
	    int num	= 1234;
	    int ori_num=num;
	   int reversed_num=rev(num);
	 
		
		if(ori_num==reversed_num)
		{
		    System.out.println("palindrome num");
		}
		else
		{
		    System.out.println("Not palindrome num");
		}
		
	}
	public static int rev(int num){
	    
	    int reve=0;
	    while(num!=0)
	    {
	        reve=reve*10+num%10;
	        num=num/10;
	    }
	    return reve;
	}
}
*/
