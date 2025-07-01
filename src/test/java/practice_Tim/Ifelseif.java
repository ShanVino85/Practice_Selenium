package practice_Tim;

public class Ifelseif {
	
	String Kitchen="Rice";
	
	public void Cooking() {
		if(Kitchen.equals("Rice")) {
			System.out.println("Rice is in Kitchen");
		}else if(Kitchen.equals("Sambhar")) {
			System.out.println("sambhar is in Kitchen");
		}else if(Kitchen.equals("Curd")) {
			System.out.println("Curd is in the Kitchen");
		}else 
			System.out.println("Nothing in the Kitchen");
		
	}

	public static void main(String[] args) {
		Ifelseif K1=new Ifelseif();
		K1.Cooking();

	}

}
