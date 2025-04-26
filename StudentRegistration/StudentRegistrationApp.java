import java.util.Scanner;

public class StudentRegistrationApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Student Registration Form");
		System.out.print("\nEnter first name: ");
		String firstName = sc.nextLine();
		System.out.print("Enter last name: ");
		String lastName = sc.nextLine();
		System.out.print("Enter year of birth: ");
		int year = sc.nextInt();
		System.out.println("\nWelcome "+firstName+" "+lastName+"!");
		System.out.println("Your registration is complete.");
		System.out.println("Your temporary password is: "+firstName+"*"+year);
	}

}
