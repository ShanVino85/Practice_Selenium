package practice_Tim;

public class Stringfunctions {
	

	public static void main(String[] args) {
		String Name="Vinothini";
		int no =4;
		
		//To find the length
		System.out.println(Name.length());   //9
		
		//to find the CharAt
		System.out.println(Name.charAt(4));   //t
		
		//To find the Lowercase
		String UPPERCASE="VINOTHINI";
		System.out.println(UPPERCASE.toLowerCase());   //vinothini
		
		//To find the Uppercase
		String lowercase="vinothini";
		System.out.println(lowercase.toUpperCase());   //VINOTHINI
		
		//To find Concat
		System.out.println(Name.concat("rajaram"));   //Vinothinirajaram
		
		//To find Substring
		System.out.println(Name.indexOf("n"));  //2
		
		System.out.println(Name.indexOf("vin", 2));  //0
		
		//To find substring
		System.out.println(Name.substring(2));   //nothini
		System.out.println(Name.substring(1, 3));  //in-- 1 index will come,3 rd index will not come
		
		//To find trim
		System.out.println(Name.trim());  //trim the length value
		
		//To find the equal value of the string 
		System.out.println(Name.equals("Vinothini"));   //True   whether check true or false
		
		//To find the not equal 
		System.out.println(Name.equalsIgnoreCase("VINOTHINI"));  // True  whether check true or false,is not case sensitive
		
		//To check the string is empty
		System.out.println(Name.isEmpty());// whether check empty or not
		
		//To replace existing char using given char
		System.out.println(Name.replace("i"," I"));  //VInothInI
		System.out.println(Name.replace("Vino","Ram"));//Ramthini
		
		
		//Convert the datatype to String
		System.out.println(String.valueOf(no));
		
		//returns a joined string with given delimiter
		System.out.println(String.join("-", "Java","is","cool"));   //Java-is-cool
		System.out.println(String.join("/", "11","08","1985"));
		
		//Split the words
		String words="I am a cool tester";  // another way --> "I,am,a,cool,tester"
		String[] sentence=words.split(" ");   // ","
		for(String string:sentence) {
		  System.out.println(string);
		}
		
		}

}
