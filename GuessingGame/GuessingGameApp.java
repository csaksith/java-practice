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
			int min = 1;
			int max = 100;
			int answer = random.nextInt(max - min + 1) + min;
			System.out.println("** DEBUG ** the answer is " + answer);
			System.out.println("I'm thinking of a number from 1 to 100.\nTry to guess it.");
			int guess = -1;
			int counter = 0;
			while (guess != answer) {
				System.out.print("\nEnter number: ");
				guess = sc.nextInt();
				counter++;

				int diff = guess - answer;
				if (diff == 0) {
					System.out.println("Correct! You got it in " + counter + " tries.");
					if (counter <= 3) {
						System.out.println("Great work! You are a mathematical wizard.");
					} else if (counter > 3 && counter <= 7) {
						System.out.println("Not too bad! You've got some potential");
					} else {
						System.out.println("What took you so long? Maybe you should take some lessons.");
					}
				} else if (diff > 10) {
					System.out.println("Way Too high!");
				} else if (diff > 0) {
					System.out.println("Too high!");
				} else if (diff < -10) {
					System.out.println("Way too low!");
				} else {
					System.out.println("Too low!");
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
			}
			System.out.print("\nContinue? (y/n): ");
			choice = sc.next();
		}
		System.out.println("\nGoodbye!");
	}
}