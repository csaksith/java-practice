
public class Die {
	// declare variable
	private int value;

	// constructor
	public Die() {
		value = 0; // set the initial value of die to 0
	}

	// roll the die
	public void roll() {
		value = (int) (Math.random() * 6) + 1;
	}

	// return the result of die roll
	public int getValue() {
		return value;
	}

}
