import java.text.NumberFormat;
import java.util.Scanner;

public class TipCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Tip Calculator");
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		// user input cost of meal
		// out put 15%, 20%, 25% tip amount and total amount
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("\nCost of meal: ");
			double cost = sc.nextDouble();
			for (double i = .15; i <= 0.25; i += .05) {
				double tipAmt = i * cost;
				double totalAmt = tipAmt + cost;
				NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
				NumberFormat percentFormat = NumberFormat.getPercentInstance();
				System.out.println();
				System.out.println(percentFormat.format(i));
				System.out.println("Tip amount: " + currencyFormat.format(tipAmt));
				System.out.println("Total amount: " + currencyFormat.format(totalAmt) + "\n");
			}
			System.out.print("\nContinue? (y/n): ");
			choice = sc.next();
		}

		System.out.println("\nGoodbye!");

	}

}
