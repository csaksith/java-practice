import java.util.Scanner;

public class DiceRollerWithClassesApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		Dice dice = new Dice();
		System.out.println("Welcome to the Dice Roller!");
		while (choice.equalsIgnoreCase("y")) {
			dice.roll();
			dice.printRoll();
			System.out.println("Roll again? (y/n): ");
			choice = sc.next();
		}
		System.out.println("Goodbye!");
		sc.close();
	}

}
