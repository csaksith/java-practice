import java.util.Scanner;

public class ContactListApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		System.out.println("Welcome to the Contact List App!\n");

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

			System.out.println(contact.displayContact());
			choice = getYesOrNo(sc, "\nContinue? (y/n): ");
		}
		System.out.println("\nGoodbye!");
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
			input = sc.nextLine();
			if (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("n")) {
				isValid = true;
			} else {
				System.out.println("Error! Input must be either 'y' or 'n'.");
			}
		}
		return input;
	}

}
