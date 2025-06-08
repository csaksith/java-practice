import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = Integer.toString(n);
		if (n == Integer.parseInt(s)) {
			System.out.println("Good job");
		} else {
			System.out.println("Wrong answer");
		}
	}

}
