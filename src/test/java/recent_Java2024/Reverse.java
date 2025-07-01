package recent_Java2024;

public class Reverse {

	public static void main(String[] args) {
		String s= "Selenium"; 
		int len=s.length();
		System.out.println(s.length());
		String rev="";
		//String is immutable,so we can not reverse.
		//1.for loop 
		for(int i=len-1;i>=0;i--) 
		 {
          rev=rev+s.charAt(i);
	    }
		System.out.println(rev);
		
		//2.Stringbuffer
		//using string buffer we can reverse the string ,because is mutable.
		 
		StringBuffer sf=new StringBuffer(s);
		System.out.println(sf.reverse());
		
		//=============================================================================================
		//Remove Junk character
		String s2="@@!!!@@@ hi%^ hello&* Welcome%%$$##";
		s2=s2.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s2);
		//=======================================================================================
		long l=12345;
		long revnu=0;
		while(l!=0) {
			revnu=revnu*10+l%10; //543
			l=l/10;  //12
			System.out.println(revnu);
		}
		System.out.println(revnu);
}
}
