import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			// prompt user for length and width
			double length = getDouble(sc, "Enter Length: ", 0.0, 1000000);
			double width = getDouble(sc, "Enter Width: ", 0.0, 1000000);
			// calculate area and perimeter
			double area = length * width;
			double perimeter = (length * 2) + (width * 2);
			System.out.println("Area: " + area);
			System.out.println("Perimeter: " + perimeter);
			System.out.print("Continue? (y/n): ");
			choice = sc.next();
		}
		System.out.println("Goodbye!");
	}

	public static double getDouble(Scanner sc, String prompt, double min, double max) {
		double value = 0.0;
		boolean isValid = false;

		while (!isValid) {
			System.out.print(prompt);
			if (sc.hasNextDouble()) {
				value = sc.nextDouble();
				if (value > min && value < max) {
					isValid = true;
				} else if (value <= min) {
					System.out.println("Error! Number must be greater than " + min);
				} else {
					System.out.println("Erro! Number must be less than " + max);
				}
			} else {
				System.out.println("Error! Invalid decimal value. Try again.");
				sc.next(); // clear invalid input
			}
		}
		return value;
	}

	public static int getInt(Scanner sc, String prompt, int min, int max) {
		int value = 0;
		boolean isValid = false;
		while (!isValid) {
			if (sc.hasNextInt()) {
				value = sc.nextInt();
				if (value > min && value < max) {
					isValid = true;
				} else {
					System.out.println("Error! Number must be within " + min + " and " + max);
				}
			} else {
				System.out.println("Error! Invalid integer value. Try again.");
				sc.next();
			}
		}
		return value;
	}
}
