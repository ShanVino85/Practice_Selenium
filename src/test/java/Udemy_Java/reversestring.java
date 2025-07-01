package Udemy_Java;

public class reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Vinothini";
		String t="";
		for(int i=str.length();i<=0;i--) {
			
			//System.out.println(str.charAt(i));
			
			t=t+str.charAt(i);
			System.out.println(t);
			
		}

	}

}
