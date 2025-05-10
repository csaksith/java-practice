import java.util.Random;
import java.util.Scanner;

public class GuessingGameApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Guess the Number Game!");
		System.out.println("+++++++++++++++++++++++++++++++++++++");

		// random number method (answer)
		// user input guess
		// if guess is higher than answer -> Too high
		// if guess is more than 10 higher -> way too high
		String choice = "y";
		Scanner sc = new Scanner(System.in);
		while (choice.equalsIgnoreCase("y")) {
			Random random = new Random();
			int answer = random.nextInt();
			System.out.println("I'm thinking of a number from 1 to 100.\nTry to guess it.");
			System.out.print("Enter number: ");
			int guess = sc.nextInt();
			int diff = answer - guess;
			while (diff != 0) {

			}
			// while loop for guess
			// take difference of guess and answer
			// if diff <10 -> too high
			// if diff >=10 -> way too high
			// if diff <-10 -> too low
			// if diff >=-10 -> way too low
			// if diff = 0 -> correct!
			// count guess
			// if guess <=3 -> great work
			// if guess >3 and <=7 -> Not too bad
			// if guess >7 -> what took you so long
			System.out.print("Continue? (y/n): ");
			choice = sc.next();
		}
		System.out.println("\nGoodbye!");
	}

}
