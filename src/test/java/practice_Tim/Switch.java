package practice_Tim;

public class Switch {
	
	String hero="iron man";
	public void heroornot()
	{
		switch(hero) {
		case"iron man":
			System.out.println("iron man is a superhero");
			break;
		case"shakhi man":
			System.out.println("shakhi man is a superhero");
			break;
		case "Bat man":
			System.out.println("Bat man is a superhero");
			break;
			default:
				System.out.println("no one is superhero");	
			}
	}

	public static void main(String[] args) {
		Switch h1=new Switch ();
		h1.heroornot();
	}

}
