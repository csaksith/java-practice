
public class Dice {
	// store die1 and die2 values
	private Die die1;
	private Die die2;

	// constructor to create die1 and die 2
	public Dice() {
		die1 = new Die();
		die2 = new Die();
	}

	// roll dice
	public void roll() {
		die1.roll();
		die2.roll();
	}

	// get die1 value
	public int getDie1Value() {
		return die1.getValue();
	}

	// get die2 value
	public int getDie2Value() {
		return die2.getValue();
	}

	// get sum of die1 and die2
	public int getSum() {
		return getDie1Value() + getDie2Value();
	}

	// print result of the roll
	public void printRoll() {
		int die1Val = getDie1Value();
		int die2Val = getDie2Value();
		int sum = getSum();

		System.out.println("Die 1: " + die1Val);
		System.out.println("Die 2: " + die2Val);
		System.out.println("Total: " + sum);

		if (sum == 7) {
			System.out.println("Craps!");
		} else if (die1Val == 1 && die2Val == 1) {
			System.out.println("Snake Eyes!");
		} else if (die1Val == 6 && die2Val == 6) {
			System.out.println("Box Cars!");
		}

	}

}
