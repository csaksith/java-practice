import java.text.NumberFormat;
import java.util.Scanner;

public class InterestCalcApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Interest Calculator!\n");
		Scanner sc = new Scanner(System.in);
		// while choice = "y"
		// user input loan amount
		// user input interest rate in decimals

		// output loan amount in monetary format
		// output interest rate in percent
		// out interest cost in monetary format
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("Enter loan amount: ");
			double loanAmt = sc.nextDouble();
			System.out.print("Enter interest rate: ");
			double intRate = sc.nextDouble();
			NumberFormat currency = NumberFormat.getCurrencyInstance();
			System.out.println("\nLoan amount: " + currency.format(loanAmt));
			NumberFormat percent = NumberFormat.getPercentInstance();
			percent.setMaximumFractionDigits(3);
			System.out.println("Interest rate: " + percent.format(intRate));
			double intAmt = loanAmt * intRate;
			System.out.println("Interest: " + currency.format(intAmt));
			System.out.print("\nContinue? (y/n): ");
			choice = sc.next();

		}
		System.out.println("Goodbye!");

	}

}
