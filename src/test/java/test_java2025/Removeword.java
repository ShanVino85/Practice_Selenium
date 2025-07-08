package test_java2025;

public class Removeword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "hello world hello java world";
        String[] words = input.split(" ");
        String result = "";

        for (int i = 0; i < words.length; i++) {
            if (!result.contains(words[i])) {
                result += words[i] + " ";
            }
        }

        System.out.println("Original: " + input);
        System.out.println("Without duplicates: " + result.trim());


	}

}
