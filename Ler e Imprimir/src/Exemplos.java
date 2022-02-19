import java.util.Scanner;

public class Exemplos {

	public static void main(String[] args) {
		// to read from console
		Scanner read = new Scanner(System.in);
		System.out.println("Digit what you want: ");
		
		String userInputText;
		userInputText = read.nextLine();
		
		/*
		 * 	Int userInputInt;
		 *	userInputText = read.nextInt();
		 */
		
		System.out.println("Your input: " + userInputText);
		read.close();
	}

}
