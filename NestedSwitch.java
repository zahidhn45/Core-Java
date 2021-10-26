import java.util.Scanner;

public class NestedSwitch {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the name of college");
		String college = scanner.nextLine();

		System.out.println("Enter brunch");
		String brunch = scanner.nextLine();

		switch (college) {
		case "AIT":
			switch (brunch) {
			case "CS":
				System.out.println("AIT, Computer science");
				break;
			case "EEE":
				System.out.println("AIT, Electronic and communication");
				break;
			case "MECH":
				System.out.println("AIT,  Mechanical");
				break;
			case "IS":
				System.out.println("AIT, Information Science");
				break;
			default:
				System.out.println("No such brunch in AIT college");
				break;
			}
			break;
		case "VTU":
			switch (brunch) {
			case "BE":
				System.out.println("VTU, Bechlore of Engineering");
				break;
			case "M Tech":
				System.out.println("VTU, Master in technology");
				break;
			case "MBA":
				System.out.println("Master of Business Administration");
				break;
			case "BCA":
				System.out.println("Bechlore of computer Application");
				break;
			default:
				System.out.println("No such brunch in VTU ");
				break;
			}
			break;
		case "ABC":
			switch (brunch) {
			case "CHEM":
				System.out.println("ABC, Chemestry");
				break;
			case "PHY":
				System.out.println("ABC, Physics");
				break;
			case "MAT":
				System.out.println("ABC, Maths");
				break;
			case "BIO":
				System.out.println("ABC, Biology");
				break;
			case "ANT":
				System.out.println("ABC, Antropology");
				break;
			default:
				System.out.println("No such brunch in ABC college");
				break;
			}
			break;
		default:
			System.out.println("Avaiable college are only AIT, VTU, ABC. Please select only from available options.");
			break;
		}

	}

}
