import java.util.Scanner;

public class MarkRangeGradeSystem {

	public static void main(String[] args) {

		Scanner scanner =  new Scanner(System.in);
		System.out.println("Enter grade");
		char grade = scanner.next().charAt(0);
		switch (grade) {
		case 'A':
			System.out.println("Your percentage is between 85 - 100");
			break;

		case 'B':
			System.out.println("Your percentage is between 75 - 84");
			break;

		case 'C':
			System.out.println("Your percentage is between 65 - 74");
			break;

		case 'D':
			System.out.println("Your percentage is between 55 - 64");
			break;

		case 'E':
			System.out.println("Your percentage is between 35 - 54");
			break;

		default:
			System.out.println("Your percentage is below 35");
			break;
		}

	}

}
