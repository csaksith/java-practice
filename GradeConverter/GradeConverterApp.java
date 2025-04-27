import java.util.Scanner;

public class GradeConverterApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Letter Grade Converter");
		// user input for numerical grade (numGrade)
		// for loop 
			// if numGrade>=88 -> print "letter grade: A"
		// continue? 
		
		String choice = "y";
		while(choice.equalsIgnoreCase("y")) {
			String message = "Letter grade: ";
			System.out.print("\nEnter numerical grade: ");
			int numGrade = sc.nextInt();
			if (numGrade>=88) {
				String letterGrade = "A";
				System.out.println(message+letterGrade);
			}
			else if (numGrade>=80) {
				String letterGrade="B";
				System.out.println(message+letterGrade);
			}
			else if (numGrade>=67) {
				String letterGrade="C";
				System.out.println(message+letterGrade);
			}
			else if (numGrade>=60) {
				String letterGrade="D";
				System.out.println(message+letterGrade);
			}
			else {
				String letterGrade="F";
				System.out.println(message+letterGrade);
			}
			System.out.print("\nContinue? (y/n): ");
			choice =sc.next();
		}
		System.out.println("goodbye!");
	
	
	
	}

}
