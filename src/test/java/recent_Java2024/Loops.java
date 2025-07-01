package recent_Java2024;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 // String text="Myprogram";
	    String text=new String ("Myprogram");
	    String a="sachin";
	    String b="Tendulkar";
		System.out.println(text.length());
		System.out.println(text.toLowerCase());
		System.out.println(text.toUpperCase());
		System.out.println(a.concat("Tendulkar"));
		System.out.println(a.contains("c"));
		System.out.println(text.indexOf("p"));
		System.out.println(a+b);
		//========================================================//
		if(30>20)
		{
		    System.out.println("30 is big");
		}
		else{
		    System.out.println("20 is big") ;
		}
		//=======================================================//
		
		int time=20;
		if(time>18)
		{
		   System.out.println("good Morning") ; 
		}
		else if(18>10)
		{
		    System.out.println("good evening") ;
		}
		else 
		{
		    System.out.println("good night") ;
		}
		
		//System.out.println(text.char at (2));
	
	//====================================================================
	int day=2;
	
	switch(day)
	{
	case 1:
	System.out.println("Monday");
	break;
	case 2:
	System.out.println("Sunday") ;
	break;
	default:
    System.out.println("Invalid day");
    break;
	}
//=================================================================================
	}

}
