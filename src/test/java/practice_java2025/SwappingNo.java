package practice_java2025;

public class SwappingNo {

	public static void main(String[] args) {
		//Swapping Number
		int a=104;
		int b=204;
		System.out.println("Before swapping" +    "a=" +a +    "b" + b);
		//using multiplication
		a=a*b;
		b=a/b;
		a=a/b;
	
		//using addition
			/*	a=a+b;
				b=a-b;
				a=a-b;*/
				
		/* using another variable
		 int t=a;
		a=b;
		b=t;*/
		System.out.println("After swapping" +   "a=" +a +    "b" + b);
		
		
	}

}
