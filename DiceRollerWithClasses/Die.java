
public class Die {

	// stores the current value of the die (1 to 6)
	private int value;

	// create constructor that sets value to 0
	public Die() {
		value = 0;
	}

	// rolls the die and sets the value to random number (1 to 6)
	public void roll() {
		value = (int) (Math.random() * 6) + 1;
	}

	// get the current value
	public int getValue() {
		return value;
	}

}
