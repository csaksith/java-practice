import java.util.Scanner;

public class CommonDivisorCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Greatest Common Divisor Finder!\n");

		// user input first number and second number
		// subtract second number from first number
		// do until first number is less than second number
		// then swap
		// subtract second number from first number
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int x = sc.nextInt();
		System.out.print("Enter second number: ");
		int y = sc.nextInt();
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			while (x != y) {
				if (x > y) {
					x = x - y;
				} else {
					y = y - x;
				}
			}
			System.out.println("Greatest common divisor: " + y);
			System.out.print("\nContinue? (y/n): ");
			choice = sc.next();
		}
		System.out.println("Goodbye!");
	}

}
