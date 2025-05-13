
public class Dice {
	// create die objects from Die class
	private Die die1;
	private Die die2;

	// instantiate the Die instance variable
	public Dice() {
		die1 = new Die();
		die2 = new Die();
	}

	public int getDie1Value() {
		return die1.getValue();
	}

	public int getDie2Value() {
		return die2.getValue();
	}

	public int getSum() {
		return die1.getValue() + die2.getValue();
	}

	public void roll() {
		die1.roll();
		die2.roll();
	}

	public void printRoll() {
		int die1Val = die1.getValue();
		int die2Val = die2.getValue();
		int sum = getSum();
		System.out.println("Die 1: " + die1Val + "\nDie 2: " + die2Val + "\nTotal: " + sum);
		if (sum == 7) {
			System.out.println("Craps!");
		} else if (sum == 2) {
			System.out.println("Snake Eyes!");
		} else if (sum == 12) {
			System.out.println("Box Cars!");
		}
	}
}
