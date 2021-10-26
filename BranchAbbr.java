
public class BranchAbbr {

	public static void main(String[] args) {
		String brunch = "CS";
				
				switch (brunch) {
				case "CS":
					System.out.println("Computer Science");
					break;
				case "ECE":
					System.out.println("Electronic and Communication");
					break;
				case "MECH":
					System.out.println("Mechanical");
					break;
				case "IS":
					System.out.println("Information Science");
					break;
				default:
					System.out.println("Enter valid brunch");
					break;
				}
	}
}
