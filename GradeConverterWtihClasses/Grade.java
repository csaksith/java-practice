
public class Grade {
	int number;
	String letter;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getLetter() {
		if (number >= 88 && number <= 100) {
			return "A";
		} else if (number >= 80 && number <= 87) {
			return "B";
		} else if (number >= 67 && number <= 79) {
			return "C";
		} else if (number >= 60 && number <= 66) {
			return "D";
		} else {
			return "F";
		}
	}

// constructor that accepts no parameters and set the initial value of the number instance variable to 0
	public Grade() {
		number = 0;
	}

	public Grade(int number) {
		this.number = number;
	}
}
