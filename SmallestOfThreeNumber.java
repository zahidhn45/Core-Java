
public class SmallestOfThreeNumber {

	public static void main(String[] args) {
		
		int a = 10, b = 20, c = 5;
		
		if (a < b && a < c) {
			System.out.println("The Smallest number is:- "+a);
		} else {
			if (b < c) {
				System.out.println("The Smallest number is:- "+b);
			} else {
				System.out.println("The Smallest number is:- "+c);
			}
		}

	}

}
