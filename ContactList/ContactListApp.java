import java.util.Scanner;

public class ContactListApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Contact List Application!");
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			Contact contact = new Contact();
			String firstName = getString(sc, "Enter first name: ");
			String lastName = getString(sc, "Enter last name: ");
			String email = getString(sc, "Enter email: ");
			String phone = getString(sc, "Enter phone: ");
			contact.setFirstName(firstName);
			contact.setLastName(lastName);
			contact.setEmail(email);
			contact.setPhone(phone);

			System.out.println();
			System.out.println(contact.displayContact());

			choice = getYesOrNo(sc, "\nContinue? (y/n): ");

		}
		System.out.println("Goodbye!");
		sc.close();
	}

	public static String getString(Scanner sc, String prompt) {
		System.out.print(prompt);
		return sc.nextLine();
	}

	public static String getYesOrNo(Scanner sc, String prompt) {
		String input = "";
		boolean isValid = false;
		while (!isValid) {
			System.out.print(prompt);
			input = sc.nextLine().toLowerCase();
			if (input.equals("y") || input.equals("n")) {
				isValid = true;
			} else {
				System.out.println("Error! Please enter 'y' or 'n'.");
			}
		}
		return input;
	}
}
