import java.util.Scanner;

public class TempConverterApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Temperature Converter!");
		Scanner sc = new Scanner(System.in);
		// while choice = y
		// user input temp in F
		// console output temp in celsius
		// continue?
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("\nEnter degrees in Fahrenheit: ");
			double tempF = sc.nextDouble();
			double tempC = (tempF - 32.0) * (5.0 / 9.0);
			System.out.println("Degrees in Celsius: " + tempC);
			System.out.print("\nContinue? (y/n): ");
			choice = sc.next();
		}

		System.out.println(\nGoodbye!");
	}

}
