import java.util.Random;
import java.util.Scanner;

public class DiceRollerApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Dice Roller\n");
		// create instance of random class
		Random r = new Random();
		// roll the dice?
		// random int for die 1
		// random int for die 2
		// sum of die 1 and die 2
		// if total = 2 -> snake eyes
		// if total = 12 -> boxcars
		Scanner sc = new Scanner(System.in);
		System.out.print("Roll the dice? (y/n): ");
		String choice = sc.next();
		while (choice.equalsIgnoreCase("y")) {
			System.out.println();
			int max = 6, min = 1;
			int die1 = r.nextInt(max - min + 1) + min;
			int die2 = r.nextInt(max - min + 1) + min;
			int sum = die1 + die2;
			System.out.println("Die 1: " + die1);
			System.out.println("Die 2: " + die2);
			System.out.println("Total: " + sum);
			if (sum == 2) {
				System.out.println("Snake eyes!");
			} else if (sum == 12) {
				System.out.println("Boxcars!");
			}
			System.out.print("\nRoll again? (y/n): ");
			choice = sc.next();
		}
		System.out.println("Goodbye!");
	}

}
