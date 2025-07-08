package practice_java2025;

public class Removeduplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*String s="Sel$eni#um";
		
		System.out.println(s.replace("$" , ""));
		System.out.println(s.replace("#", ""));*/
		
		String input="banana";
		String result="";
		
		for(int i=0;i<input.length()-1;i++)
		{
			char a=input.charAt(i);
			if(result.indexOf(a)==-1)
			{
				result=result+i;
				
			}
		}
		System.out.println("Original: " + input);
        System.out.println("Without duplicates: " + result);

	}

}
