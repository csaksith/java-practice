
public class GradeConverterApp {

	public static void main(String[] args) {
		Grade grade1 = new Grade(77);
		System.out.println("Grade 1 = " + grade1.getLetter());

		Grade grade2 = new Grade();
		grade2.setNumber(88);
		System.out.println("Grade 2 = " + grade2.getLetter());

	}

}
