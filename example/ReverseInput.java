import java.util.Scanner;

public class ReverseInput {

	public static String reverseInput(String[] s) {
		String result = "";
		for (int i=0; i<NUMBER_OF_TOKENS; i++) {
			result = s[i] + " " + result;
		}
		return "Hi: "+result;
	}
	
	private static final int NUMBER_OF_TOKENS = 5;
	
	public static void main(String[] args) {
		
		String[] tokens = new String[NUMBER_OF_TOKENS];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i<NUMBER_OF_TOKENS; i++) {
			String input = scanner.next();
			tokens[i] = input;
		}
		scanner.close();
		System.out.println(reverseInput(tokens));
		
	}

}
