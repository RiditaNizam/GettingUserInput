import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// TEXT
		System.out.println("Enter a name and press Enter");
		// Wait for the user to enter a line of text
		String line = input.nextLine();
		System.out.println("You entered: " + line);

		// WHOLE NUMBER
		System.out.println("Enter a whole number and press Enter");
		int wholeNumber = input.nextInt();
		System.out.println("You entered: " + wholeNumber);

		// DECIMAL
		System.out.println("Enter a double value and press Enter");
		double doubleNumber = input.nextDouble();
		System.out.println("You entered: " + doubleNumber);

		// DO-WHILE LOOP
		double value = 3.14;
		do {
			System.out.println("What is pi to the hundreths value?");
			value = input.nextDouble();
		} while (value != 3.14);
		System.out.println("Correct!");
	}
}
