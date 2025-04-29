import java.util.Scanner;

public class TravelTimeCalcApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Travel Time Calculator!!");
		// while choice = "y"
		// user input miles
		// user input miles per hour
		// convert travel time
		// get hour in int by doing miles/mph
		// get minutes by subtracting int and get double?
		// convert minutes by multiply by 60
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("\nEnter miles: ");
			double miles = sc.nextDouble();
			System.out.print("Enter miles per hour: ");
			double mph = sc.nextDouble();
			double hours = miles / mph;
			int intHours = (int) hours;
			double min = hours - intHours;
			double minutes = min * 60;
			int wholeMin = (int) minutes;
			System.out.println("\nEstimated travel time");
			System.out.println("======================");
			System.out.println("Hours: " + intHours);
			System.out.println("Minutes: " + wholeMin);
			System.out.print("\nContinue? (y/n): ");
			choice = sc.next();
		}
		System.out.println("\nGoodbye!");
	}

}
