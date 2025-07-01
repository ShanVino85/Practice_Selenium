package operators;

public class Logical {
	
	public static void main(String[] args) {
		// initializing variables
        int a = 10, b = 1, c = 10, d = 30;
 
        // Displaying a, b, c
//        System.out.println("Var1 = " + a);
//        System.out.println("Var2 = " + b);
//        System.out.println("Var3 = " + c);
//        System.out.println("Var4 = " + d);
        
        // using logical AND to verify
        // two constraints
        if ((a < b) && (b == c)) {
         
            System.out.println(" True Conditions");
        }
        else
            System.out.println("False conditions");
 
       
        // using logical OR to verify
        // two constraints
        if (a > b || c == d)
            System.out.println(
                "One or both + the conditions are true");
        else
            System.out.println(
                "Both the + conditions are false");
        
        
     // Using logical NOT operator
        System.out.println("!(a < b) = " + !(a < b));
        System.out.println("!(a > b) = " + !(a > b));
    }

}
