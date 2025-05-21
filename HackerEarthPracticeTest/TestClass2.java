import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TestClass2 {
	public static void main(String args[]) throws Exception {
		// BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String strNum = br.readLine(); // Reading input from STDIN
		int num = Integer.parseInt(strNum);

		System.out.println(String.format("%.2f", CostOfWidgets(num))); // Writing output to STDOUT
	}

	public static double CostOfWidgets(int numWidgets) {
		// write your code here! Do not change any other part of the code
		int groupsOfThree = numWidgets * 3;
		int remainder = numWidgets % 3;

		return (groupsOfThree * 1.00) + (remainder * .65);
	}
}
