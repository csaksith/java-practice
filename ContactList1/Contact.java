
public class Contact {
	String firstName;
	String lastName;
	String email;
	String phone;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String displayContact() {
		return "\n--------------------------------------------\n" + "---- Current Contact -----------------------\n"
				+ "--------------------------------------------\n" + "Name:          " + firstName + " " + lastName
				+ "\nEmail Address: " + email + "\nPhone Number:  " + phone
				+ "\n--------------------------------------------";
	}
}
