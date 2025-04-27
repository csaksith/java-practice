import java.util.Scanner;

public class RectangleCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Area and Perimeter Calculator!\n");
		String choice = "y";
		Scanner sc = new Scanner(System.in);
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("Enter length: ");
			double length = sc.nextDouble();
			System.out.print("Enter width: ");
			double width = sc.nextDouble();
			double area = length * width;
			double perimeter = (2 * length) + (2 * width);
			System.out.println("Area: " + area);
			System.out.println("Perimeter: " + perimeter);
			System.out.print("\nContinue? (y/n): ");
			choice = sc.next();
		}
		System.out.println("\nGoodbye!");
	}

}
