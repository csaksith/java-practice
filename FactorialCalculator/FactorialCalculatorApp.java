import java.util.Scanner;

public class FactorialCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Factorial Calculator!");
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		// user input integer between 1-10
		// output the factor of input integer
		// continue?
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("Enter an integer that's greater than 0 and less than 10: ");
			int integer = sc.nextInt();
			int factorial = 1;
			for (int i = 1; i <= integer; i++) {
				factorial *= i;
			}
			System.out.println("The factorial of " + integer + " is " + factorial + ".");
			System.out.print("Continue? (y/n): ");
			choice = sc.next();
		}

		System.out.println("bye!");
	}

}
