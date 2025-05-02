import java.util.Scanner;

public class TableOfPowersApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Squares and Cubes table!\n");
		// user input integer
		// while choice = "y"
		// for loop for number of iterations with int as max
		// square each iteration
		// cube each iteration
		// continue?

		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("Enter an integer: ");
			int integer = sc.nextInt();
			System.out.println("\nNumber  Squared  Cubed\n======  =======  =====");
			for (int i = 1; i <= integer; i++) {
				System.out.println(i + "\t" + i * i + "\t " + i * i * i);
			}
			System.out.print("\nContinue? (y/n): ");
			choice = sc.next();
		}
		System.out.println("\nBye!");
	}

}
