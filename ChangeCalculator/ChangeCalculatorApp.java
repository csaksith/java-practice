import java.util.Scanner;

public class ChangeCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Change Calculator!\n");

		// user input number of cents
		// quarter
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("Enter number of cents (0-99): ");
			int cents = sc.nextInt();
			int qtrs = cents / 25;
			int remainder1 = cents % 25;
			int dimes = remainder1 / 10;
			int remainder2 = remainder1 % 10;
			int nickels = remainder2 / 5;
			int pennies = remainder2 % 5;
			System.out.println("Quarters: " + qtrs);
			System.out.println("Dimes: " + dimes);
			System.out.println("Nickels: " + nickels);
			System.out.println("Pennies: " + pennies);
			System.out.print("\nContinue? (y/n): ");
			choice = sc.next();
		}
		System.out.println("\nBye!");
	}

}
