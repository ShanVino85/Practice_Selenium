package practice;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=1234;
		int original_num=num;
		int rev_num=rev(num);
		
		if(original_num==rev_num) 
			{
			    System.out.println("palindrome num");
			}
			else
			{
			    System.out.println("Not palindrome num");
			}
			
		
	}	
		public static int rev(int num) 
		{
			int reve=0;
			while(num!=0) 
			{
				reve=reve*10+num%10;
				num=num/10;
				}
			return reve;
			//System.out.println(reve);
		}

	
}



