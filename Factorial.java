
public class Factorial {

	public static void main(String[] args) {

		/*int fact = 1, num = 3;
		System.out.print("Divisior of number "+num+" is ");
		for (int i = 1; i<= num; i++) {
			System.out.print(i+",  ");
			fact *= i;
		}
		System.out.println(" and the factorial is:-  "+fact);*/
		
		// using do-while
		
		int fact = 1, num = 5, i = 1;
		/*do {
			fact *= i; 
			i++;
		} while (i<=num);

		System.out.println("Factorial of " + num + " is: " + fact);
		*/
		// using while loop
		while (i<=num) {
			fact *= i; 
			i++;
		}
		System.out.println("Factorial of " + num + " is: " + fact);
	}
	

}
